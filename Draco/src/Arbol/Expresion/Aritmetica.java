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
import Arbol.Expresion.ValidarExpresion.Division;
import Arbol.Expresion.ValidarExpresion.Multiplicacion;
import Arbol.Expresion.ValidarExpresion.Potencia;
import Arbol.Expresion.ValidarExpresion.Resta;
import Arbol.Expresion.ValidarExpresion.Suma;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class Aritmetica extends objetoBase {

    public objetoBase val1;
    public objetoBase val2;
    public String operador;

    public Aritmetica(Object v1, Object v2, Object op) {
        this.val1 = (objetoBase) v1;
        this.val2 = (objetoBase) v2;
        this.operador = op.toString();
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        Suma opSumar = new Suma(cod);
        Resta opRestar = new Resta(cod);
        Multiplicacion opMultiplicar = new Multiplicacion(cod);
        Potencia opElevar = new Potencia(cod);
        Division opDividir = new Division(cod);
        elementoRetorno ret = new elementoRetorno();
        elementoRetorno v1 = this.val1.ejecutar(cod, tabla,ambitos, metodo);
        elementoRetorno v2 = this.val2.ejecutar(cod, tabla,ambitos, metodo);
        switch (operador) {
            case "+": {
                Valor res = opSumar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
            case "-": {
                Valor res = opRestar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }
            case "*": {
                Valor res = opMultiplicar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }

            case "/": {
                Valor res = opDividir.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }

            case "^": {

               Valor res = opElevar.operar(v1.valor, v2.valor);
                ret.valor = res;
                super.retorno = ret;
                return ret;
            }

        }

        return ret;
    }

}
