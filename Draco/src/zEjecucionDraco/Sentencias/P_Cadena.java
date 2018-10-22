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
public class P_Cadena extends baseDraco {
      public baseDraco valX;
    public baseDraco valY;
    public baseDraco color;
    public baseDraco cadena;

    
    public P_Cadena(Object x, Object y, Object col, Object cad){
        this.valX= (baseDraco)x;
        this.valY = (baseDraco)y;
        this.color = (baseDraco)col;
        this.cadena= (baseDraco)cad;
        
    }
}
