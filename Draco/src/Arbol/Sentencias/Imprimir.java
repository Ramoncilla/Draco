/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import draco.Constantes;

/**
 *
 * @author Ramonella
 */
public class Imprimir extends objetoBase {
    
    public objetoBase expresion;
    
    public Imprimir(Object v){
        this.expresion= (objetoBase) v;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        
        Valor c = expresion.ejecutar(cod).valor;
        String cadena="";
        if(c.tipo.equalsIgnoreCase(Constantes.BOOLEANO)){
            cadena+="98\n";  
        }else if(c.tipo.equalsIgnoreCase(Constantes.CADENA)){
            cadena+="115\n";
        }else if(c.tipo.equalsIgnoreCase(Constantes.CARACTER)){
            cadena+="99\n";
        }else if(c.tipo.equalsIgnoreCase(Constantes.DECIMAL)){
            cadena+="102\n";
        }else {
            cadena+="100\n";
        }
        cadena+=c.valor.toString()+"\n"
                + "PRINT\n";
        cod.addCodigo(cadena);
        return new elementoRetorno();
    }
    
    
    
    
}
