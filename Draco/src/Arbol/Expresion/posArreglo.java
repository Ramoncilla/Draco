/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import Arbol.objetoBase;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class posArreglo extends objetoBase {
    
    public String nombreArreglo;
    public List<objetoBase>listaPosiciones;
    
    public posArreglo(Object nom, Object pos){
        this.nombreArreglo= nom.toString();
        this.listaPosiciones= (List<objetoBase>)pos;
    }
    
}
