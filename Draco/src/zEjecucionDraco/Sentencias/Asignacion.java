/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Sentencias;

import zEjecucionDraco.baseDraco;

/**
 *
 * @author Ramonella
 */
public class Asignacion extends baseDraco {
    
    
    public String nombre;
    public baseDraco expresion;
    
    
    public Asignacion(Object nom, Object exp){
        this.nombre= nom.toString();
        this.expresion= (baseDraco)exp;
    }
    
    
            
    
}
