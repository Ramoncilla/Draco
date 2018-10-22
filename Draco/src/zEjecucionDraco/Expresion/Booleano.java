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
public class Booleano extends baseDraco{
    public String valBooleano;
    public int valEnteroBool;
    
    
    public Booleano(Object c){
        this.valBooleano= c.toString();
        if(this.valBooleano.equalsIgnoreCase("true")){
            this.valEnteroBool=1;
        }else{
            this.valEnteroBool=0;
        }
    }
    
    
}
