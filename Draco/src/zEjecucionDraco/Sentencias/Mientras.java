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
public class Mientras extends baseDraco {
    
    public baseDraco expresion;
    public CuerpoFuncion sentencias;

    public Mientras(Object expresion, Object sentencias) {
        this.expresion = (baseDraco)expresion;
        this.sentencias = (CuerpoFuncion) sentencias;
    }
    
    
    
}
