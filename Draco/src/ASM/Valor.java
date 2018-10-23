/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import draco.Constantes;


/**
 *
 * @author Ramonella
 */
public class Valor {
    
    public String tipo;
    public Object valor;
    
    public Valor(String tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
    public Valor(){
        this.tipo= Constantes.NULO;
        this.valor=Constantes.NULO;
    }
    
    public void crearEntero(Object val){
        this.tipo= Constantes.ENTERO;
        this.valor= val;
    }
    
     public void crearDecimal(Object val){
        this.tipo= Constantes.DECIMAL;
        this.valor= val;
    }
    
      public void crearCaracter(Object val){
        this.tipo= Constantes.CARACTER;
        this.valor= val;
    }
    
       public void crearCadena(Object val){
        this.tipo= Constantes.CADENA;
        this.valor= val;
    }
    
        public void crearBooleano(Object val){
        this.tipo= Constantes.BOOLEANO;
        this.valor= val;
    }
    
    
    
}
