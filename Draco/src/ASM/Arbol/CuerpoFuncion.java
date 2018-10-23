/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM.Arbol;

import ASM.baseASM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class CuerpoFuncion  {
    
    public List<baseASM> sentencias;
    
    
    public CuerpoFuncion(Object c){
        this.sentencias= (ArrayList<baseASM>)c;
    }
   
    public CuerpoFuncion(){
        this.sentencias= new ArrayList<>();
    }
    
    public void insertar(Object c){
        this.sentencias.add((baseASM)c);
    }
        
    public int Size(){
       return this.sentencias.size();
    }
    
    
    public baseASM get(int i){
        return this.sentencias.get(i);
    }
    
}
