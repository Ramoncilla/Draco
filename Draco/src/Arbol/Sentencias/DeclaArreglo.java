/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Apuntador;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import draco.Constantes;
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
     public AsignaAcceso asignacion;
     
    public DeclaArreglo(Object t, Object nom, Object pos){
        this.asignacion= null;
        this.tipo= t.toString();
        this.nombreArreglo= nom.toString();
        this.listaPosiciones= (List<objetoBase>)pos;
    }
    
    
    public void agregarAsigna(Object v){
        this.asignacion= (AsignaAcceso)v;
    }
    
    
   public Simbolo obtenerSimbolo(Ambito3D ambito, Apuntador ap, String rol){
       Simbolo s = new Simbolo();
       s.setValoresArreglo(tipo, tipo, tipo, tipo, tipo, 0, 0, 0, listaPosiciones);
       s.setValoresArreglo(nombreArreglo, Constantes.ARREGLO, tipo, ambito.getAmbito(),rol, ap.valor, 1, listaPosiciones.size(), listaPosiciones);
       ap.valor++;
       return s;
   }
    
}
