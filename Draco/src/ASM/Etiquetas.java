/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.Stack;

/**
 *
 * @author Ramonella
 */
public class Etiquetas {
    
    
    public Stack<String> etiquetas;
    
    public Etiquetas(){
        this.etiquetas= new Stack<>();
    }
    
    public void insertarEtiqueta(String et){
        this.etiquetas.push(et);
    }
    
    public String obtenerActual(){
        return this.etiquetas.peek();
    }
    
    public String eliminarActual(){
        return this.etiquetas.pop();
    }
     
}
