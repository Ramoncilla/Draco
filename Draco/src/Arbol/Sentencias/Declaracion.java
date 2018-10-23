/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Declaracion extends objetoBase{
    
    public String tipo;
    public List<String> variables;
    public List<objetoBase> asignaciones;
    
    
    public Declaracion (Object tipo){
        this.tipo= tipo.toString();
        this.variables= new ArrayList<>();
        this.asignaciones= new ArrayList<>();
    }
    
    
    public void insertarVar(Object v){
        this.variables.add(v.toString());
    }
    
    public void insertarAsigna(Object c){
        this.asignaciones.add((objetoBase)c);
    }
    
    
    
    
    
    /*Obtener cadena tipo y nombre de declaracion eje int a , b, c  -> int_int_int*/
    public String obtenerCadenaTipoDeclaracion(){
        
        String cad="";
        for (int i = 0; i < this.variables.size(); i++) {
          if(i == (this.variables.size()-1)){
              cad+=this.tipo;
          }else{
              cad+=this.tipo+"_";
          }
        }
        return cad;
    }
    
}
