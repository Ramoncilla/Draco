/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import ASM.Ambito3D;
import ASM.Apuntador;
import Arbol.Funciones.Funcion;
import Arbol.Sentencias.*;
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class PrimeraPasada {
    
    public Archivo sentencias;
    public TablaSimbolos tabla;
    
    public PrimeraPasada(Archivo sentencias, TablaSimbolos t){
        this.sentencias= sentencias;
        this.tabla= t;
    }
    
    
    public void llenarTabla(){
     Ambito3D ambiente = new Ambito3D();
     ambiente.addAmbiente(Constantes.GLOBAL);
     objetoBase sentTemporal;
     Apuntador apunt = new Apuntador();
        for (int i = 0; i < sentencias.elementosArchivo.size(); i++) {
            sentTemporal= sentencias.elementosArchivo.get(i);
            analizarSentenciaGlobal(sentTemporal, ambiente, apunt);
        }
     ambiente.salirAmbito();
    }
    
    public void analizarSentenciaGlobal(objetoBase sentencia, Ambito3D ambito, Apuntador apunt){
        if(sentencia instanceof DeclaArreglo){
            DeclaArreglo ar = (DeclaArreglo)sentencia;
            Simbolo s = ar.obtenerSimbolo(ambito, apunt, Constantes.ARR_GLOBAL);
            this.tabla.insertarSimbolo(s);
            
        }else if(sentencia instanceof Declaracion){
            Declaracion decla = (Declaracion) sentencia;
            List<Simbolo> simbolosDecla = decla.obtenerSimbolosDecla(apunt, ambito.getAmbito(), Constantes.VAR_GLOBAL);
            for (int i = 0; i < simbolosDecla.size(); i++) {
                this.tabla.insertarSimbolo(simbolosDecla.get(i));
            }
            
        }else if(sentencia instanceof Estructura){
            Estructura ed = (Estructura)sentencia;
            List<Simbolo> simbolosDecla = ed.getSimbolos();
            for (int i = 0; i < simbolosDecla.size(); i++) {
                this.tabla.insertarSimbolo(simbolosDecla.get(i));
            }
            
        }else if(sentencia instanceof Funcion ){
           Funcion func = (Funcion)sentencia;
           Apuntador ap = new Apuntador();
           //parametros
            Declaracion temp;
            List<Simbolo> simbolos, simbolosFuncion;
            simbolosFuncion = new ArrayList<>();
            ambito.addAmbiente(func.nombreLargo);
            
            //Creando el simbolo del retorno de la funcion
            
            Simbolo simbFuncion = new Simbolo();
            simbFuncion.setValoresVariables(Constantes.RETORNO, Constantes.RETORNO, func.tipo, ambito.getAmbito(), Constantes.RETORNO, ap.valor, 1);
            ap.valor++;
            this.tabla.insertarSimbolo(simbFuncion);
            
            
            
            for (int i = 0; i < func.parametros.size(); i++) {
                temp= func.parametros.get(i);
                simbolos = temp.obtenerSimbolosDecla(ap, ambito.getAmbito(), Constantes.PARAMETRO);
                for (int j = 0; j < simbolos.size(); j++) {
                    simbolosFuncion.add(simbolos.get(j));
                }
            }
           //sentencias
           objetoBase temporal;
           
            for (int i = 0; i < func.sentencias.listaSentencias.size(); i++) {
                temporal = func.sentencias.listaSentencias.get(i);
                analizarSentenciaFuncion(temporal, ap, ambito, simbolosFuncion);
            }
           ambito.salirAmbito();
           
           simbFuncion = new Simbolo();
           
           simbFuncion.setValoresFuncion(func.nombreLargo, func.tipo,Constantes.FUNCION, Constantes.NO_TIENE, Constantes.VARIABLE, -1, simbolosFuncion.size(), func.obtenerSizeParametros(), func.obtenerCadenaTipoParametros(), func.nombre);
           this.tabla.insertarSimbolo(simbFuncion);
           
            for (int i = 0; i < simbolosFuncion.size(); i++) {
                this.tabla.insertarSimbolo(simbolosFuncion.get(i));
            }
        }  
    }
    
    
    
    public void analizarSentenciaFuncion(objetoBase sentencia, Apuntador ap, Ambito3D ambito, List<Simbolo> simbolos){
        
        if(sentencia instanceof DeclaArreglo){
            DeclaArreglo ar = (DeclaArreglo)sentencia;
            Simbolo s = ar.obtenerSimbolo(ambito, ap, Constantes.ARR_LOCAL);
            this.tabla.insertarSimbolo(s);
        }else if(sentencia instanceof Declaracion){
            Declaracion decla = (Declaracion) sentencia;
            List<Simbolo> simbolosDecla = decla.obtenerSimbolosDecla(ap, ambito.getAmbito(), Constantes.VARIABLE);
            for (int i = 0; i < simbolosDecla.size(); i++) {
                simbolos.add(simbolosDecla.get(i));
            }
        }else if(sentencia instanceof Estructura){
             Estructura ed = (Estructura)sentencia;
            List<Simbolo> simbolosDecla = ed.getSimbolos();
            for (int i = 0; i < simbolosDecla.size(); i++) {
                this.tabla.insertarSimbolo(simbolosDecla.get(i));
            }
        }else if(sentencia instanceof Si){
            objetoBase temp;
            Si nodoSi = (Si)sentencia;
            ambito.addSi();
            for (int i = 0; i < nodoSi.siInicial.instrucciones.listaSentencias.size(); i++) {
                temp= nodoSi.siInicial.instrucciones.listaSentencias.get(i);
                analizarSentenciaFuncion(temp, ap, ambito,simbolos);
            }
            ambito.salirAmbito();
            IF siTemporal;
            
            for (int i = 0; i < nodoSi.listaSinoSi.size(); i++) {
                siTemporal= nodoSi.listaSinoSi.get(i);
                ambito.addSi();
                for (int j = 0; j < siTemporal.instrucciones.listaSentencias.size(); j++) {
                    temp= siTemporal.instrucciones.listaSentencias.get(j);
                    analizarSentenciaFuncion(temp, ap, ambito, simbolos);
                }
                ambito.salirAmbito();
            }
            
            ambito.addSino();
            for (int i = 0; i < nodoSi.sino.listaSentencias.size(); i++) {
                temp= nodoSi.sino.listaSentencias.get(i);
                analizarSentenciaFuncion(temp, ap, ambito, simbolos);
                
            }
            ambito.salirAmbito();
            
        }else if(sentencia instanceof Mientras){
            Mientras m = (Mientras)sentencia;
            ambito.addMientras();
            objetoBase temp;
            for (int i = 0; i < m.instrucciones.listaSentencias.size(); i++) {
                temp= m.instrucciones.listaSentencias.get(i);
                analizarSentenciaFuncion(temp, ap, ambito, simbolos);
            }
            ambito.salirAmbito();
            
            
            
        }else if(sentencia instanceof Para){
            Para m = (Para)sentencia;
            ambito.addPara();
             objetoBase temp;
            for (int i = 0; i < m.instrucciones.listaSentencias.size(); i++) {
                temp= m.instrucciones.listaSentencias.get(i);
                analizarSentenciaFuncion(temp, ap, ambito, simbolos);
            }
            ambito.salirAmbito();
            
        }   
    }
    
    
    
    
    
     
    
}
