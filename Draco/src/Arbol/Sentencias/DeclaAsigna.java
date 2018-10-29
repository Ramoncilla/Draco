/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

/**
 *
 * @author Ramonella
 */
public class DeclaAsigna {
    public String idDecla;
    public AsignaAcceso asignacion;
    
    public DeclaAsigna(Object var){
        this.idDecla= var.toString();
        this.asignacion= null;
    }
    
    public DeclaAsigna(Object var, Object d){
       this.idDecla= var.toString();
        this.asignacion= (AsignaAcceso)d; 
    }
    
    public void  addAsignacion(Object c){
        this.asignacion= (AsignaAcceso)c;
    }
    
    
    
    
    
}
