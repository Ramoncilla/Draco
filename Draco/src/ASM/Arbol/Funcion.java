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
public class Funcion {
    
    public String nombreFunc;
    public CuerpoFuncion sentencias;
    
    
    public Funcion(Object nom, Object sent){
        this.nombreFunc= nom.toString();
        this.sentencias= (CuerpoFuncion)sent;
    }
    
}
