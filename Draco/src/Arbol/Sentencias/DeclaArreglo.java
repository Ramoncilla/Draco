/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alina
 */
public class DeclaArreglo extends objetoBase {
    public String tipo;
     public String nombreArreglo;
    public List<objetoBase>listaPosiciones;
     public List<objetoBase> asignaciones;
     
    public DeclaArreglo(Object t, Object nom, Object pos){
        this.asignaciones= new ArrayList<>();
        this.tipo= t.toString();
        this.nombreArreglo= nom.toString();
        this.listaPosiciones= (List<objetoBase>)pos;
    }
    
    
    public void agregarAsigna(Object v){
        this.asignaciones.add((objetoBase)v);
    }
}
