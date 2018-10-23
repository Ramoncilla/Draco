/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM.Arbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class ListaFunciones {
    
    public List<Funcion> funciones;

    public ListaFunciones() {
        this.funciones= new ArrayList<>();
    }
    
    
    public void insertar(Object f){
        this.funciones.add((Funcion)f);
    }
    
    public ListaFunciones(Object c ){
        this.funciones= (ArrayList<Funcion>)c;
    }
    
    public int Size(){
        return this.funciones.size();
    }
    
    public Funcion get(int i){
       return this.funciones.get(i);
    }
    
}
