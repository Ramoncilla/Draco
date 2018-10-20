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
public class Linea extends objetoBase {
      public objetoBase valXI;
    public objetoBase valYI;
    public objetoBase valXF;
    public objetoBase valYF;
    public objetoBase color;
    public objetoBase grosor;

    
    public Linea(Object x, Object y, Object xf, Object yf,Object col, Object gros){
        this.valXI= (objetoBase)x;
        this.valYI = (objetoBase)y;
        this.valXF= (objetoBase)x;
        this.valYF = (objetoBase)y;
        this.color = (objetoBase)col;
        this.grosor = (objetoBase)gros;
     
        
    }
}
