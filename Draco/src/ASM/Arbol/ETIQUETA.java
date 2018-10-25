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
public class ETIQUETA extends baseASM {
     public String etiqueta;

    public ETIQUETA(Object etiqueta) {
        this.etiqueta = etiqueta.toString();
    }
}
