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
    public Ambito3D ambiente;
    
    
    public Generador(){
        this.codigo= "";
        this.contEtiquetas=0;
        this.ambiente= new Ambito3D();
    }
    
    public void addCodigo(String c){
        this.codigo+= c;
    }
    
    public void addMensaje(String c){
         this.codigo+= "/*"+c+"*/\n";
    }
    public void imprimirCod(){
        System.out.println(this.codigo);
    }
    
    public String getEtiqueta(){
        contEtiquetas++;
        return "L"+contEtiquetas;
    }
    
    
    public void addAmbiente(String nombre){
        this.ambiente.addAmbiente(nombre);
    }
    
    public void addSi(){
       this.ambiente.addSi();
    }
    
    public void addSino(){
        this.ambiente.addSino();
    }
    public void addMientras(){
        this.ambiente.addMientras();
    }
    public void addPara(){
        this.ambiente.addPara();
    }
    
    public void salirAmbito(){
        this.ambiente.salirAmbito();
    }
    
}
