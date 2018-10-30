/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class Entero extends objetoBase {

    public String valIntCadena;
    public int valIntDouble;

    public Entero(Object val) {
        this.valIntCadena = val.toString();
        this.valIntDouble = Integer.parseInt(valIntCadena);
    }

    @Override
    public elementoRetorno ejecutar(Generador cod,TablaSimbolos tabla) {
        elementoRetorno ret = new elementoRetorno();
        ret.valor.crearEntero(valIntDouble);
        super.retorno= ret;
        return ret;
    }

}
