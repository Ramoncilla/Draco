/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.Stack;

/**
 *
 * @author Ramonella
 */
public class Ambito3D {
  
    public Stack<String> ambientes;
    int contSi, contSino, contMientras, contPara;

    public Ambito3D() {
        this.ambientes = new Stack<>();
        this.contSi = 0;
        this.contSino = 0;
        this.contMientras = 0;
        this.contPara = 0;
    }
    
    public void addAmbiente(String nombre){
        this.ambientes.push(nombre);
    }
    
    public void addSi(){
        this.contSi++;
        this.ambientes.push("Si"+contSi);
    }
    
    public void addSino(){
        this.contSino++;
        this.ambientes.push("Sino"+contSino);
    }
    public void addMientras(){
        this.contMientras++;
        this.ambientes.push("Si"+contMientras);
    }
    public void addPara(){
        this.contPara++;
        this.ambientes.push("Para"+contPara);
    }
    
    public void salirAmbito(){
        this.ambientes.pop();
    }
    
    
    
    
}
