/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class IF  extends objetoBase{
    
    public objetoBase condicion;
    public CuerpoFuncion instrucciones;
   

  public IF(Object cond, Object instr){
      this.condicion= (objetoBase) cond;
      this.instrucciones= (CuerpoFuncion) instr;
  }    
    
    
    
}
