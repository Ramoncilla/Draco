/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Valor;
import draco.Constantes;

/**
 *
 * @author Ramonella
 */
public class elementoOperacion {
    
    
    
    public String getCadenaValor(Valor v){
        return v.valor.toString();
    }
    
    public int getEntero(Valor v){
        
        return Integer.parseInt(v.valor.toString());
    }
    
    
    public double getDecimal(Valor v){
        
        return Double.parseDouble(v.valor.toString());
    }
    
    public char getCadenaCaracter(Valor v){
        char b =  (char)Integer.parseInt(String.valueOf(v.valor));
        return b;
    }
    
    public int getEnteroCaracter(Valor v){
       return Integer.parseInt(v.valor.toString());
    }
    
    /*
    public int getEnteroBooleano( Valor v){
        
    }
    
    public String getCadenaBooleano(Valor v){
        
    }
    */
    
    
    public boolean esEntero(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.ENTERO);
    }
    
     public boolean esDecimal(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.DECIMAL);
    }
     
      public boolean esCadena(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.CADENA);
    }
      
       public boolean esCaracter(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.CARACTER);
    }
       
        public boolean esBooleano(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.BOOLEANO);
    }
        
         public boolean esEstructura(Valor v){
             return !(v.tipo.equalsIgnoreCase(Constantes.ENTERO) ||
                     v.tipo.equalsIgnoreCase(Constantes.BOOLEANO)||
                     v.tipo.equalsIgnoreCase(Constantes.CADENA)||
                     v.tipo.equalsIgnoreCase(Constantes.CARACTER)||
                     v.tipo.equalsIgnoreCase(Constantes.DECIMAL));
    }
         

    
}
