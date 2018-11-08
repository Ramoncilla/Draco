/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Sentencias;

import java.util.ArrayList;
import java.util.List;
import zEjecucionDraco.baseDraco;

/**
 *
 * @author Ramonella
 */
public class Declaracion extends baseDraco{
    
    
    public List<DeclaAsigna> declaraciones;
    
    public Declaracion(){
        this.declaraciones= new ArrayList<>();
    }
    
    public void addDecla(Object d) {
        this.declaraciones.add((DeclaAsigna) d);
    }
    
    
    
    
    
    
}
