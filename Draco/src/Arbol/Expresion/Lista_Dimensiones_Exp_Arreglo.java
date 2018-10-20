/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Lista_Dimensiones_Exp_Arreglo extends objetoBase {
    
        public List<Lista_Expresiones> elementos;
    
    
    public Lista_Dimensiones_Exp_Arreglo(){
        
        this.elementos= new ArrayList<>();
        
    }
    
    public void insertar(Object c){
        this.elementos.add((Lista_Expresiones)c);
    }
    
}
