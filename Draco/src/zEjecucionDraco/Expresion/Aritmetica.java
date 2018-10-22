/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import zEjecucionDraco.baseDraco;
import zEjecucionDraco.retorno;

/**
 *
 * @author Ramonella
 */
public class Aritmetica extends baseDraco{
  
    public baseDraco valor1;
    public baseDraco valor2;
    public String operador;
    
    public Aritmetica(Object v1, Object v2, Object op){
        this.valor1= (baseDraco)v1;
        this.valor2= (baseDraco)v2;
        this.operador= op.toString();
        
    }
    
     @Override
    public retorno ejecutar() {
        Sumar opSumar = new Suma(cod);
        Restar opRestar = new Resta(cod);
        Multiplicar opMultiplicar = new Multiplicacion(cod);
        Potencia opElevar = new Potencia(cod);
        Division opDividir = new Division(cod);
        elementoRetorno ret = new elementoRetorno();
        elementoRetorno v1 = this.val1.ejecutar(cod);
        elementoRetorno v2 = this.val2.ejecutar(cod);
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
