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
public class Cadena extends objetoBase {
    
    public String valorCadena;
    
    
    public Cadena(Object val){
        this.valorCadena= val.toString().replace("\"", "");
    }
    
    
}
