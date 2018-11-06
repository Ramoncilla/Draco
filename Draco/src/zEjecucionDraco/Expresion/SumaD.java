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
public class SumaD extends elementoOperacion {

    public SumaD() {
    }
    
    
    public Valor operar(Valor v1, Valor v2){
        Valor v = new Valor();
        /*Operaciones con Bool*/
        if(esBooleano(v1) && esBooleano(v2)){
            int n1= obtenerValorEnteroBool(v1);
            int n2= obtenerValorEnteroBool(v2);
            if(n1==1 || n2 ==1){
                v.crearBooleano(Constantes.VERDADERO);
                return v;
            }
            v.crearBooleano(Constantes.FALSO);
                return v;
            
        }
        else if(esBooleano(v1) && esEntero(v2)){
             int num = obtenerValorEnteroBool(v1);
             int num2= Integer.parseInt(v2.valor.toString());
             int res= num+num2;
             v.crearEntero(res);
             return v;
        }
        else if(esBooleano(v1) && esDecimal(v2)){
            int num = obtenerValorEnteroBool(v1);
             double num2= Double.parseDouble(v2.valor.toString());
             double res= num+num2;
             v.crearDecimal(res);
             return v;
        }
        
        else if(esBooleano(v1) && esCaracter(v2)){
            String c = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(c);
             return v;
        }
        
        else if(esBooleano(v1) && esCadena(v2)){
            String c = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(c);
             return v;
        }
        
        /*Opeaciones con entero  */
        
        else if(esEntero(v1) && esBooleano(v2)){
            int num = obtenerValorEnteroBool(v2);
            int res = Integer.parseInt(v1.valor.toString())+ num;
            v.crearEntero(res);
            return v;
        }
        
        else if(esEntero(v1) && esEntero(v2)){
            int res = Integer.parseInt(v1.valor.toString())+ Integer.parseInt(v2.valor.toString());
            v.crearEntero(res);
            return v;
        }
        
        else if(esEntero(v1) && esDecimal(v2)){
           double r = obtenerEntero(v1)+ obtenerDecimal(v2);
           v.crearDecimal(r);
           return v;
           
        }
        
        else if(esEntero(v1) && esCadena(v2)){
            String cad= obtenerEntero(v1)+obtenerCadena(v2);
            v.crearCadena(cad);
            return v;
        }
        
        else if(esEntero(v1) && esCaracter(v2)){
            int res = obtenerEntero(v1)+ obtenerNumeroChar(v2);
            v.crearEntero(res);
            return v;
        }
        
        /*opeaciones con decimal */
        else if(esDecimal(v1) && esBooleano(v2)){
            
        double res = obtenerDecimal(v1)+obtenerValorEnteroBool(v2);
        v.crearDecimal(res);
        return v;
            
        }
        else if(esDecimal(v1) && esEntero(v2)){
           double res = obtenerDecimal(v1)+obtenerEntero(v2);
        v.crearDecimal(res);
        return v; 
        }
        
        else if(esDecimal(v1) && esDecimal(v2)){
            double res = obtenerDecimal(v1)+obtenerDecimal(v2);
        v.crearDecimal(res);
        return v;
        }
        
        else if(esDecimal(v1) && esCadena(v2)){
            String cad= obtenerDecimal(v1)+obtenerCadena(v2);
            v.crearCadena(cad);
            return v;
        }
        
        else if(esDecimal(v1) && esCaracter(v2)){
            double res = obtenerDecimal(v1)+obtenerNumeroChar(v2);
        v.crearDecimal(res);
        return v;
        }
        
        /*Opeaciones con cadena */
        else if(esCadena(v1) && esBooleano(v2)){
            String cad = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(cad);
            return v;   
        }
        
        else if(esCadena(v1) && esEntero(v2)){
           String cad = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(cad);
            return v; 
        }
        else if(esCadena(v1) && esDecimal(v2)){
            String cad = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(cad);
            return v;
        }
        else if(esCadena(v1) && esCadena(v2)){
            String cad = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(cad);
            return v;
        }
        else if(esCadena(v1) && esCaracter(v2)){
            String cad = v1.valor.toString()+v2.valor.toString();
            v.crearCadena(cad);
            return v;
        }
        
        /*Opeaciones con caracter*/
        else if(esCaracter(v1) && esBooleano(v2)){
            int res = obtenerNumeroChar(v1)+obtenerValorEnteroBool(v2);
            v.crearEntero(res);
            return v;
        }
        
        else if(esCaracter(v1) && esEntero(v2)){
           int res = obtenerNumeroChar(v1)+obtenerEntero(v2);
            v.crearEntero(res);
            return v; 
        }
        
        else if(esCaracter(v1) && esDecimal(v2)){
            double res = obtenerNumeroChar(v1)+obtenerDecimal(v2);
            v.crearDecimal(res);
            return v;
        }
        
        else if(esCaracter(v1) && esCadena(v2)){
           String cad= obtenerChar(v1)+obtenerCadena(v2);
           v.crearCadena(cad);
           return v;
           
        }
        
        else if(esCaracter(v1) && esCaracter(v2)){
           String cad= obtenerChar(v1)+obtenerChar(v2)+"";
           v.crearCadena(cad);
           return v;
        }
        
        erroresJS.addSemantico(0, 0, "No es posible relizar la suma con los tipos "+ v1.tipo+" con "+ v2.tipo);
        return v;
    }
    
    
    
}
