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
public class Not extends baseDraco {
    public baseDraco valor1;

    
    public Not(Object v1){
        this.valor1= (baseDraco)v1;
        
    }
}
