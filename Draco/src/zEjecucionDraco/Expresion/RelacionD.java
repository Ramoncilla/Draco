/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import ASM.Valor;
import Arbol.Expresion.ValidarExpresion.elementoOperacion;
import draco.Constantes;
import static draco.Draco.erroresJS;

/**
 *
 * @author Ramonella
 */
public class RelacionD extends elementoOperacion {

    public RelacionD() {

    }

    public Valor operar(Valor v1, Valor v2, String operador) {

        switch (operador) {
            case "<": {
                Valor ret = menor(v1, v2);
                return ret;
            }
            case "<=": {
                Valor ret = menorIgual(v1, v2);
                return ret;
            }

            case ">": {
                Valor ret = mayor(v1, v2);
                return ret;
            }

            case ">=": {
                Valor ret = mayorIgual(v1, v2);
                return ret;
            }

            case "==": {
                Valor ret = igualIgual(v1, v2);
                return ret;
            }

            case "!=": {
                Valor ret = distintoA(v1, v2);
                return ret;
            }
        }
        return new Valor();
    }

    /*
      private Valor igualIgual(Valor val1, Valor val2){
        
          double d1, d2;
          Valor v= new Valor();
          v.crearBooleano(Constantes.FALSO);
         //----- Operaciones con booleanos ------------
          if(esBooleano(val1) && esBooleano (val2)){
              d1= obtenerValorEnteroBool(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v;  
          }
          
          else if(esBooleano(val1) && esEntero(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esBooleano(val1) && esDecimal(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esBooleano(val1) && esCaracter(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          //Opeaciones con entero
          else if(esEntero(val1) && esBooleano(val2)){
                d1= obtenerValorEnteroBool(val2);
              d2= obtenerEntero(val1); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esEntero(val1) && esEntero(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esEntero(val1) && esBooleano(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esEntero(val1) && esCaracter(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          //OPERACIONwacon DECImal
          
           else if(esDecimal(val1) && esEntero(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esDecimal(val1) && esBooleano(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esDecimal(val1) && esDecimal(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          else if(esDecimal(val1) && esCaracter(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          //Operacions con caracter 
          
          else if(esCaracter(val1) && esEntero(val2)){
                d1= obtenerNumeroChar(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esDecimal(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esBooleano(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esCaracter(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
           else if(esCadena (val1) && esCadena(val2)){
                d1=  obtenerLongitudCadena(val1.valor.toString());
              d2=  obtenerLongitudCadena(val2.valor.toString()); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
           }
          
        erroresJS.addSemantico(0, 0, "Incompatiblidad de tipos par expreison mayor, "+val1.tipo+" y "+ val2.tipo);
        return new Valor();
    }
        
      
      
  
      
         private Valor distintoA(Valor val1, Valor val2){
          double d1, d2;
          Valor v= new Valor();
          v.crearBooleano(Constantes.FALSO);
         //----- Operaciones con booleanos ------------
          if(esBooleano(val1) && esBooleano (val2)){
              d1= obtenerValorEnteroBool(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v;  
          }
          
          else if(esBooleano(val1) && esEntero(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esBooleano(val1) && esDecimal(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esBooleano(val1) && esCaracter(val2)){
                d1= obtenerValorEnteroBool(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          //Opeaciones con entero
          else if(esEntero(val1) && esBooleano(val2)){
                d1= obtenerValorEnteroBool(val2);
              d2= obtenerEntero(val1); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esEntero(val1) && esEntero(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esEntero(val1) && esBooleano(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esEntero(val1) && esCaracter(val2)){
                d1= obtenerEntero(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          //OPERACIONwacon DECImal
          
           else if(esDecimal(val1) && esEntero(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esDecimal(val1) && esBooleano(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          else if(esDecimal(val1) && esDecimal(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          else if(esDecimal(val1) && esCaracter(val2)){
                d1= obtenerDecimal(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
          //Operacions con caracter 
          
          else if(esCaracter(val1) && esEntero(val2)){
                d1= obtenerNumeroChar(val1);
              d2= obtenerEntero(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esDecimal(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerDecimal(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esBooleano(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerValorEnteroBool(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
          
           else if(esCaracter(val1) && esCaracter(val2)){
              d1= obtenerNumeroChar(val1);
              d2= obtenerNumeroChar(val2); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
          }
           else if(esCadena (val1) && esCadena(val2)){
                d1=  obtenerLongitudCadena(val1.valor.toString());
              d2=  obtenerLongitudCadena(val2.valor.toString()); 
              if(d1==d2){
                  v.crearBooleano(Constantes.VERDADERO);
              }
              return v; 
           }
          
       erroresJS.addSemantico(0, 0, "Incompatiblidad de tipos par expreison distinto a, "+val1.tipo+" y "+ val2.tipo);
        return new Valor();
    }
        
     */
    private int obtenerLongitudCadena(String cad) {
        return cad.length();
    }

    private Valor menor(Valor val1, Valor val2) {
        /**/
        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 < n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 < n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 < n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 < n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de menor son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

    private Valor igualIgual(Valor val1, Valor val2) {
        /**/
        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 == n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 == n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 == n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 == n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esBooleano(val1) && esBooleano(val2)) {
            int n1 = obtenerValorEnteroBool(val1);
            int n2 = obtenerValorEnteroBool(val2);
            if (n1 == n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de distinto a son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

    private Valor distintoA(Valor val1, Valor val2) {
        /**/
        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 != n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 != n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 != n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 != n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esBooleano(val1) && esBooleano(val2)) {
            int n1 = obtenerValorEnteroBool(val1);
            int n2 = obtenerValorEnteroBool(val2);
            if (n1 != n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de distinto a son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

    private Valor menorIgual(Valor val1, Valor val2) {

        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 <= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 <= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 <= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 <= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de menor igual son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

    private Valor mayor(Valor val1, Valor val2) {

        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 > n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 > n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 > n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 > n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de mayor son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

    private Valor mayorIgual(Valor val1, Valor val2) {

        Valor n = new Valor();
        n.crearBooleano(Constantes.FALSO);
        if (esEntero(val1) && esEntero(val2)) {
            int n1 = obtenerEntero(val1);
            int n2 = obtenerEntero(val2);
            if (n1 >= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esDecimal(val1) && esDecimal(val2)) {
            double n1 = obtenerDecimal(val1);
            double n2 = obtenerDecimal(val2);
            if (n1 >= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCaracter(val1) && esCaracter(val2)) {
            int n1 = obtenerNumeroChar(val1);
            int n2 = obtenerNumeroChar(val2);
            if (n1 >= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        } else if (esCadena(val1) && esCadena(val2)) {
            int n1 = obtenerLongitudCadena(val1.valor.toString());
            int n2 = obtenerLongitudCadena(val2.valor.toString());
            if (n1 >= n2) {
                n.crearBooleano(Constantes.VERDADERO);
            }
            return n;
        }
        erroresJS.addSemantico(0, 0, "Para resolver una expresion, ambos operandos deben de ser del mismo tipo, y los tipos de la relacinal de mayor igual son , " + val1.tipo + " ( " + val1.valor + ") y " + val2.tipo + " (" + val2.valor + ")");
        return new Valor();
    }

}
