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
public class Ternario extends objetoBase {
    
    public objetoBase condicion;
    public objetoBase valor1;
    public objetoBase valor2;
    
    
    
    public Ternario(Object cond, Object v1, Object v2){
        this.condicion= (objetoBase)cond;
        this.valor1= (objetoBase)v1;
        this.valor2= (objetoBase)v2;
    }
    
    
    
}
