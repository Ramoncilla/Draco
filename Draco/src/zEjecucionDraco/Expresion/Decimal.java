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
public class Decimal extends baseDraco {
    
    public double valorDecimal;
    
    
    public Decimal(Object c){
        this.valorDecimal= Double.parseDouble(c.toString());
    }
 
      @Override
    public retorno ejecutar() {
        retorno ret = new retorno();
        ret.valor.crearEntero(valorDecimal);
        super.elemento= ret;
        return ret;
    }
    
    
}
