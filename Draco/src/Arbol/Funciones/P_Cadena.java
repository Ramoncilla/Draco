/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class P_Cadena extends objetoBase {
    
      public objetoBase valX;
    public objetoBase valY;
    public objetoBase color;
    public objetoBase cadena;

    
    public P_Cadena(Object x, Object y, Object col, Object cad){
        this.valX= (objetoBase)x;
        this.valY = (objetoBase)y;
        this.color = (objetoBase)col;
        this.cadena= (objetoBase)cad;
        
    }
    
}
