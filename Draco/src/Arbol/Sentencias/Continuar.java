/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class Continuar extends objetoBase {
    
    
    public Continuar(){
        
    }
    
    
     @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        String codigo = "BR "+ cod.etiquetasContinuar.obtenerActual()+" // haciendo etiqueta continue \n";
        cod.addCodigo(codigo);
        
        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
