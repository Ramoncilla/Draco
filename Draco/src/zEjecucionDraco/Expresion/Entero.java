/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import zEjecucionDraco.baseDraco;

/**
 *
 * @author Ramonella
 */
public class Entero extends baseDraco {
    
    public int valorEntero;
    
    public Entero(Object c){
        this.valorEntero= Integer.parseInt(c.toString());
    }
    
    
    
}
