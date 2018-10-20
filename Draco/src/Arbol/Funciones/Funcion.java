/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Funciones;

import Arbol.Sentencias.Declaracion;
import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Funcion extends objetoBase {
    
    public String nombre;
    public String tipo;
    public boolean esPrincipal= false;
    public List<Declaracion> parametros;
    public CuerpoFuncion sentencias;
    
    public Funcion(Object nom, Object tip, boolean princ, Object parametros, Object cuerpo){
        this.nombre= nom.toString();
        this.tipo= tip.toString();
        this.esPrincipal= princ;
        this.parametros= (ArrayList<Declaracion>) parametros;
        this.sentencias= (CuerpoFuncion)cuerpo;  
    }
    
    
}
