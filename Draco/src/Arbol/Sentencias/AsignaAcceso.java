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
import Arbol.Expresion.posArreglo;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class AsignaAcceso extends objetoBase {
    
    public Acceso varAsignar;
    public objetoBase expresion;
    
    public AsignaAcceso(Object acc, Object exp) {
        this.varAsignar = (Acceso) acc;
        this.expresion = (objetoBase) exp;
    }
    
    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
        switch (varAsignar.tipoAcceso) {
            case 1: {
                resolverTipo1(cod, tabla, ambitos, metodo);
                break;
            }
            
            case 2: {
                resolverTipo2(cod, tabla, ambitos, metodo);
                break;
            }
            
            case 3: {
                resolverTipo3(cod, tabla, ambitos, metodo);
                break;
            }
        }
        
        return new elementoRetorno();
    }
    
    private void resolverTipo1(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        elementoRetorno retExpresion;
        if (varAsignar.valor1 instanceof Identificador) {
            Identificador id = (Identificador) varAsignar.valor1;
            String nombreId = id.nombreId;
            Object esAtributo = tabla.esAtributo(nombreId, ambitos);
            String tipoVar = tabla.obtenerTipoVar(nombreId, ambitos);
            if (esAtributo != null) {
                boolean atri = (boolean) esAtributo;
                if (atri) {
                    // es una variable global
                    int pos = tabla.obtenerPosAtributo(nombreId, ambitos);
                    if (pos != -1) {
                        retExpresion = expresion.ejecutar(cod, tabla, ambitos, metodo);
                        if (retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)
                                || retExpresion.valor.tipo.equalsIgnoreCase(tipoVar)) {
                            cod.addMensaje("RESOLVIENDO ASIGNACION DE " + nombreId);
                            cod.addMensaje("Obteniendo posicion de " + nombreId);
                            cod.addCodigo(Constantes.INICIO_HEAP + "\n");
                            cod.addCodigo(pos + "\n");
                            cod.addCodigo("add\n");
                            cod.addMensaje("Resolviendo Expresion a asignar");
                            cod.addCodigo(retExpresion.valor.valor.toString());
                            cod.addMensaje("Asignando Valor");
                            cod.addCodigo("set_global $calc\n");
                        } else {
                            erroresEjecucion.addSemantico(pos, pos, "No se puede asignar la variable de tipo  " + tipoVar + " " + nombreId + ", tipo invalido con " + retExpresion.valor.tipo);
                        }
                    } else {
                        erroresEjecucion.addSemantico(pos, pos, "No se ha podido encontrar la variable " + nombreId + ", no existe");
                    }
                } else {
                    // es una variable local
                    int pos = tabla.obtenerPosLocal(nombreId, ambitos);
                    if (pos != -1) {
                        retExpresion = expresion.ejecutar(cod, tabla, ambitos, metodo);
                        if (retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)
                                || retExpresion.valor.tipo.equalsIgnoreCase(tipoVar)) {
                            cod.addMensaje("RESOLVIENDO ASIGNACION DE " + nombreId);
                            cod.addMensaje("Obteniendo posicion de " + nombreId);
                            cod.addCodigo("get_local 0\n");
                            cod.addCodigo(pos + "\n");
                            cod.addCodigo("add\n");
                            cod.addMensaje("Resolviendo Expresion a asignar");
                            cod.addCodigo(retExpresion.valor.valor.toString());
                            cod.addMensaje("Asignando Valor");
                            cod.addCodigo("set_local $calc\n");
                        } else {
                            erroresEjecucion.addSemantico(pos, pos, "No se puede asignar la variable de tipo  " + tipoVar + " " + nombreId + ", tipo invalido con " + retExpresion.valor.tipo);
                        }
                    } else {
                        erroresEjecucion.addSemantico(pos, pos, "No se ha podido encontrar la variable " + nombreId + ", no existe");
                    }
                }
            } else {
                erroresEjecucion.addSemantico(0, 0, "No existe la variable " + nombreId);
            }
        } else {
            //es un arreglo
            posArreglo elemento = (posArreglo)varAsignar.valor1;
            elementoRetorno ret = elemento.ejecutar(cod, tabla, ambitos, metodo);
            String tipoVar = tabla.obtenerTipoVar(elemento.nombreArreglo, ambitos);
            if(!(ret.valor.tipo.equalsIgnoreCase(Constantes.NULO))){
                String codigo = ret.valor.valor.toString();
                  retExpresion = expresion.ejecutar(cod, tabla, ambitos, metodo);
                        if (retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)
                                || retExpresion.valor.tipo.equalsIgnoreCase(tipoVar)) {
                            cod.addMensaje("RESOLVIENDO ASIGNACION DE " + elemento.nombreArreglo);
                            cod.addCodigo(ret.valor.valor.toString());
                            cod.addCodigo("set_local 4\n"); //saco el valor de la pila y solo me quedo con la direccion
                            cod.addCodigo("//obtengo la direccion de donde se debe asignar\n"); 
                            cod.addCodigo("get_local 5\n"); //saco el valor de la pila y solo me quedo con la direccion
                            cod.addMensaje("Resolviendo Expresion a asignar");
                            cod.addCodigo(retExpresion.valor.valor.toString());
                            cod.addMensaje("Asignando Valor");
                            cod.addCodigo("set_global $calc\n");
                        } else {
                            erroresEjecucion.addSemantico(0, 0, "No se puede asignar el arreglo  de tipo  " + tipoVar + " " + elemento.nombreArreglo + ", tipo invalido con " + retExpresion.valor.tipo);
                        }
            }else{
                erroresEjecucion.addSemantico(0, 0, "Ha ocurrido un error para resolver la asignacion de "+ elemento.nombreArreglo);
            }

        }
        
    }
    
    private void resolverTipo2(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        objetoBase val1 = varAsignar.valor1;
        objetoBase val2 = varAsignar.valor2;
        elementoRetorno retExpresion;
        
        if ((val1 instanceof Identificador) && (val2 instanceof Identificador)) {
            Identificador var1 = (Identificador) val1;
            Identificador var2 = (Identificador) val2;
            Object esAtributo = tabla.esAtributo(var1.nombreId, ambitos);
            if (esAtributo != null) {
                
                boolean atri = (boolean) esAtributo;
                if (atri) {
                    int pos = tabla.obtenerPosAtributo(var1.nombreId, ambitos);
                    if (pos != -1) {
                        String tipo1 = tabla.obtenerTipoVar(var1.nombreId, ambitos);
                        String tipo2 = tabla.obtenerTipoAtributoEDD(var2.nombreId, tipo1);
                        int pos2 = tabla.obtenerPosicionAtributoEDD(var2.nombreId, tipo1);
                        if (pos2 != -1) {
                            retExpresion = expresion.ejecutar(cod, tabla, ambitos, metodo);
                            if (retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)
                                    || retExpresion.valor.tipo.equalsIgnoreCase(tipo2)) {
                                cod.addMensaje("RESOLVIENDO ASIGNACION DE " + var1.nombreId + "." + var2.nombreId + " global");
                                String codigo = Constantes.INICIO_HEAP + "\n"
                                        + pos + "\n"
                                        + "ADD\n"
                                        + "get_global $calc\n"
                                        + "get_global $calc\n"
                                        + pos2 + "\n"
                                        + "ADD";
                                cod.addCodigo(codigo);
                                cod.addMensaje("Resolviendo Expresion a asignar");
                                cod.addCodigo(retExpresion.valor.valor.toString());
                                cod.addMensaje("Asignando Valor");
                                cod.addCodigo("set_global $calc\n");
                                
                            } else {
                                erroresEjecucion.addSemantico(pos, pos, "No se puede asignar la variable de tipo  tipo invalido con " + retExpresion.valor.tipo);
                            }
                        } else {
                            erroresEjecucion.addSemantico(0, 0, "El elemento " + var2.nombreId + ", en la variable " + var1.nombreId + ", no existe");
                        }
                    } else {
                        erroresEjecucion.addSemantico(0, 0, "No se puede resolver acceso, la variable " + var1.nombreId + ", no existe");
                    }
                    
                } else {
                    int pos = tabla.obtenerPosLocal(var1.nombreId, ambitos);
                    if (pos != -1) {
                        String tipo1 = tabla.obtenerTipoVar(var1.nombreId, ambitos);
                        String tipo2 = tabla.obtenerTipoAtributoEDD(var2.nombreId, tipo1);
                        int pos2 = tabla.obtenerPosicionAtributoEDD(var2.nombreId, tipo1);
                        if (pos2 != -1) {
                            retExpresion = expresion.ejecutar(cod, tabla, ambitos, metodo);
                            if (retExpresion.valor.tipo.equalsIgnoreCase(Constantes.NULO)
                                    || retExpresion.valor.tipo.equalsIgnoreCase(tipo2)) {
                                cod.addMensaje("RESOLVIENDO ASIGNACION DE " + var1.nombreId + "." + var2.nombreId);
                                cod.addCodigo("get_local 0\n");
                                cod.addCodigo(pos + "\n");
                                cod.addCodigo("ADD\n");
                                cod.addCodigo("get_local $calc\n");
                                cod.addCodigo("get_global $calc\n");
                                cod.addCodigo(pos2 + "\n");
                                cod.addCodigo("ADD\n");
                                cod.addMensaje("Resolviendo Expresion a asignar");
                                cod.addCodigo(retExpresion.valor.valor.toString());
                                cod.addMensaje("Asignando Valor");
                                cod.addCodigo("set_global $calc\n");
                                
                            } else {
                                erroresEjecucion.addSemantico(pos, pos, "No se puede asignar la variable de tipo  tipo invalido con " + retExpresion.valor.tipo);
                            }
                        } else {
                            erroresEjecucion.addSemantico(0, 0, "El elemento " + var2.nombreId + ", en la variable " + var1.nombreId + ", no existe");
                        }
                    } else {
                        erroresEjecucion.addSemantico(0, 0, "No se puede resolver acceso, la variable " + var1.nombreId + ", no existe");
                    }
                }
            } else {
                erroresEjecucion.addSemantico(0, 0, "No se puede resolver acceso, la variable " + var1.nombreId + ", no existe");
            }
            
        } else {
            
        }
        
    }
    
    private void resolverTipo3(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        
    }
    
}
