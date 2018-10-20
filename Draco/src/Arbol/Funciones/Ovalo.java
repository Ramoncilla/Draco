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
public class Ovalo extends objetoBase {
    
      public objetoBase valX;
    public objetoBase valY;
    public objetoBase color;
    public objetoBase ancho;
     public objetoBase alto;
    
    public Ovalo(Object x, Object y, Object col, Object ancho, Object alto){
        this.valX= (objetoBase)x;
        this.valY = (objetoBase)y;
        this.color = (objetoBase)col;
        this.ancho = (objetoBase)ancho;
        this.alto = (objetoBase) alto;
        
    }
    
    
}
