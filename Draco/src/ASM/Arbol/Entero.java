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
public class Entero extends baseASM{
     public int valor;
    
    
    public Entero(Object c){
        this.valor = Integer.parseInt(c.toString());
    }
}
