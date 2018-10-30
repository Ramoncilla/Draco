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
import Arbol.Expresion.ValidarExpresion.nodoCondicion;
import Arbol.Expresion.ValidarExpresion.opRelacional;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class Relacional extends objetoBase {
     public objetoBase val1;
    public objetoBase val2;
    public String operador;
    
    public Relacional(Object v1, Object v2, Object op){
        this.val1 = (objetoBase) v1;
        this.val2= (objetoBase)v2;
        this.operador= op.toString();
    }
    
    
     @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        elementoOperacion op = new elementoOperacion();
        opRelacional rel = new opRelacional(cod);
        elementoRetorno ret = new elementoRetorno();
        elementoRetorno v1 = this.val1.ejecutar(cod, tabla, ambitos, metodo);
        elementoRetorno v2 = this.val2.ejecutar(cod, tabla, ambitos, metodo);
        switch (operador) {
            case "<": {
                Valor res = rel.menor(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
            
            case ">": {
                Valor res = rel.mayor(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
            case "<=": {
                Valor res = rel.menorIgual(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }

            case ">=": {
                Valor res = rel.mayorIgual(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }

            /*
            case "==": {

               Valor res = opElevar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
            
            case "!=": {

               Valor res = opElevar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
*/
        }

        return ret;
    }
    
    
    
    
}
