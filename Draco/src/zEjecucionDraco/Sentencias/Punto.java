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
public class Punto extends baseDraco {
    public baseDraco valX;
    public baseDraco valY;
    public baseDraco color;
    public baseDraco diametro;
    
    
    public Punto(Object x, Object y, Object col, Object dia){
        this.valX= (baseDraco)x;
        this.valY = (baseDraco)y;
        this.color = (baseDraco)col;
        this.diametro = (baseDraco)dia;
        
    }
}
