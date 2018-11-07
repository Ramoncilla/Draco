/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import Arbol.Expresion.ValidarExpresion.elementoOperacion;
import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresJS;

/**
 *
 * @author Ramonella
 */
public class logicaD extends elementoOperacion {

    public Valor operar(Valor v1, Valor v2, String operador) {

        switch (operador) {
            case "&&": {
                Valor c = AND(v1, v2);
                return c;
            }

            case "||": {
                Valor c = OR(v1, v2);
                return c;
            }
        }
        return new Valor();
    }

    public Valor AND(Valor v1, Valor v2) {
        Valor v = new Valor();
        v.crearBooleano(Constantes.FALSO);
        if (esBooleano(v1) && esBooleano(v2)) {
            int n1 = obtenerValorEnteroBool(v1);
            int n2 = obtenerValorEnteroBool(v2);
            if (n1 == 1 && n2 == 1) {
                v.crearBooleano(Constantes.VERDADERO);
                return v;
            }
            v.crearBooleano(Constantes.FALSO);
            return v;
        }

        erroresJS.addSemantico(0, 0, "Para resolver una expresion logica , ambos operandos deben de ser booleanos, y los tipos de AND son , " + v1.tipo + " ( " + v1.valor + ") y " + v2.tipo + " (" + v2.valor + ")");
        return new Valor();
    }

    public Valor OR(Valor v1, Valor v2) {
        Valor v = new Valor();
        v.crearBooleano(Constantes.FALSO);
        if (esBooleano(v1) && esBooleano(v2)) {
            int n1 = obtenerValorEnteroBool(v1);
            int n2 = obtenerValorEnteroBool(v2);
            if (n1 == 1 || n2 == 1) {
                v.crearBooleano(Constantes.VERDADERO);
                return v;
            }
            v.crearBooleano(Constantes.FALSO);
            return v;
        }

        erroresJS.addSemantico(0, 0, "Para resolver una expresion logica , ambos operandos deben de ser booleanos, y los tipos de OR son , " + v1.tipo + " ( " + v1.valor + ") y " + v2.tipo + " (" + v2.valor + ")");
        return new Valor();
    }

}
