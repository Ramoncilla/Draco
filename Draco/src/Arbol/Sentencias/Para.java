/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.Valor;
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
public class Para extends objetoBase {
    
    public objetoBase declaAsigna;
    public objetoBase condicion;
    public objetoBase asignaControl;
    public CuerpoFuncion  instrucciones;
    
    
    public Para(Object decla, Object cond, Object asig, Object inst){
        this.condicion=(objetoBase) cond;
        this.instrucciones= (CuerpoFuncion) inst;
        this.declaAsigna= (objetoBase)decla;
        this.asignaControl= (objetoBase)asig;
    }

   
    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
       

        ambitos.addPara();
        elementoRetorno retDeclaracion = declaAsigna.ejecutar(cod, tabla, ambitos, metodo);
        elementoRetorno retCondicion = condicion.ejecutar(cod,tabla, ambitos, metodo);
       
        if(retCondicion.valor.tipo.equalsIgnoreCase(Constantes.BOOLEANO)){
            nodoCondicion n = cod.casteoBoolCondicion(retCondicion.valor);
            retCondicion.valor= new Valor(Constantes.CONDICION, n);
        }
        if (retCondicion.valor.tipo.equalsIgnoreCase(Constantes.CONDICION)) {
        cod.addMensaje("INICIO A RESOLVER PARA");
        String etiqCiclo = cod.getEtiqueta();
        String etiqContinuar= cod.getEtiqueta();
        String etiqBreak= cod.getEtiqueta();
        cod.etiquetasBreak.insertarEtiqueta(etiqBreak);
        cod.etiquetasContinuar.insertarEtiqueta(etiqContinuar);
        cod.addCodigo(etiqCiclo+":\n");
        cod.addMensaje("Condicion del ciclo para");
        nodoCondicion cond= (nodoCondicion)retCondicion.valor.valor;
        cod.addCodigo(cond.codigo+"\n");
        cod.addCodigo(cond.getEtiquetasVerdaderas()+"\n");
        
        instrucciones.ejecutar(cod, tabla, ambitos, metodo);
        cod.addMensaje("REsolviendo asignacion del ciclo para ");
        asignaControl.ejecutar(cod, tabla, ambitos, metodo);
        cod.addCodigo("BR "+ etiqCiclo+"\n");
        cod.addMensaje("Continue del ciclo para");
        cod.addCodigo(etiqContinuar+": //etiqueta continuar para\n");
        asignaControl.ejecutar(cod, tabla, ambitos, metodo);
        cod.addCodigo("BR "+ etiqCiclo+"\n");
        
        cod.addCodigo(cond.getEtiquetasFalsas()+"\n");
        cod.addCodigo(etiqBreak+": //etiqueta break del ciclo para \n");
        
         cod.etiquetasBreak.eliminarActual();
            cod.etiquetasContinuar.eliminarActual();
            ambitos.salirAmbito();
            cod.addMensaje("-------- FIN PARA --------");
        }else{
            erroresEjecucion.addSemantico(0, 0, "Condicion no valida para ejecutar la sentencia Para"); 
        }
 
        
        return new elementoRetorno();
    }
    
  
    
}
