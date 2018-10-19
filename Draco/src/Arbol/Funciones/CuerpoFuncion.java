/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class CuerpoFuncion extends objetoBase {
    
    List<objetoBase> listaSentencias;
    
      public CuerpoFuncion(Object sentencias){
        this.listaSentencias= (ArrayList<objetoBase>)sentencias;
    }

    public CuerpoFuncion(){
        this.listaSentencias= new ArrayList<>();
    }
    
    
}
