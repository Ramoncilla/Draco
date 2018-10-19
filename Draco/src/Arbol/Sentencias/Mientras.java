/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Mientras extends objetoBase {
    
    public objetoBase condicion;
    public CuerpoFuncion  instrucciones;
    
    
    public Mientras(Object cond, Object inst){
        this.condicion=(objetoBase) cond;
        this.instrucciones= (CuerpoFuncion) inst;
    }
    
    
    
    
    
}
