/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Expresion.Acceso;
import Arbol.Expresion.Identificador;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class AsignaAcceso extends objetoBase{
    
    public Acceso varAsignar;
    public objetoBase expresion;
    
    public AsignaAcceso(Object acc, Object exp){
        this.varAsignar= (Acceso)acc;
        this.expresion= (objetoBase)exp;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        switch (varAsignar.tipoAcceso) {
            case 1:
            {
                resolverTipo1(cod, tabla, ambitos, metodo);
              break;   
            }  
            
            case 2:
            {
               resolverTipo2(cod, tabla, ambitos, metodo); 
              break;   
            }
            
            case 3:
            {
                resolverTipo3(cod, tabla, ambitos, metodo);
              break;   
            }
        }
        
        return new elementoRetorno(); 
    }
    
    
    private void resolverTipo1(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo){
       elementoRetorno retExpresion; 
        if(varAsignar.valor1 instanceof Identificador){
            Identificador id = (Identificador)varAsignar.valor1;
            String nombreId= id.nombreId;
            Object esAtributo= tabla.esAtributo(nombreId, ambitos);
            String tipoVar = tabla.obtenerTipoVar(nombreId, ambitos);
            if(esAtributo!= null){
                boolean atri = (boolean)esAtributo;
                if(atri){
                    // es una variable global
                    
                    
                }else {
                    // es una variable local
                    int pos = tabla.obtenerPosLocal(nombreId, ambitos);
                    if(pos!= -1){
                        retExpresion= expresion.ejecutar(cod, tabla, ambitos, metodo);
                        if(retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)||
                                retExpresion.valor.tipo.equalsIgnoreCase(tipoVar)){
                            cod.addMensaje("RESOLVIENDO ASIGNACION DE "+ nombreId);
                            cod.addMensaje("Obteniendo posicion de "+ nombreId);
                            cod.addCodigo("get_local 0\n");
                            cod.addCodigo(pos+"\n");
                            cod.addCodigo("add\n");
                            cod.addMensaje("Resolviendo Expresion a asignar");
                            cod.addCodigo(retExpresion.valor.valor.toString());
                            cod.addMensaje("Asignando Valor");
                            cod.addCodigo("set_local $calc\n");
                        }else{
                            erroresEjecucion.addSemantico(pos, pos, "No se puede asignar la variable de tipo  "+tipoVar+" "+ nombreId+", tipo invalido con "+ retExpresion.valor.tipo);
                        }
                    }else{
                        erroresEjecucion.addSemantico(pos, pos, "No se ha podido encontrar la variable "+ nombreId+", no existe");
                    }
                }
            }else{
                erroresEjecucion.addSemantico(0, 0, "No existe la variable "+ nombreId);
            }
        }else{
            //es un arreglo
            
        }
        
    }
    
    private void resolverTipo2(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo){
        
    }
    
    private void resolverTipo3(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo){
        
    }
    
    
    
    
}
