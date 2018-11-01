/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.Valor;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Acceso extends objetoBase {

    public int tipoAcceso;
    public objetoBase valor1;
    public objetoBase valor2;
    public objetoBase valor3;

    public Acceso(Object tipo, Object val1) {
        this.tipoAcceso = (int) tipo;
        this.valor1 = (objetoBase) val1;
    }

    public Acceso(Object tipo, Object val1, Object val2) {
        this.tipoAcceso = (int) tipo;
        this.valor1 = (objetoBase) val1;
        this.valor2 = (objetoBase) val2;

    }

    public Acceso(Object tipo, Object val1, Object val2, Object val3) {
        this.tipoAcceso = (int) tipo;
        this.valor1 = (objetoBase) val1;
        this.valor2 = (objetoBase) val2;
        this.valor3 = (objetoBase) val3;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

        switch (tipoAcceso) {
            case 1: {
                Valor c = resolverTipo1(cod, tabla, ambitos, metodo);
                elementoRetorno ret = new elementoRetorno();
                ret.valor = c;

                return ret;
            }

            case 2: {
                Valor c = resolverTipo2(cod, tabla, ambitos, metodo);
                elementoRetorno ret = new elementoRetorno();
                ret.valor = c;

                return ret;
            }

            case 3: {
                resolverTipo3(cod, tabla, ambitos, metodo);
                break;
            }
        }

        return new elementoRetorno();
    }

    private Valor resolverTipo1(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {
        if (valor1 instanceof Identificador) {
            Identificador id = (Identificador) valor1;
            String nombreId = id.nombreId;
            Object esAtributo = tabla.esAtributo(nombreId, ambitos);
            String tipoVar = tabla.obtenerTipoVar(nombreId, ambitos);
            if (esAtributo != null) {
                boolean atri = (boolean) esAtributo;
                if (atri) {
                    // es una variable global
                    int pos = tabla.obtenerPosAtributo(nombreId, ambitos);
                    if (pos != -1) {
                        String codigo = "//OBTENIENDO EL VALOR DE  " + nombreId + " VARIABLE GLOBAL\n"
                                + Constantes.INICIO_HEAP + "\n"
                                + pos + "\n"
                                + "add\n"
                                + "get_global $calc\n";

                        Valor v = new Valor();
                        v.tipo = tipoVar;
                        v.valor = codigo;
                        return v;

                    } else {
                        erroresEjecucion.addSemantico(pos, pos, "No se ha podido encontrar la variable " + nombreId + ", no existe");
                    }
                } else {
                    // es una variable local
                    int pos = tabla.obtenerPosLocal(nombreId, ambitos);
                    if (pos != -1) {
                        String codigo = "//OBTENIENDO EL VALOR DE  " + nombreId + " VARIABLE LOCAL \n"
                                + "get_local 0\n"
                                + pos + "\n"
                                + "add\n"
                                + "get_local $calc\n";

                        Valor v = new Valor();
                        v.tipo = tipoVar;
                        v.valor = codigo;
                        return v;
                    } else {
                        erroresEjecucion.addSemantico(pos, pos, "No se ha podido encontrar la variable " + nombreId + ", no existe");
                    }
                }
            } else {
                erroresEjecucion.addSemantico(0, 0, "No existe la variable " + nombreId);
            }
        } else {
            //es un arreglo

        }

        return new Valor();
    }

    private Valor resolverTipo2(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

        if ((valor1 instanceof Identificador) && (valor2 instanceof Identificador)) {
            Identificador var1 = (Identificador) valor1;
            Identificador var2 = (Identificador) valor2;
            Object esAtributo = tabla.esAtributo(var1.nombreId, ambitos);
            if (esAtributo != null) {

                boolean atri = (boolean) esAtributo;
                if (atri) {
                    int pos = tabla.obtenerPosAtributo(var1.nombreId, ambitos);
                    String tipo = tabla.obtenerTipoVar(var1.nombreId, ambitos);
                    if (pos != -1) {
                        int pos2 = tabla.obtenerPosicionAtributoEDD(var2.nombreId, tipo);
                        String tipo2 = tabla.obtenerTipoAtributoEDD(var2.nombreId, tipo);
                        if (pos2 != -1) {

                            String codigo = "//RESOLVIENDO ACCESO DE " + var1.nombreId + "." + var2.nombreId + " global \n"
                                    + Constantes.INICIO_HEAP+"\n" +
pos+"\n" +
"ADD\n" +
"get_global $calc\n" +
"get_global $calc\n" +
pos2+"\n" +
"ADD\n" +
"get_global $calc";
                            Valor v = new Valor();
                            v.tipo = tipo2;
                            v.valor = codigo;
                            return v;
                        } else {
                            erroresEjecucion.addSemantico(0, 0, "El elemento " + var2.nombreId + ", en la variable " + var1.nombreId + ", no existe");
                        }
                    } else {
                        erroresEjecucion.addSemantico(0, 0, "No se puede resolver acceso, la variable " + var1.nombreId + ", no existe");
                    } 

                } else {
                    int pos = tabla.obtenerPosLocal(var1.nombreId, ambitos);
                    String tipo = tabla.obtenerTipoVar(var1.nombreId, ambitos);
                    if (pos != -1) {
                        int pos2 = tabla.obtenerPosicionAtributoEDD(var2.nombreId, tipo);
                        String tipo2 = tabla.obtenerTipoAtributoEDD(var2.nombreId, tipo);
                        if (pos2 != -1) {

                            String codigo = "//RESOLVIENDO ACCESO DE " + var1.nombreId + "." + var2.nombreId + "\n"
                                    + "get_local 0\n"
                                    + pos + "\n"
                                    + "ADD\n"
                                    + "get_local $calc\n"
                                    + "get_global $calc\n"
                                    + pos2 + "\n"
                                    + "ADD\n"
                                    + "get_global $calc\n";
                            Valor v = new Valor();
                            v.tipo = tipo2;
                            v.valor = codigo;
                            return v;
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

        return new Valor();
    }

    private void resolverTipo3(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

    }

}
