/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Llamada extends objetoBase {
    
    public String nombreLlamda;
    public List<objetoBase> parametros;
    public int tipoLlamada=2; //1 es para una llamada desde una sentencia, 2 es que debe de retornar algun tipo para una expresion
    
    public Llamada (Object nom, Object param){
        this.nombreLlamda= nom.toString();
        this.parametros= (ArrayList<objetoBase>) param;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        
        
        
        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
