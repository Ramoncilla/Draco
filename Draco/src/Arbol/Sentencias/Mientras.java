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
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

        elementoRetorno retCondicion = condicion.ejecutar(cod,tabla, ambitos, metodo);
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
            cod.addCodigo("// REsolucion de condicion del ciclo \n");
            cod.addCodigo(cond.codigo);
            cod.addCodigo(cond.getEtiquetasVerdaderas());
            
            instrucciones.ejecutar(cod, tabla, ambitos, metodo);
            
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

   
    
    /*
    
    case "HACER_MIENTRAS":{
			var expCiclo = nodo.expresion;
			var cuerpoCiclo = nodo.cuerpo;
			this.c3d.addCodigo("// ---------- Resolver Hacer Mientras ----------- ");
			var etiqCiclo = this.c3d.getEtiqueta();
			var etiqBreak = this.c3d.getEtiqueta();
			var etiqContinue = this.c3d.getEtiqueta();
			etiquetasBreak.insertarEtiqueta(etiqBreak);
			etiquetasContinuar.insertarEtiqueta(etiqContinue);
			this.c3d.addCodigo(etiqCiclo+":");
			ambitos.addHacerMientras();
			if(cuerpoCiclo!=0){
				var sentTemp;
				for(var i = 0; i<cuerpoCiclo.length; i++){
					sentTemp= cuerpoCiclo[i];
					this.escribir3D(sentTemp,ambitos,clase,metodo);
				}
				this.c3d.addCodigo(etiqContinue+": //etiqueta del conituar");
				var retExpresion = this.resolverExpresion(expCiclo,ambitos,clase, metodo);
				if(retExpresion instanceof nodoCondicion){
					this.c3d.addCodigo(retExpresion.codigo);
					this.c3d.addCodigo(retExpresion.getEtiquetasVerdaderas());
					this.c3d.addCodigo("jmp, , , "+etiqCiclo+";");
					this.c3d.addCodigo(retExpresion.getEtiquetasFalsas());
				    this.c3d.addCodigo(etiqBreak+":");
					ambitos.ambitos.shift();
					etiquetasBreak.eliminarActual();
					etiquetasContinuar.eliminarActual();
				}else{
					errores.insertarError("Semantico", "Ha ocurrido un error al resolver expresion para repetir mientras");
				}
	
			}

			break;
		}
    
    */
    
}
