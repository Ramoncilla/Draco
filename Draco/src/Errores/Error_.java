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
   
    
    public String htmlError()
        {
            String cad = "";

            cad = "<tr>\n" +
                "<td>"+this.tipo+"</td>\n" +
                "<td>"+(this.fila+1)+"</td>\n" +
                "<td>"+(this.columna+1)+"</td>\n" +
                "<td>" + this.descripcion + "</td>\n" +
                "</tr>\n";
            return cad;
        }
    
    
}
