/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.Expresion.ValidarExpresion.elementoOperacion;
import Arbol.Expresion.ValidarExpresion.opLogica;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class NOT extends objetoBase{
     public objetoBase val1;
    
    
    public NOT(Object v1){
        this.val1= (objetoBase)v1;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        elementoOperacion op = new elementoOperacion();
        opLogica rel = new opLogica(cod);
        elementoRetorno ret = new elementoRetorno();
        elementoRetorno v1 = this.val1.ejecutar(cod, tabla, ambitos, metodo);
        Valor res = rel.NOT(v1.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
        

    }
    
    
    
    
}
