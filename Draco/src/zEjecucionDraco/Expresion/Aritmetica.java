/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import ASM.Valor;
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
}
