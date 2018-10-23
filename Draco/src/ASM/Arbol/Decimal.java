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
public class Decimal extends baseASM{
    
    public double valor;
    
    
    public Decimal(Object c){
        this.valor = Double.parseDouble(c.toString());
    }
    
}
