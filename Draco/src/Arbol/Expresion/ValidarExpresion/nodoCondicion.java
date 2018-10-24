/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class nodoCondicion {
    
    public List<String> verdaderas;
    public List<String> falsas;
    public String codigo;

    public nodoCondicion(String codigo) {
        this.codigo = codigo;
        this.falsas= new ArrayList<>();
        this.verdaderas= new ArrayList<>();
    }
    
    
    public void addVerdadera(String l1){
        this.verdaderas.add(l1);
    }
    
    
    public void addFalsa(String l1){
        this.falsas.add(l1);
    }
    
    
    public void addEtiquetasVerdaderas(List<String>lista){
        for (int i = 0; i < lista.size(); i++) {
            this.verdaderas.add(lista.get(i));
        }
    }
    
    public void addEtiquetasFalsas(List<String>lista){
        for (int i = 0; i < lista.size(); i++) {
            this.falsas.add(lista.get(i));
        }
    }
    
    
    
    
    
}
