/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Apuntador;
import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.Expresion.ValidarExpresion.Suma;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.util.ArrayList;
import java.util.List;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Alina
 */
public class DeclaArreglo extends objetoBase {

    public String tipo;
    public String nombreArreglo;
    public List<objetoBase> listaPosiciones;
    public AsignaAcceso asignacion;

    public DeclaArreglo(Object t, Object nom, Object pos) {
        this.asignacion = null;
        this.tipo = t.toString();
        this.nombreArreglo = nom.toString();
        this.listaPosiciones = (List<objetoBase>) pos;
    }

    public void agregarAsigna(Object v) {
        this.asignacion = (AsignaAcceso) v;
    }

    public Simbolo obtenerSimbolo(Ambito3D ambito, Apuntador ap, String rol) {
        Simbolo s = new Simbolo();
        s.setValoresArreglo(nombreArreglo, Constantes.ARREGLO, tipo, ambito.getAmbito(), rol, ap.valor, 1, listaPosiciones.size(), listaPosiciones);
        ap.valor++;
        return s;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        Object esAtributo = tabla.esAtributo(nombreArreglo, ambitos);
        Suma sum = new Suma(cod);
        if (esAtributo != null) {
            boolean band = (boolean) esAtributo;
            int posArreglo = -1;
            String codigo = "";
            if (band) {
                posArreglo = tabla.obtenerPosAtributo(nombreArreglo, ambitos);
                if (posArreglo != -1) {
                    codigo = "//creando apuntadores para el arreglo global  " + nombreArreglo + "\n"
                            + "\n"
                            + Constantes.INICIO_HEAP + "\n"
                            + posArreglo + "\n"
                            + "ADD\n"
                            + "\n"
                            + "get_global 0\n"
                            + "set_globa $calc\n";
                } else {
                    erroresEjecucion.addSemantico(0, 0, "No existe en tabla de simbolos el arreglo " + nombreArreglo + " global, que desea declarar :S ");
                    return new elementoRetorno();
                }

            } else {
                posArreglo = tabla.obtenerPosLocal(nombreArreglo, ambitos);
                if (posArreglo != -1) {
                    codigo = "//creando apuntadores para el arreglo local  " + nombreArreglo + "\n"
                            + "\n"
                            + "get_local 0\n"
                            + posArreglo + "\n"
                            + "ADD\n"
                            + "\n"
                            + "get_global 0\n"
                            + "set_local $calc\n";
                } else {
                    erroresEjecucion.addSemantico(0, 0, "No existe en tabla de simbolos el arreglo " + nombreArreglo + " local, que desea declarar :S ");
                    return new elementoRetorno();
                }

            }
            codigo += "get_global 0\n"
                    + "\n"
                    + "get_global 0\n"
                    + "1\n"
                    + "ADD\n"
                    + "\n"
                    + "set_global $calc\n"
                    + "\n"
                    + "get_global 0\n"
                    + "1\n"
                    + "ADD\n"
                    + "set_global 0\n"
                    + "\n"
                    + "get_global 0\n"
                    + listaPosiciones.size() + "\n"
                    + "set_global $calc\n"
                    + "\n"
                    + "get_global 0\n"
                    + "1\n"
                    + "ADD\n"
                    + "set_global 0\n"
                    + "\n"
                    + "get_global 0\n"
                    + "set_global 1 // posicion donde inician las dimensiones tp/n"
                    + "//Resolviendo las dimensiones del arreglo " + nombreArreglo + "\n";

            objetoBase expTemporal;
            Valor valT;
            boolean bandera = true;
            for (int i = 0; i < listaPosiciones.size(); i++) {
                expTemporal = listaPosiciones.get(i);
                valT = expTemporal.ejecutar(cod, tabla, ambitos, metodo).valor;
                if (sum.esEntero(valT)) {
                    codigo += "//Dimension " + (i + 1) + "\n";
                    codigo += "get_global 0\n";
                    codigo += valT.valor.toString() + "\n";
                    codigo += "set_global $calc\n"
                            + "\n"
                            + "get_global 0\n"
                            + "1\n"
                            + "ADD\n"
                            + "set_global 0\n";
                } else {
                    bandera = false;
                    erroresEjecucion.addSemantico(0, 0, "No se puede declarar arreglo " + nombreArreglo + ", la dimension " + (i + 1) + ", no es de tipo entero");
                }

            }
            if (bandera) {
                String l0, l1, l2, l3, l4;
                l0 = cod.getEtiqueta();
                l1 = cod.getEtiqueta();
                l2 = cod.getEtiqueta();
                l3 = cod.getEtiqueta();
                l4 = cod.getEtiqueta();
                codigo += "get_global 1\n"
                        + "1\n"
                        + "DIFF\n"
                        + "\n"
                        + "get_global $calc \n"
                        + "set_global 2 //no de dimensiones  del arreglo tdim\n"
                        + "1\n"
                        + "set_global 3 // contador del ciclo para ingresar las  dimensiones tcont\n"
                        + "\n"
                        + l0 + ":\n"
                        + "\n"
                        + "get_global 3\n"
                        + "get_global 2\n"
                        + "LTE \n"
                        + "BR_IF " + l2 + "\n"
                        + "BR " + l1 + "\n"
                        + "\n"
                        + l1 + ":\n"
                        + "get_global 3\n"
                        + "1\n"
                        + "DIFF\n"
                        + "EQZ\n"
                        + "BR_IF " + l4 + "\n"
                        + "BR " + l3 + "\n"
                        + "\n"
                        + l3 + ":\n"
                        + "get_global 1\n"
                        + "get_global $calc\n"
                        + "\n"
                        + "1\n"
                        + "DIFF\n"
                        + "\n"
                        + "0\n"
                        + "DIFF // tRes\n"
                        + "\n"
                        + "get_global 1\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 1\n"
                        + "\n"
                        + "get_global 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 3\n"
                        + "\n"
                        + "BR "+l0+"\n"
                        + "\n"
                        + l4 + ":\n"
                        + "\n"
                        + "get_global 1\n"
                        + "get_global $calc\n"
                        + "\n"
                        + "MULT\n"
                        + "\n"
                        + "get_global 1\n"
                        + "get_global $calc\n"
                        + "1\n"
                        + "DIFF\n"
                        + "ADD\n"
                        + "0\n"
                        + "DIFF\n"
                        + "\n"
                        + "get_global 1\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 1\n"
                        + "\n"
                        + "get_global 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 3\n"
                        + "\n"
                        + "BR "+l0+"\n"
                        + "\n"
                        + l2 + ":\n"
                        + "1\n"
                        + "ADD\n"
                        + "\n"
                        + "set_global 4\n"
                        + "get_global 0\n"
                        + "get_global 4\n"
                        + "set_global $calc\n"
                        + "\n"
                        + "get_global 0\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 0\n"
                        + "\n"
                        + "get_global 0\n"
                        + "get_global 4\n"
                        + "ADD\n"
                        + "set_global 0\n";

                if (sum.esObjeto(tipo)) {
                    int size = tabla.obtenerTamanioEDD(tipo);
                    if (size != -1) {
                        String lc, lf, lv;
                        lc = cod.getEtiqueta();
                        lf = cod.getEtiqueta();
                        lv = cod.getEtiqueta();
                        codigo += "//Instanciando todas las estructuras que posee el arreglo\n"
                                + "1\n"
                                + "set_global 3\n"
                                + "\n"
                                + lc + ":\n"
                                + "get_global 3\n"
                                + "get_global 4\n"
                                + "LTE\n"
                                + "BR_IF " + lf + "\n"
                                + "BR " + lv + "\n"
                                + "\n"
                                + lv + ":\n"
                                + "get_global 1\n"
                                + "1\n"
                                + "ADD\n"
                                + "set_global 1\n"
                                + "\n"
                                + "get_global 1\n"
                                + "get_global 0\n"
                                + "set_global $calc\n"
                                + "\n"
                                + "get_global 0\n"
                                + size + "\n"
                                + "ADD\n"
                                + "set_global 0\n"
                                + "\n"
                                + "\n"
                                + "get_global 3\n"
                                + "1\n"
                                + "ADD\n"
                                + "set_global 3\n"
                                + "\n"
                                + "BR " + lc + "\n"
                                + "\n"
                                + lf + ":";
                        //inicializar arreglos si los tuviera

                    } else {
                        erroresEjecucion.addSemantico(0, 0, "Imposible declarar arreglo de tipo " + tipo + ", no existe");
                    }

                }

                cod.addCodigo(codigo + "\n");

            }

        } else {
            erroresEjecucion.addSemantico(0, 0, "No existe en tabla de simbolos el arreglo " + nombreArreglo + " global, que desea declarar :S ");
            return new elementoRetorno();
        }

        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }

}
