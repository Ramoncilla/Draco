/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import ASM.Generador;
import ASM.elementoRetorno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Archivo {
    
    public List<objetoBase> elementosArchivo;
    
    
    public Archivo(Object val){
        this.elementosArchivo= (ArrayList<objetoBase>)val;
    }
    
 
    
    public void ejecutarArchivo(){
        Generador codASM = new Generador();
        objetoBase temp;
        elementoRetorno elem;
        for (int i = 0; i < this.elementosArchivo.size(); i++) {
            temp= this.elementosArchivo.get(i);
            elem = temp.ejecutar(codASM);
        }
        
        
    }
    
    
}
