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
    
     public boolean esCondicion(Valor v){
        return v.tipo.equalsIgnoreCase(Constantes.CONDICION);
    }
    
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
         

     public boolean esObjeto(String tipo){
             return !(tipo.equalsIgnoreCase(Constantes.ENTERO) ||
                     tipo.equalsIgnoreCase(Constantes.BOOLEANO)||
                     tipo.equalsIgnoreCase(Constantes.CADENA)||
                     tipo.equalsIgnoreCase(Constantes.CARACTER)||
                     tipo.equalsIgnoreCase(Constantes.DECIMAL));
    }
}
