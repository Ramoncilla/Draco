/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author Ramonella
 */
public class Generador {
    
    public String codigo;
    public int contEtiquetas;
    
    
    public Generador(){
        this.codigo= "";
        this.contEtiquetas=0;
    }
    
    public void addCodigo(String c){
        this.codigo+= c;
    }
    
    public void imprimirCod(){
        System.out.println(this.codigo);
    }
    
    public String getEtiqueta(){
        contEtiquetas++;
        return "L"+contEtiquetas;
    }
}
