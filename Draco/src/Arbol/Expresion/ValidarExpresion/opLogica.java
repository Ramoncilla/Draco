/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Generador;
import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class opLogica extends elementoOperacion  {
    Generador asm;
    
    public opLogica(Generador c){
        
        this.asm=c;
    } 
    
     public Valor AND (Valor v1, Valor v2){
     
          if(esBooleano(v1)){
            nodoCondicion n = asm.casteoBoolCondicion(v1);
            v1= new Valor(Constantes.CONDICION, n);
        }
         
          if(esBooleano(v2)){
            nodoCondicion n = asm.casteoBoolCondicion(v2);
            v2= new Valor(Constantes.CONDICION, n);
        }
          
         
         if(esCondicion(v1) && esCondicion(v2)){
          nodoCondicion c1 = (nodoCondicion)v1.valor;
          nodoCondicion c2 = (nodoCondicion)v2.valor;
          String codigoAND = c1.codigo+""
                  + c1.getEtiquetasVerdaderas()+"\n"
                  + c2.codigo+"";
          nodoCondicion res= new nodoCondicion(codigoAND);
          res.addEtiquetasVerdaderas(c2.verdaderas);
          res.addEtiquetasFalsas(c1.falsas);
          res.addEtiquetasFalsas(c2.falsas);
          return new Valor(Constantes.CONDICION, res);
         }else if(esCondicion(v1) && esBooleano(v2)){
             
         }else if(esBooleano(v1) && esCondicion(v2)){
             
         }else if(esBooleano(v1) && esBooleano(v2)){
             
         }
         erroresEjecucion.addSemantico(0, 0, "Tipos no validos para realizar una operacion AND "+ v1.tipo+" y "+ v2.tipo);
         return new Valor();
     }
     
     
      public Valor OR(Valor v1, Valor v2){
          if(esBooleano(v1)){
            nodoCondicion n = asm.casteoBoolCondicion(v1);
            v1.valor= new Valor(Constantes.CONDICION, n);
        }
         
          if(esBooleano(v2)){
            nodoCondicion n = asm.casteoBoolCondicion(v2);
            v2.valor= new Valor(Constantes.CONDICION, n);
        }
         
          
          
          if(esCondicion(v1) && esCondicion(v2)){
          nodoCondicion c1 = (nodoCondicion)v1.valor;
          nodoCondicion c2 = (nodoCondicion)v2.valor;
          String codigoOR = c1.codigo+""
                  + c1.getEtiquetasFalsas()+"\n"
                  + c2.codigo+"";
          nodoCondicion res= new nodoCondicion(codigoOR);
          res.addEtiquetasVerdaderas(c1.verdaderas);
          res.addEtiquetasVerdaderas(c2.verdaderas);
          res.addEtiquetasFalsas(c2.falsas);
          return new Valor(Constantes.CONDICION, res);
         }
      
        erroresEjecucion.addSemantico(0, 0, "Tipos no validos para realizar una operacion OR "+ v1.tipo+" y "+ v2.tipo);
        return new Valor();
      } 
     
     
     public Valor  NOT(Valor v1){
     
      if(esBooleano(v1)){
            nodoCondicion n = asm.casteoBoolCondicion(v1);
            v1.valor= new Valor(Constantes.CONDICION, n);
        }
          if(esCondicion(v1)){
          nodoCondicion c1 = (nodoCondicion)v1.valor;
          String codigoNOT = c1.codigo+"\n";
          nodoCondicion res= new nodoCondicion(codigoNOT);
          res.addEtiquetasVerdaderas(c1.falsas);
          res.addEtiquetasFalsas(c1.verdaderas);
          return new Valor(Constantes.CONDICION, res);
         } 
         
     erroresEjecucion.addSemantico(0, 0, "Tipos no validos para realizar una operacion NOT "+ v1.tipo);
        return new Valor();
         
     }
    
}


