/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class CuerpoFuncion extends objetoBase {
    
    public List<objetoBase> listaSentencias;
    
      public CuerpoFuncion(Object sentencias){
        this.listaSentencias= (ArrayList<objetoBase>)sentencias;
    }

    public CuerpoFuncion(){
        this.listaSentencias= new ArrayList<>();
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        elementoRetorno ret = new elementoRetorno();
        objetoBase temporal;
        for (int i = 0; i < this.listaSentencias.size(); i++) {
            temporal= listaSentencias.get(i);
            ret=temporal.ejecutar(cod);
        }
        return ret;
    }
    
    
    public boolean esVacio(){
        return (this.listaSentencias.isEmpty());
    }
    
}
