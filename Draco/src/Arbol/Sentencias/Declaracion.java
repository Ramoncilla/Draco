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
 * @author Ramonella
 */
public class Declaracion extends objetoBase{
    
    public String tipo;
    /*
    public List<String> variables;
    public List<objetoBase> asignaciones;
    */
    List<DeclaAsigna> declaraciones;
    
    public Declaracion (Object tipo){
        this.tipo= tipo.toString();
        this.declaraciones= new ArrayList<>();
       /* this.variables= new ArrayList<>();
        this.asignaciones= new ArrayList<>();*/
    }
    
    
    public void addDecla(Object d){
        this.declaraciones.add((DeclaAsigna)d); 
    }
    /*
    public void insertarVar(Object v){
        this.variables.add(v.toString());
    }
    
    public void insertarAsigna(Object c){
        this.asignaciones.add((objetoBase)c);
    }
    
    */
    
    
    
    /*Obtener cadena tipo y nombre de declaracion eje int a , b, c  -> int_int_int*/
    public String obtenerCadenaTipoDeclaracion(){
        
        String cad="";
        for (int i = 0; i < this.declaraciones.size(); i++) {
            if(i == (this.declaraciones.size()-1)){
              cad+=this.tipo;
          }else{
              cad+=this.tipo+"_";
          }
        }
        return cad;
    }
    
    
    
    
   public List<Simbolo> obtenerSimbolosDecla(Apuntador apuntador, String ambito, String rolA){
      List<Simbolo> retorno= new ArrayList<>();
      Simbolo simb;
      DeclaAsigna temp;
      String nombreC;
      String tipoSimb;
      String tipoE;
      String contexto;
      String rol;
        for (int i = 0; i < this.declaraciones.size(); i++) {
            temp= declaraciones.get(i);
            simb= new Simbolo();
            nombreC= temp.idDecla;
            tipoE= this.tipo;
            tipoSimb= Constantes.VARIABLE;
            contexto= ambito;
            rol = rolA;
            simb = new Simbolo();
            //(String nombreC, String tipoSimb, String tipoE, String ambito, String rol, int apu, int size)
            simb.setValoresVariables(nombreC, tipoSimb, tipoE, contexto, rol, apuntador.valor, 1);
            simb.expresionAtributo= temp.asignacion;
            apuntador.valor++;   
            retorno.add(simb);
        }        
      return retorno;  
    }
    
    
    
    
}
