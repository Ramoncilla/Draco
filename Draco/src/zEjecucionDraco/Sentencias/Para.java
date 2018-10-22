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
public class Para extends baseDraco {
    
    public baseDraco  declaAsigna;
    public baseDraco condicion;
    public baseDraco asignaControl;
    public CuerpoFuncion sentencias;

    public Para(Object  declaAsigna, Object  condicion, Object  asignaControl, Object sentencias) {
        this.declaAsigna = (baseDraco)declaAsigna;
        this.condicion = (baseDraco)condicion;
        this.asignaControl = (baseDraco)asignaControl;
        this.sentencias = (CuerpoFuncion)sentencias;
    }
    
    
    
    
    
    
}
