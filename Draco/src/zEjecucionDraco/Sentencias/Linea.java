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
public class Linea extends baseDraco {
    public baseDraco valXI;
    public baseDraco valYI;
    public baseDraco valXF;
    public baseDraco valYF;
    public baseDraco color;
    public baseDraco grosor;

    
    public Linea(Object x, Object y, Object xf, Object yf,Object col, Object gros){
        this.valXI= (baseDraco)x;
        this.valYI = (baseDraco)y;
        this.valXF= (baseDraco)x;
        this.valYF = (baseDraco)y;
        this.color = (baseDraco)col;
        this.grosor = (baseDraco)gros;
     
        
    }
    
}
