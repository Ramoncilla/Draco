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
public class Entero extends baseDraco {
    
    public int valorEntero;
    
    public Entero(Object c){
        this.valorEntero= Integer.parseInt(c.toString());
    }

    @Override
    public retorno ejecutar() {
        retorno ret = new retorno();
        ret.valor.crearEntero(valorEntero);
        super.elemento= ret;
        return ret;
    }
    
    
    
}
