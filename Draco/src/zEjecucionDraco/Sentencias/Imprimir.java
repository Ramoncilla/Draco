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
public class Imprimir extends baseDraco{
    
    public baseDraco expresion;
    
    public Imprimir(Object v){
        this.expresion= (baseDraco) v;
    }
    
    
}
