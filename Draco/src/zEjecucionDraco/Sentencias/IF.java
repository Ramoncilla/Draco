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
public class IF {
   
    public baseDraco condicion;
    public CuerpoFuncion instrucciones;

   

  public IF(Object cond, Object instr){
      this.condicion= (baseDraco) cond;
      this.instrucciones= (CuerpoFuncion) instr;
  }  
    
}
