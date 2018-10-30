/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Expresion.Acceso;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;

/**
 *
 * @author Ramonella
 */
public class AsignaAcceso extends objetoBase{
    
    public Acceso varAsignar;
    public objetoBase expresion;
    
    public AsignaAcceso(Object acc, Object exp){
        this.varAsignar= (Acceso)acc;
        this.expresion= (objetoBase)exp;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        
        
        return new elementoRetorno(); 
    }
    
    
    
    
    
}
