/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Valor;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class Suma extends elementoOperacion{
    
    
    
    public Valor operar(Valor v1, Valor v2){
        
        if(esEntero(v1) && esDecimal(v2)){
            
        } else if(esDecimal(v1) && esEntero(v2)){
            
        }else if(esDecimal(v1) && esCaracter(v2)){
            
        }else if(esCaracter(v1) && esDecimal(v2)){
            
        }else if(esBooleano(v1) && esDecimal(v2)){
            
        }else if(esDecimal(v1) && esBooleano(v2)){
            
        }else if(esDecimal(v1) && esDecimal(v2)){
            
        }else if(esEntero(v1) && esCaracter(v2)){
            
        }else if(esCaracter(v1) && esEntero(v2)){
            
        }else if(esBooleano(v1) && esEntero(v2)){
            
        }else if(esEntero(v1) && esBooleano(v2)){
            
        }else if(esEntero(v1) && esEntero(v2)){
            
        }else if(esCadena(v1) && esEntero(v2)){
            
        }else if(esCadena(v1) && esDecimal(v2)){
            
        }else if(esDecimal(v1) && esCadena(v2)){
            
        }else if(esEntero(v1) && esCadena(v2)){
            
        }else if(esCadena(v1) && esCaracter(v2)){
            
        }else if(esCaracter(v1) && esCadena(v2)){
            
        }else if(esCadena(v1) && esCadena(v2)){
            
        }
        erroresEjecucion.addSemantico(0, 0, "Tipo no valido para realizar una suma, "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
    }
    
    
}
