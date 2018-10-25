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
public class Decimal extends objetoBase{
    
    public String valDecimalCadena;
    public double valDecimalDouble;
    
    public Decimal(Object val){
        this.valDecimalCadena= val.toString();
        this.valDecimalDouble= Double.parseDouble(valDecimalCadena);
    }
    
      @Override
    public elementoRetorno ejecutar(Generador cod) {
        elementoRetorno ret = new elementoRetorno();
        ret.valor.crearDecimal(valDecimalDouble);
        super.retorno= ret;
        return ret;
    }
    
}
