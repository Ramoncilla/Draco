/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Generador;
import ASM.Valor;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class Division extends elementoOperacion{
     public Generador gen;
    
    public Division(Generador c){
        this.gen= c;
    }
    
    public Valor operar(Valor v1, Valor v2){
        
        Valor ret = new Valor();
        String s;
        
        /*----- Enteros  ----------*/
        if(esEntero(v1) && esDecimal(v2)){
            s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
            
        } else if(esDecimal(v1) && esEntero(v2)){
            s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                       
        }else if(esDecimal(v1) && esCaracter(v2)){
            s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                       
        }else if(esCaracter(v1) && esDecimal(v2)){
            s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                       
        }else if(esBooleano(v1) && esDecimal(v2)){
             s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                      
        }else if(esDecimal(v1) && esBooleano(v2)){
             s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                      
        }else if(esDecimal(v1) && esDecimal(v2)){
             s= dividir(v1, v2);
            ret.crearDecimal(s);
            ret.escrito= true;
            return ret;
                      
        }
        
        /*----- Enteros  ----------*/
        else if(esEntero(v1) && esCaracter(v2)){
            s= dividir(v1, v2);
            ret.crearEntero(s);
            ret.escrito= true;
            return ret;
            
        }else if(esCaracter(v1) && esEntero(v2)){
            s= dividir(v1, v2);
            ret.crearEntero(s);
            ret.escrito= true;
            return ret;
        }else if(esBooleano(v1) && esEntero(v2)){
            s= dividir(v1, v2);
            ret.crearEntero(s);
            ret.escrito= true;
            return ret;
        }else if(esEntero(v1) && esBooleano(v2)){
            s= dividir(v1, v2);
            ret.crearEntero(s);
            ret.escrito= true;
            return ret;
        }else if(esEntero(v1) && esEntero(v2)){
            s= dividir(v1, v2);
            ret.crearEntero(s);
            ret.escrito= true;
            return ret;
        }
        erroresEjecucion.addSemantico(0, 0, "Tipo no valido para realizar una division, "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
    
    
    public String dividir(Valor v1, Valor v2){
        
        if(!(v1.escrito && v2.escrito)){
             String val = v1.valor.toString()+"\n"
                + v2.valor.toString()+"\n"
                + "DIV";
           this.gen.addCodigo(val);
           return val;
       }else if((v1.escrito) && !(v2.escrito)){
            String val = v2.valor.toString()+"\n"
            + "DIV";
            this.gen.addCodigo(val);
            return val;
        }else{
            this.gen.addCodigo("DIV");
            String val = v1.valor.toString()+"\n"
                    + v2.valor.toString()+"\n"
                    + "DIV";
            return val;
        }
    } 
}
