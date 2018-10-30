/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Expresion.ValidarExpresion.nodoCondicion;
import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class IF  extends objetoBase{
    
    public objetoBase condicion;
    public CuerpoFuncion instrucciones;
    public String etiquetaSalida="";
   

  public IF(Object cond, Object instr){
      this.condicion= (objetoBase) cond;
      this.instrucciones= (CuerpoFuncion) instr;
  }    

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        String salida="BR "+ etiquetaSalida+"\n";
        elementoRetorno solExpresion = this.condicion.ejecutar(cod, tabla, ambitos, metodo);
        if(solExpresion.valor.tipo.equalsIgnoreCase(Constantes.CONDICION)){
            nodoCondicion cond = (nodoCondicion)solExpresion.valor.valor;
            cod.addMensaje("--- Codigo condicion ---");
            cod.addCodigo(cond.codigo);
            cod.addCodigo(cond.getEtiquetasVerdaderas());
            cod.addSi();
            cod.addMensaje("------- inicio codigo Instrucciones  ------------");
            instrucciones.ejecutar(cod, tabla, ambitos, metodo);
            cod.addMensaje("------- fin codigo Instrucciones  ------------");
            cod.addCodigo(salida);
            cod.salirAmbito();
            cod.addCodigo(cond.getEtiquetasFalsas());
        }else{
            erroresEjecucion.addSemantico(0, 0, "Expresion no valida para realizar un SI");
        }
        return new elementoRetorno();
    }
    
    
    
}
