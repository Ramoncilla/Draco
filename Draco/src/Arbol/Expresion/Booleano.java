/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import draco.Constantes;

/**
 *
 * @author Ramonella
 */
public class Booleano extends objetoBase{
    
    public String booleanoCadena;
    public int booleanoInt;
    
    public Booleano(Object val){
        if(val.toString().equalsIgnoreCase(Constantes.VERDADERO)){
            booleanoCadena = val.toString();
            booleanoInt= 1;
        }else{
            booleanoInt=0;
            booleanoCadena= val.toString();
        }
    }
    
    
      @Override
    public elementoRetorno ejecutar(Generador cod) {
        elementoRetorno ret = new elementoRetorno();
        ret.valor.crearEntero(booleanoInt);
        super.retorno= ret;
        return ret;
    }
    
    
}
