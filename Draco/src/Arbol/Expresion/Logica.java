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
public class Logica extends objetoBase {
     public objetoBase val1;
    public objetoBase val2;
    public String operador;
    
    public Logica(Object v1, Object v2, Object op){
        this.val1 = (objetoBase) v1;
        this.val2= (objetoBase)v2;
        this.operador= op.toString();
    }
}
