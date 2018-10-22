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
public class Cadena extends baseDraco{
    
    public String valorCadena;
    
    public Cadena (Object c){
        this.valorCadena= c.toString().replace("\"", "").replace("\"", "");
    }
      @Override
    public retorno ejecutar() {
        retorno ret = new retorno();
        ret.valor.crearCadena(valorCadena);
        super.elemento= ret;
        return ret;
    }
    
}
