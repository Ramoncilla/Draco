/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Sentencias.Declaracion;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Funcion extends objetoBase {
    
    public String nombre;
    public String tipo;
    public boolean esPrincipal= false;
    public List<Declaracion> parametros;
    public CuerpoFuncion sentencias;
    public String nombreLargo;
    
    public Funcion(Object nom, Object tip, boolean princ, Object parametros, Object cuerpo){
        this.nombre= nom.toString();
        this.tipo= tip.toString();
        this.esPrincipal= princ;
        this.parametros= (ArrayList<Declaracion>) parametros;
        this.sentencias= (CuerpoFuncion)cuerpo; 
        this.nombreLargo= obtenerNombreFuncion();
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        String codigo = "function $"+obtenerNombreFuncion()+"\n";
        cod.addCodigo(codigo);
        if(esPrincipal){  
         iniciarAtributos(cod, tabla, ambitos, metodo);
        }
        
        ambitos.addAmbiente(nombre);
        sentencias.ejecutar(cod, tabla, ambitos, nombre);
        ambitos.salirAmbito();
        cod.addCodigo("end\n");
        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    private void iniciarAtributos(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo){
           //iniciar Variables globales
            Simbolo temporal;
            List<Simbolo> varsGlobales = tabla.obtenerSimbolosVarGlobales();
            cod.addMensaje("Reservando memoria para las variables globales");
            cod.addCodigo("get_global 0\n");
            cod.addCodigo(varsGlobales.size()+"\n");
            cod.addCodigo("ADD\n");
            cod.addCodigo("set_global 0\n");
            for (int i = 0; i < varsGlobales.size(); i++) {
                temporal = varsGlobales.get(i);
                if(temporal.expresionAtributo!= null){
                    cod.addMensaje("Asignando "+ temporal.nombreCorto+"\n");

                       temporal.expresionAtributo.ejecutar(cod, tabla, ambitos, metodo); 
                    
                    
                }
            }
    }
    
    
    
    
    
    
    private String obtenerNombreFuncion(){
        if(this.esPrincipal){
            return "principal";
        }else{
            String cad= this.tipo+"_"+this.nombre;
            String cadPar = obtenerCadenaTipoParametros();
            if(!(cadPar.equalsIgnoreCase(""))){
                cad+="_"+cadPar;
            }
            return cad;
        } 
    }
    
    
    
    public int obtenerSizeParametros(){
        return this.parametros.size();
    }
    
    /*============== parametros ========================*/
    public String obtenerCadenaTipoParametros(){
        String cad="";
        Declaracion temp;
        for (int i = 0; i < this.parametros.size(); i++) {
            temp= this.parametros.get(i);
            if(i == (this.parametros.size()-1)){
                cad+=temp.obtenerCadenaTipoDeclaracion();
            }else{
                cad+=temp.obtenerCadenaTipoDeclaracion()+"_";
            }
        }
        return cad;
    }
    
    
   
    
    
    
}
