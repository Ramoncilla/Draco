/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Si extends objetoBase{
    public int tipoSi;
    public IF siInicial;
    public CuerpoFuncion sino;
    public List<IF> listaSinoSi;
    
    public Si(int tipo, Object si, Object sino, Object sinoSi){
        this.tipoSi= tipo;
        this.siInicial= (IF) si;
        this.sino = (CuerpoFuncion)sino;
        this.listaSinoSi= (ArrayList<IF>)sinoSi;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        String etiqSalida = cod.getEtiqueta();
        String salida="BR "+ etiqSalida+"\n";
        cod.addMensaje("-------- INICIO SI ---------");
        //Resolviendo para el primer si
        this.siInicial.etiquetaSalida= etiqSalida;
        this.siInicial.ejecutar(cod, tabla, ambitos, metodo);
        
        //resolviendo para la lista de si intermedios si llegara a tener
        IF temp;
        for (int i = 0; i < this.listaSinoSi.size(); i++) {
            temp= listaSinoSi.get(i);
            temp.etiquetaSalida= etiqSalida;
            temp.ejecutar(cod, tabla, ambitos, metodo);
        }
        
        if(!(sino.esVacio())){
            cod.addSino();
            sino.ejecutar(cod, tabla, ambitos, metodo);
            cod.addCodigo(salida);
            cod.salirAmbito();
        }
        cod.addCodigo(etiqSalida+":\n");
         cod.addMensaje("-------- FIN SI ---------");
        
        return new elementoRetorno();
    }
    
    
    
    
    /*
    var expresionSi = nodo.expresion;
			var sentVerdaderas = nodo.sentV;
			var sentFalsas = nodo.sentF;
			var etiqSalida = this.c3d.getEtiqueta();
			var retExpresion = this.resolverExpresion(expresionSi,ambitos, clase, metodo);

			if(retExpresion instanceof nodoCondicion){
				this.c3d.addCodigo(retExpresion.codigo);
				this.c3d.addCodigo(retExpresion.getEtiquetasVerdaderas());
				if(sentVerdaderas!= 0){
					ambitos.addSi();
					var sentTemp;
					for(var i = 0; i<sentVerdaderas.length; i++){
						sentTemp= sentVerdaderas[i];
						this.escribir3D(sentTemp,ambitos,clase,metodo);
					}
					ambitos.ambitos.shift();
				}
				this.c3d.addCodigo("jmp, , , "+ etiqSalida+"; // salida del if");
				this.c3d.addCodigo(retExpresion.getEtiquetasFalsas());
				if(sentFalsas!=0){
					ambitos.addElse();
					var sentTemp;
					for(var i = 0; i<sentFalsas.length; i++){
						sentTemp= sentFalsas[i];
						this.escribir3D(sentTemp,ambitos,clase,metodo);
					}
					ambitos.ambitos.shift();
				}
				this.c3d.addCodigo(etiqSalida+":");
				//ambitos.ambitos.shift();

			}else{
				errores.insertarError("Semantico", "Ha ocurrido un error al resolver la expreison para SI");
			}

			break;
    
    */
    
    
    
}
