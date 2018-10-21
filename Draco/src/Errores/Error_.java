/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Ramonella
 */
public class Error_ {
    
     public int columna;
    public int fila;
    public String tipo;
    public String descripcion;

    public Error_(int columna, int fila, String tipo, String descripcion) {
        this.columna = columna;
        this.fila = fila;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
    
    
}
