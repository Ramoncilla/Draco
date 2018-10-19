/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Llamada extends objetoBase {
    
    public String nombreLlamda;
    public List<objetoBase> parametros;
    
    
    public Llamada (Object nom, Object param){
        this.nombreLlamda= nom.toString();
        this.parametros= (ArrayList<objetoBase>) param;
    }
    
}
