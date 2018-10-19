/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class Para extends objetoBase {
    
    public objetoBase declaAsigna;
    public objetoBase condicion;
    public objetoBase asignaControl;
    public CuerpoFuncion  instrucciones;
    
    
    public Para(Object decla, Object cond, Object asig, Object inst){
        this.condicion=(objetoBase) cond;
        this.instrucciones= (CuerpoFuncion) inst;
        this.declaAsigna= (objetoBase)decla;
        this.asignaControl= (objetoBase)asig;
    }
    
}
