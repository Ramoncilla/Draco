/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Sentencias.Declaracion;
import Arbol.objetoBase;
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
    
    public Funcion(Object nom, Object tip, boolean princ, Object parametros, Object cuerpo){
        this.nombre= nom.toString();
        this.tipo= tip.toString();
        this.esPrincipal= princ;
        this.parametros= (ArrayList<Declaracion>) parametros;
        this.sentencias= (CuerpoFuncion)cuerpo;  
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        String codigo = "function $"+obtenerNombreFuncion()+"\n";
        cod.addCodigo(codigo);
        sentencias.ejecutar(cod);
        cod.addCodigo("end\n");
        return super.ejecutar(cod); //To change body of generated methods, choose Tools | Templates.
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
    
    
    
    /*============== parametros ========================*/
    private String obtenerCadenaTipoParametros(){
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
