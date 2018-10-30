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
public class Identificador extends objetoBase{
    
    public String nombreId;
    
    public Identificador (Object val){
        this.nombreId= val.toString();
    }
    
    
    
    
    
}
