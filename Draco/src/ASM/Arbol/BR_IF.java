/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM.Arbol;

import ASM.baseASM;

/**
 *
 * @author Ramonella
 */
public class BR_IF  extends baseASM{
     public String etiqF;
     public String etiV;

    public BR_IF(Object etiqueta, Object c) {
        this.etiqF = etiqueta.toString();
        this.etiV= c.toString();
    }
    
}
