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
public class Caracter extends baseDraco{
    
    public char valorCaracter;
    public int valorEnteroCaracter;
    
    
    public Caracter(Object c){
        this.valorCaracter= c.toString().charAt(1);
        this.valorEnteroCaracter= c.toString().codePointAt(1);
    }
    
      @Override
    public retorno ejecutar() {
        retorno ret = new retorno();
        ret.valor.crearCaracter(valorCaracter);
        super.elemento= ret;
        return ret;
    }
    
}
