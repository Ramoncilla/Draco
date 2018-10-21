/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.Expresion.ValidarExpresion.Suma;
import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class Aritmetica extends objetoBase{
    public objetoBase val1;
    public objetoBase val2;
    public String operador;
    
    public Aritmetica(Object v1, Object v2, Object op){
        this.val1 = (objetoBase) v1;
        this.val2= (objetoBase)v2;
        this.operador= op.toString();
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        elementoRetorno ret = new elementoRetorno();
        Suma opSumar = new Suma(cod);
        elementoRetorno v1= this.val1.ejecutar(cod);
        elementoRetorno v2 = this.val2.ejecutar(cod);
        switch(operador){
            case "+":{
                Valor res = opSumar.operar(v1.valor, v2.valor);
               // cod.addCodigo(res.valor.toString());
                ret.valor= res;
                super.retorno= ret;
                return ret;
            }
             case "-":{
                 
                break;
            }
             
              case "*":{
                  
                break;
            }
              
               case "/":{
                   
                break;
            }
               
                case "^":{
                    
                break;
            }
            
        }
        
			
	return ret;	
    }
    
    
    
    
}
