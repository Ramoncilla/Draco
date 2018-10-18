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
public class Entero extends objetoBase{
    public String valIntCadena;
    public double valIntDouble;
    
    public Entero(Object val){
        this.valIntCadena= val.toString();
        this.valIntDouble= Double.parseDouble(valIntCadena);
    }
    
}
