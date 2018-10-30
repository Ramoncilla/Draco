/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class Caracter extends objetoBase{
    
    public String caracterCadena="";
    public int caracterInt;
    
    public Caracter(Object val){
       this.caracterCadena= val.toString().replace("'", "").replace("'", "");
       this.caracterInt= caracterCadena.toString().codePointAt(0);
    }
    
      @Override
    public elementoRetorno ejecutar(Generador cod,TablaSimbolos tabla) {
        elementoRetorno ret = new elementoRetorno();
        ret.valor.crearCaracter(caracterInt);
        super.retorno= ret;
        return ret;
    }
    
}
