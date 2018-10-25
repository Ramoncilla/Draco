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
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Mientras extends objetoBase {

    public objetoBase condicion;
    public CuerpoFuncion instrucciones;

    public Mientras(Object cond, Object inst) {
        this.condicion = (objetoBase) cond;
        this.instrucciones = (CuerpoFuncion) inst;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {

        elementoRetorno retCondicion = condicion.ejecutar(cod);
        if (retCondicion.valor.tipo.equalsIgnoreCase(Constantes.CONDICION)) {
            cod.addMientras();
            nodoCondicion cond= (nodoCondicion)retCondicion.valor.valor;
            cod.addMensaje("-------- INICIO MIENTRAS -------");
            String etiqCiclo = cod.getEtiqueta();
            String etiqContinuar= cod.getEtiqueta();
            String etiqBreak= cod.getEtiqueta();
            cod.etiquetasBreak.insertarEtiqueta(etiqBreak);
            cod.etiquetasContinuar.insertarEtiqueta(etiqContinuar);
            cod.addCodigo(etiqCiclo + ": //etiqueta pivote ciclo \n");
            cod.addCodigo(etiqContinuar+": // etiqueta continuar \n");
            cod.addCodigo(cond.codigo);
            cod.addCodigo(cond.getEtiquetasVerdaderas());
            cod.addMientras();
            instrucciones.ejecutar(cod);
            cod.salirAmbito();
            cod.addCodigo("BR "+etiqCiclo+"\n");
            cod.addCodigo(cond.getEtiquetasFalsas());
            cod.addCodigo(etiqBreak+":// etiqueta break \n");
            cod.etiquetasBreak.eliminarActual();
            cod.etiquetasContinuar.eliminarActual();
            cod.salirAmbito();
            cod.addMensaje("-------- FIN MIENTRAS --------");
        } else {

        }

        return new elementoRetorno();
    }

   
}
