/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import java.util.ArrayList;
import java.util.List;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class ListaFunciones {
    
    
    public List<Funcion> lFunciones;
    
    public ListaFunciones(){
        this.lFunciones= new ArrayList<>();
    }
    
    
    
    
    public void ingresarFuncion(Funcion nuevaFun){
        if(!(existeFuncion(nuevaFun))){
            this.lFunciones.add(nuevaFun);
        }else{
           erroresEjecucion.addSemantico(0, 0, "La funcion "+ nuevaFun.nombre+", ya existe con los mismos parametros, no se ha podido crear");
        }
    }
    
    
    
    private boolean existeFuncion(Funcion nuevaFun){
        
        Funcion temporal;
        for (int i = 0; i < lFunciones.size(); i++) {
            temporal = lFunciones.get(i);
            if(temporal.nombreLargo.equalsIgnoreCase(nuevaFun.nombreLargo)){
                return true;
            }
        }
        return false;
    }
  
    
    
    
    
}
