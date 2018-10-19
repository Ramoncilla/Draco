/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class Retornar extends objetoBase{
 
    public objetoBase expresion;
    
    public Retornar(Object v){
        this.expresion= (objetoBase) v;
    }
    
    public Retornar(){
        this.expresion= new objetoBase();
    }
    
}
