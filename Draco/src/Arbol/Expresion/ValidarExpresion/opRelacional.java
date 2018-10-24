/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Generador;
import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;
/**
 *
 * @author Ramonella
 */
public class opRelacional extends elementoOperacion {
    
    Generador asm;
    
    public opRelacional(Generador c){
        
        this.asm=c;
    }
    
    
             /* int int
        int double
        double int
        double double
        cadena caracter
        caracter cadena
        caracter caracter
        cadena cadena
        int caracter
        double caracter
        caracter double
        caracter int
        bool bool
        */
        
    
   public Valor menor (Valor v1, Valor v2){
         if(esEntero(v1) && esEntero(v2)){
            return  obtenerCadenaOP(v1,v2,"LT");
            
         }else if(esEntero(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esDecimal(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esCaracter(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"LT");
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LT"); 
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion menor con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
    
    
   public Valor menorIgual (Valor v1, Valor v2){
         if(esEntero(v1) && esEntero(v2)){
            return  obtenerCadenaOP(v1,v2,"LTE");
            
         }else if(esEntero(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esDecimal(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esCaracter(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE");
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"LTE"); 
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion menor igual con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
   
   
   public Valor mayor (Valor v1, Valor v2){
         if(esEntero(v1) && esEntero(v2)){
            return  obtenerCadenaOP(v1,v2,"GT");
            
         }else if(esEntero(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esDecimal(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esCaracter(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"GT");
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GT"); 
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion mayor con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
   
   
   public Valor mayorIgual (Valor v1, Valor v2){
         if(esEntero(v1) && esEntero(v2)){
            return  obtenerCadenaOP(v1,v2,"GTE");
            
         }else if(esEntero(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esDecimal(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esCaracter(v1) && esEntero(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE");
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             return  obtenerCadenaOP(v1,v2,"GTE"); 
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion mayor igual con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
   
   
   
   
   
    private Valor obtenerCadenaOP(Valor v1, Valor v2, String operador){
        String etiqV, etiqF, cod;
        nodoCondicion ret;
         etiqV= asm.getEtiqueta();
             etiqF= asm.getEtiqueta();
             cod= getCadenaValor(v1)+"\n"
                     +getCadenaValor(v2)+ "\n"
                     + operador+"\n"
                     + "BR "+etiqV+"\n"
                     + "BR_IF "+etiqF+"\n";
            ret= new nodoCondicion(cod);
            ret.addVerdadera(etiqV);
            ret.addFalsa(etiqF);
            Valor c = new Valor(Constantes.CONDICION, ret);
            return c;
    }
    
    /*
    public nodoCondicion distintoA (Valor v1, Valor v2){
        String etiqV, etiqF, cod;
        
         /* int int
        int double
        double int
        double double
        cadena caracter
        caracter cadena
        caracter caracter
        cadena cadena
        int caracter
        double caracter
        caracter double
        caracter int
        bool bool
       
        
         if(esEntero(v1) && esEntero(v2)){
             etiqV= asm.getEtiqueta();
             etiqF= asm.getEtiqueta();
             cod= getCadenaValor(v1)+"\n"
                     +getCadenaValor(v2)+ "\n"
                     + ""
             
             
             
         }else if(esEntero(v1) && esDecimal(v2)){
             
             
         }else if(esDecimal(v1) && esEntero(v2)){
             
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esEntero(v2)){
             
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             
             
         }else if(esBooleano(v1) && esBooleano(v2)){
             
             
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion distinto a con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return null;
    }
    
    
    */
    
    
    
    
    
}
