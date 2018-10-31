/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Apuntador;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.util.ArrayList;
import java.util.List;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class Declaracion extends objetoBase {

    public String tipo;
    /*
    public List<String> variables;
    public List<objetoBase> asignaciones;
     */
    List<DeclaAsigna> declaraciones;

    public Declaracion(Object tipo) {
        this.tipo = tipo.toString();
        this.declaraciones = new ArrayList<>();
        /* this.variables= new ArrayList<>();
        this.asignaciones= new ArrayList<>();*/
    }

    public void addDecla(Object d) {
        this.declaraciones.add((DeclaAsigna) d);
    }

    /*Obtener cadena tipo y nombre de declaracion eje int a , b, c  -> int_int_int*/
    public String obtenerCadenaTipoDeclaracion() {

        String cad = "";
        for (int i = 0; i < this.declaraciones.size(); i++) {
            if (i == (this.declaraciones.size() - 1)) {
                cad += this.tipo;
            } else {
                cad += this.tipo + "_";
            }
        }
        return cad;
    }

    public List<Simbolo> obtenerSimbolosDecla(Apuntador apuntador, String ambito, String rolA) {
        List<Simbolo> retorno = new ArrayList<>();
        Simbolo simb;
        DeclaAsigna temp;
        String nombreC;
        String tipoSimb;
        String tipoE;
        String contexto;
        String rol;
        for (int i = 0; i < this.declaraciones.size(); i++) {
            temp = declaraciones.get(i);
            simb = new Simbolo();
            nombreC = temp.idDecla;
            tipoE = this.tipo;
            tipoSimb = Constantes.VARIABLE;
            contexto = ambito;
            rol = rolA;
            simb = new Simbolo();
            //(String nombreC, String tipoSimb, String tipoE, String ambito, String rol, int apu, int size)
            simb.setValoresVariables(nombreC, tipoSimb, tipoE, contexto, rol, apuntador.valor, 1);
            simb.expresionAtributo = temp.asignacion;
            apuntador.valor++;
            retorno.add(simb);
        }
        return retorno;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

        DeclaAsigna temp;
        String nombreId;
        Object esAtributo;
        boolean esObjeto = esObjeto(tipo);
        int posicion;
        int tamanio;
        for (int i = 0; i < this.declaraciones.size(); i++) {
            temp = declaraciones.get(i);
            nombreId = temp.idDecla;
            if (esObjeto) {
                esAtributo = tabla.esAtributo(nombreId, ambitos);
                if (esAtributo != null) {
                    boolean val = (boolean) esAtributo;
                    if (val) {
                        //es una variable global
                        posicion = tabla.obtenerPosAtributo(nombreId, ambitos);
                        
                        

                    } else {
                        //es una variable local
                        posicion = tabla.obtenerPosLocal(nombreId, ambitos);
                        tamanio= tabla.obtenerTamanioEDD(tipo);
                        if(tamanio!=-1){
                            String codigo= "get_local 0\n"
                                    + posicion+"\n"
                                    + "ADD \n"
                                    + "get_global 0\n"
                                    + "set_local $calc\n"
                                    + "get_global 0\n"
                                    + "get_global 0\n"
                                    + "1\n"
                                    + "ADD\n"
                                    + "set_global $calc\n"
                                    + "get_global 0\n"
                                    + "1\n"
                                    + "ADD\n"
                                    + "set_global 0\n"
                                    + "get_global 0\n"
                                    + tamanio+"\n"
                                    + "ADD\n"
                                    + "set_global 0\n";
                            cod.addMensaje("Inicializando "+ nombreId+", edd local");
                            cod.addCodigo(codigo);
                        }else{
                            erroresEjecucion.addSemantico(0, 0, "El tipo "+ tipo+", no existe, no se ha podido iniciar la estructura local");
                        }

                    }
                } else {
                    erroresEjecucion.addSemantico(0, 0, "No existe en tabla de simbolos la variable que desea declarar :S ");
                }

            } else {
                //es una variable normal 

            }

        }
        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean esObjeto(String tipo) {

        if (tipo.equalsIgnoreCase(Constantes.ENTERO)
                || tipo.equalsIgnoreCase(Constantes.CADENA)
                || tipo.equalsIgnoreCase(Constantes.CARACTER)
                || tipo.equalsIgnoreCase(Constantes.DECIMAL)
                || tipo.equalsIgnoreCase(Constantes.BOOLEANO)
                || tipo.equalsIgnoreCase(Constantes.VACIO)) {
            return false;
        }
        return true;
    }

}
