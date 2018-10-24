/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class Cadena extends objetoBase {
    
    public String valorCadena;
    
    
    public Cadena(Object val){
        this.valorCadena= val.toString().replace("\"", "");
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        
        String cadena= "GET_GLOBAL 0\n";
        char c;
        int val;
        for (int i = 0; i < this.valorCadena.length(); i++) {
         c= this.valorCadena.charAt(i);
         val= (int)c;
         cadena+="GET_GLOBAL 0\n"
                 + "GET_GLOBAL 0\n"
                 + val+" // "+c+"\n"
                         + "SET_GLOBAL $calc\n"
                         + "1\n"
                         + "ADD\n"
                         + "SET_GLOBAL 0\n";
        }
        elementoRetorno ret = new elementoRetorno();
        ret.valor.crearCadena(cadena);
        super.retorno= ret;
        return ret;
    }
    
    
    
    
}
