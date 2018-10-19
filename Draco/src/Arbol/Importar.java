/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author Ramonella
 */
public class Importar extends objetoBase {
    
    public String rutaArchivo;
    
    public Importar(Object val){
        this.rutaArchivo= val.toString().replace("\"", "").replace("\"", "");
    }
    
    
}
