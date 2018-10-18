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
public class Caracter extends objetoBase{
    
    public String caracterCadena="";
    public int caracterInt;
    
    public Caracter(Object val){
       this.caracterCadena= val.toString().replace("'", "");
       this.caracterInt= caracterCadena.toString().codePointAt(0);
    }
    
}
