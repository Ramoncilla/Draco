/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

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
public class Estructura extends objetoBase {
    public String nombre;
    public List<objetoBase> variablesEdd;
    
    public Estructura(Object nom, Object vars){
        this.nombre= nom.toString();
        this.variablesEdd= (ArrayList<objetoBase>)vars;
    }
    
  
    
    
    public List<Simbolo> getSimbolos(){
       int apuntador = 0;
       Simbolo nuevo;
       objetoBase temp;
       List<Simbolo> retorno = new ArrayList<>();
        for (int i = 0; i < this.variablesEdd.size(); i++) {
            temp= this.variablesEdd.get(i);
            if(temp instanceof Declaracion){
                
                Declaracion d = (Declaracion)temp;
                Apuntador ap = new Apuntador();
                ap.valor= apuntador;
                List<Simbolo> s = d.obtenerSimbolosDecla(ap, nombre, Constantes.ATRI_ESTRUCTURA);
                apuntador = ap.valor;
                for (int j = 0; j < s.size(); j++) {
                    retorno.add(s.get(j));
                }
 
            }else if(temp instanceof DeclaArreglo){
                
            }
            
        }
        nuevo= new Simbolo();
        nuevo.setValoresVariables(nombre,Constantes.ESTRUCTURA, nombre, Constantes.NO_TIENE, Constantes.ESTRUCTURA, -1, retorno.size());
        retorno.add(nuevo);
        return retorno;
    }
    
}
