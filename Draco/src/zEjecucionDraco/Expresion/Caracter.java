/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Expresion;

import zEjecucionDraco.baseDraco;

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
    
}
