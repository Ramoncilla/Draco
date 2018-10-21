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
    
    
    public Generador(){
        this.codigo= "";
    }
    
    public void addCodigo(String c){
        this.codigo+= c+"\n";
    }
    
    
}
