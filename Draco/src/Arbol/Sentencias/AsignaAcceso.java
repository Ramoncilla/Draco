/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.Expresion.Acceso;
import Arbol.objetoBase;

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
    
    
}
