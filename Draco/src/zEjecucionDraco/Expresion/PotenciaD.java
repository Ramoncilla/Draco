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
 * @author USER
 */
public class PotenciaD extends elementoOperacion {
    
    
      public Valor operar(Valor v1, Valor v2){
       Valor v = new Valor();

       /*operaciones con bool */
        if(esBooleano(v1) && esEntero(v2)){
             int num = obtenerValorEnteroBool(v1);
             int num2= Integer.parseInt(v2.valor.toString());
             double res= Math.pow(num, num2);
             v.crearDecimal(res);
             return v;
        }
        else if(esBooleano(v1) && esDecimal(v2)){
            int num = obtenerValorEnteroBool(v1);
             double num2= Double.parseDouble(v2.valor.toString());
             double res= Math.pow(num, num2);
             v.crearDecimal(res);
             return v;
        }
        
        else if(esBooleano(v1) && esCaracter(v2)){

            double  c=Math.pow(obtenerValorEnteroBool(v1),obtenerNumeroChar(v2));
            v.crearDecimal(c);
             return v;
        }

        /* Operaciones con entero */

         else if(esEntero(v1) && esBooleano(v2)){
            int num = obtenerValorEnteroBool(v2);
            double res = Math.pow(Integer.parseInt(v1.valor.toString()), num);
            v.crearDecimal(res);
            return v;
        }
        
        else if(esEntero(v1) && esEntero(v2)){
            double res = Math.pow(obtenerEntero(v1), obtenerEntero(v2));
            v.crearDecimal(res);
            return v;
        }
        
        else if(esEntero(v1) && esDecimal(v2)){
           double res = Math.pow(obtenerEntero(v1),obtenerDecimal(v2));
           v.crearDecimal(res);
           return v;
           
        }
        
        else if(esEntero(v1) && esCaracter(v2)){
            double res = Math.pow(obtenerEntero(v1), obtenerNumeroChar(v2));
            v.crearDecimal(res);
            return v;
        }


        /*opeaciones con decimal */
        else if(esDecimal(v1) && esBooleano(v2)){
            
        double res = Math.pow( obtenerDecimal(v1),obtenerValorEnteroBool(v2));
        v.crearDecimal(res);
        return v;
            
        }
        else if(esDecimal(v1) && esEntero(v2)){
           double res = Math.pow( obtenerDecimal(v1),obtenerEntero(v2));
        v.crearDecimal(res);
        return v; 
        }
        
        else if(esDecimal(v1) && esDecimal(v2)){
            double res = Math.pow( obtenerDecimal(v1),obtenerDecimal(v2));
        v.crearDecimal(res);
        return v;
        }

        else if(esDecimal(v1) && esCaracter(v2)){
           double res = Math.pow(obtenerDecimal(v1),obtenerNumeroChar(v2));
        v.crearDecimal(res);
        return v;
        }
        
          /*Opeaciones con caracter*/
        else if(esCaracter(v1) && esBooleano(v2)){
            double res = Math.pow(obtenerNumeroChar(v1),obtenerValorEnteroBool(v2));
            v.crearDecimal(res);
            return v;
        }
        
        else if(esCaracter(v1) && esEntero(v2)){
          double res = Math.pow(obtenerNumeroChar(v1),obtenerEntero(v2));
            v.crearDecimal(res);
            return v; 
        }
        
        else if(esCaracter(v1) && esDecimal(v2)){
            double res = Math.pow(obtenerNumeroChar(v1),obtenerDecimal(v2));
            v.crearDecimal(res);
            return v;
        }
        
        
        else if(esCaracter(v1) && esCaracter(v2)){
           double res = Math.pow(obtenerNumeroChar(v1),obtenerNumeroChar(v2));
           v.crearDecimal(res);
           return v;
        }
        erroresJS.addSemantico(0, 0, "No es posible relizar la multiplicacion con los tipos "+ v1.tipo+" con "+ v2.tipo);
        return v;
   }
}
