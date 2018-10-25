/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Expresion.ValidarExpresion.nodoCondicion;
import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;
import draco.Constantes;

/**
 *
 * @author Ramonella
 */
public class IF  extends objetoBase{
    
    public objetoBase condicion;
    public CuerpoFuncion instrucciones;
   

  public IF(Object cond, Object instr){
      this.condicion= (objetoBase) cond;
      this.instrucciones= (CuerpoFuncion) instr;
  }    

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        
        elementoRetorno solExpresion = this.condicion.ejecutar(cod);
        if(solExpresion.valor.tipo.equalsIgnoreCase(Constantes.CONDICION)){
            nodoCondicion cond = (nodoCondicion)solExpresion.valor.valor;
            cod.addCodigo("//Resolviendo un IF\n");
            cod.addCodigo(cond.codigo);
            cod.addCodigo(cond.getEtiquetasVerdaderas());
            instrucciones.ejecutar(cod);
            cod.addCodigo(cond.getEtiquetasFalsas());
        }else{
            System.out.println("no vino una condicion");
        }
        return new elementoRetorno();
    }
    
    
    
}
