/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco;

import ASM.Ambito3D;
import java.util.ArrayList;
import java.util.List;
import static draco.Draco.erroresJS;
import java.util.Stack;
/**
 *
 * @author Ramonella
 */
public class TablaSimboloD {
    
   
   public List<Variable> lSimbolos;

    public TablaSimboloD() {
        this.lSimbolos = new ArrayList<>();
    }
    
    
    private boolean existeVar(String nombre, String ambito){
        
        Variable temporal;
        for (int i = 0; i < this.lSimbolos.size(); i++) {
            temporal = this.lSimbolos.get(i);
            if(temporal.ambito.equalsIgnoreCase(ambito) &&
                    temporal.nombre.equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
   
    
    public void insertarVariable(Variable nuevaVar){
        
        if(!(existeVar(nuevaVar.nombre, nuevaVar.ambito))){
            this.lSimbolos.add(nuevaVar);
        }else{
            erroresJS.addSemantico(0, 0, "La variable "+ nuevaVar.nombre+", no puede ser creada, ya existe en el ambito actual");
        }
    }
    
    
    public Variable obtenerVariable(String nombre, Ambito3D ambiente){
      Ambito3D ambitoTemporal = ambiente.clonar();
      String cadenaAmbito;
      Variable tipo;
       for (int i = 0; i < ambiente.ambientes.size(); i++) {
           cadenaAmbito = ambitoTemporal.getAmbito();
           tipo = getSimbolo(cadenaAmbito, nombre);
           if(tipo!=null){
               return tipo;
           }
           ambitoTemporal.salirAmbito();
       }
      return null;      
   }
    
private Variable getSimbolo (String cadenaAmbito, String nombre ){
  Variable simTemporal;

  for (int i =0; i<this.lSimbolos.size(); i++){
      simTemporal  = this.lSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombre.equalsIgnoreCase(nombre)){
              return simTemporal;
          }
      }
  }
return null;
}
    
    
    
}
