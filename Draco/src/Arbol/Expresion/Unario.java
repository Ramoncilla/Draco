/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class Unario extends objetoBase{
    public objetoBase val1;
    public String operador;
    
    
    public Unario(Object v1, Object op1){
        this.val1= (objetoBase)v1;
        this.operador= op1.toString();
    }
    
}
