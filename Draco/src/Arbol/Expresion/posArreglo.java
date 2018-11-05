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
import D_Mas_Mas.Tabla_Simbolos.Simbolo;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.util.List;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class posArreglo extends objetoBase {

    public String nombreArreglo;
    public List<objetoBase> listaPosiciones;

    public posArreglo(Object nom, Object pos) {
        this.nombreArreglo = nom.toString();
        this.listaPosiciones = (List<objetoBase>) pos;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla, Ambito3D ambitos, String metodo) {

        Object esAtributo = tabla.esAtributo(nombreArreglo, ambitos);
        if (esAtributo != null) {
            boolean valAtri = (boolean) esAtributo;
            Simbolo simb;
            String codigo = "";
            int posArreglo = -1;
            if (valAtri) {
                simb = tabla.obtenerSimbAtributo(nombreArreglo, ambitos);
                if (simb != null) {
                    if (simb.tipoSimbolo.equalsIgnoreCase(Constantes.ARREGLO)) {
                        posArreglo = simb.apuntador;
                        codigo += "//asignando valores de dimenesiones al heap\n"
                                + "\n"
                                + "//para un arreglo global\n"
                                + "\n"
                                + "get_global 0\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "get_global $calc\n"
                                + "\n"
                                + "//para ambos casos\n"
                                + "\n"
                                + "get_global $calc // apuntador\n"
                                + "set_global 1 \n"
                                + "\n"
                                + "get_global 1\n"
                                + "get_global $calc // noDimensiones\n"
                                + "set_global 2\n"
                                + "\n"
                                + "\n"
                                + "get_global 2\n"
                                + "2\n"
                                + "MULT\n"
                                + "get_global 1\n"
                                + "ADD\n"
                                + "set_local 3 //posInician valor de las dimensiones\n";

                        codigo += Constantes.INICIO_HEAP + "\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "\n"
                                + "get_global $calc\n";
                        codigo += "//para un arreglo global\n"
                                + "\n"
                                + "get_global 0\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "get_global $calc\n"
                                + "\n";

                    } else {
                        erroresEjecucion.addSemantico(0, 0, "No se puede realizar el calculo de la posicion de " + nombreArreglo + ", debido a que no es un arreglo");
                    }
                } else {
                    erroresEjecucion.addSemantico(0, 0, "No existe el arreglo global " + nombreArreglo);
                }
            } else {
                simb = tabla.obtenerSimbLocal(nombreArreglo, ambitos);
                if (simb != null) {
                    if (simb.tipoSimbolo.equalsIgnoreCase(Constantes.ARREGLO)) {
                        posArreglo = simb.apuntador;

                        codigo += "//asignando valores de dimenesiones al heap\n"
                                + "\n"
                                + "//para un arreglo local\n"
                                + "get_local 0\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "get_local $calc\n"
                                + "\n"
                                + "\n"
                                + "get_global $calc // apuntador\n"
                                + "set_global 1 \n"
                                + "\n"
                                + "get_global 1\n"
                                + "get_global $calc // noDimensiones\n"
                                + "set_global 2\n"
                                + "\n"
                                + "\n"
                                + "get_global 2\n"
                                + "2\n"
                                + "MULT\n"
                                + "get_global 1\n"
                                + "ADD\n"
                                + "set_local 3 //posInician valor de las dimensiones\n";

                        codigo += "get_local 0\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "\n"
                                + "get_local $calc\n";

                        codigo += "//asignando valores de dimenesiones al heap local \n"
                                + "\n"
                                + "//para un arreglo local\n"
                                + "get_local 0\n"
                                + posArreglo + "\n"
                                + "ADD\n"
                                + "get_local $calc\n"
                                + "\n"
                                + "\n";
                    } else {
                        erroresEjecucion.addSemantico(0, 0, "No se puede realizar el calculo de la posicion de " + nombreArreglo + ", debido a que no es un arreglo");
                    }

                } else {
                    erroresEjecucion.addSemantico(0, 0, "No existe el arreglo local " + nombreArreglo);
                }
            }

            if (posArreglo != -1) {

                boolean bandera2 = true;

                codigo += "//para ambos casos\n"
                        + "\n"
                        + "get_global $calc // apuntador\n"
                        + "set_global 1 \n"
                        + "\n"
                        + "get_global 1\n"
                        + "get_global $calc // noDimensiones\n"
                        + "set_global 2\n"
                        + "\n"
                        + "\n"
                        + "get_global 2\n"
                        + "2\n"
                        + "MULT\n"
                        + "get_global 1\n"
                        + "ADD\n"
                        /* + "1\n"
                    + "ADD\n"*/
                        + "set_local 1 //posInician valor de las dimensiones\n"
                        + "\n"
                        + "get_local 1\n"
                        + "set_local 2\n"
                        + "\n";

                objetoBase temporal;
                for (int i = 0; i < this.listaPosiciones.size(); i++) {

                    temporal = listaPosiciones.get(i);
                    Valor v = temporal.ejecutar(cod, tabla, ambitos, metodo).valor;
                    if (v.tipo.equalsIgnoreCase(Constantes.ENTERO)) {
                        codigo += "get_local 2\n"
                                + "//resuelve expresion\n"
                                + v.valor.toString() + "\n"
                                + "//fin de resuelve expresion\n"
                                + "set_global $calc\n"
                                + "\n"
                                + "get_local 2\n"
                                + "1\n"
                                + "ADD\n"
                                + "set_local 2\n";
                    } else {
                        bandera2 = false;
                    }

                }

                String l0, l1, l2, l3, l4, l5, l6, lsalida;
                l0 = cod.getEtiqueta();
                l1 = cod.getEtiqueta();
                l2 = cod.getEtiqueta();
                l3 = cod.getEtiqueta();
                l4 = cod.getEtiqueta();
                l5 = cod.getEtiqueta();
                l6 = cod.getEtiqueta();
                lsalida = cod.getEtiqueta();
                codigo += "set_global 1 //tposInicio\n"
                        + "get_global 1\n"
                        + "\n"
                        + "\n"
                        + "get_global $calc //apuntador donde inicia el arreglo\n"
                        + "\n"
                        + "get_global $calc //numero de dimensiones \n"
                        + "\n"
                        + "//guardando la posicion donde en verdad inician las posiciones del arreglo\n"
                        + "\n"
                        + "set_global 2 // tDimensiones (t4)\n"
                        + "\n"
                        + "//calculo de tp\n"
                        + "\n"
                        + "get_global 1\n"
                        + "2 \n"
                        + "ADD\n"
                        + "set_global 3 // tp\n"
                        + "\n"
                        + "// calculo de tposInicio\n"
                        + "get_global 1\n"
                        + "2\n"
                        + "ADD\n"
                        + "set_global 1\n"
                        + "\n"
                        + "get_global 1\n"
                        + "get_global $calc\n"
                        + "get_global 1\n"
                        + "ADD\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 1\n"
                        + "\n"
                        + "1\n"
                        + "set_global 4 // tcont\n"
                        + "\n"
                        + "0\n"
                        + "set_global 5 //tRes\n"
                        + "\n"
                        + l0 + ":\n"
                        + "\n"
                        + "get_global 4\n"
                        + "get_global 2\n"
                        + "LTE\n"
                        + "BR_IF " + l2 + "\n"
                        + "BR " + l1 + "\n"
                        + "\n"
                        + l1 + ":\n"
                        + "\n"
                        + "//resuelvo expresion\n"
                        + "get_local 3\n"
                        + "get_global $calc\n"
                        + "//fin de expresion\n"
                        + "\n"
                        + "get_global 3\n"
                        + "get_global $calc\n"
                        + "LT \n"
                        + "BR_IF " + l4 + "\n"
                        + "BR " + l3 + "\n"
                        + "\n"
                        + l3 + ":\n"
                        + "get_global 4\n"
                        + "1\n"
                        + "DIFF\n"
                        + "EQZ\n"
                        + "BR_IF " + l6 + "\n"
                        + "BR " + l5 + "\n"
                        + "\n"
                        + l5 + ":\n"
                        + "\n"
                        + "//resuelvo expresion\n"
                        + "get_local 3\n"
                        + "get_global $calc\n"
                        + "//fin expresion\n"
                        + "\n"
                        + "0\n"
                        + "DIFF\n"
                        + "\n"
                        + "set_global 5\n"
                        + "\n"
                        + "get_global 4\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 4\n"
                        + "\n"
                        + "get_global 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 3\n"
                        + "///aqui viene lo nuevoo \n  "
                        + "get_local 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_local 3\n"
                        + "//fin de lo nuevo \n"
                        + "\n"
                        + "BR " + l0 + " \n"
                        + "\n"
                        + l6 + ":\n"
                        + "\n"
                        + "get_global 4\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 4\n"
                        + "\n"
                        + "get_global 3\n"
                        + "get_global $calc\n"
                        + "\n"
                        + "get_global 5\n"
                        + "MULT\n"
                        + "set_global 5\n"
                        + "\n"
                        + "//resuelvo expresion\n"
                        + "get_local 3\n"
                        + "get_global $calc\n"
                        + "//fin expresion\n"
                        + "\n"
                        + "get_global 5\n"
                        + "ADD\n"
                        + "0\n"
                        + "DIFF\n"
                        + "set_global 5\n"
                        + "\n"
                        + "get_global 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_global 3\n"
                        + "///aqui viene lo nuevoo \n  "
                        + "get_local 3\n"
                        + "1\n"
                        + "ADD\n"
                        + "set_local 3\n"
                        + "//fin de lo nuevo \n"
                        + "BR " + l0 + "\n"
                        + "\n"
                        + l4 + ":\n"
                        + "130\n"
                        + "get_global 4\n"
                        + "ADD //aqui va error \n"
                        + "BR " + lsalida + "\n"
                        + "\n"
                        + l2 + ":\n"
                        + "get_local 3\n"// + "get_global 1\n"
                        + "get_global 5\n"
                        + "ADD\n"
                        + "\n"
                        + "set_local 5\n"
                        + "get_local 5\n"
                        //"get_local 5\n" aqui es donde genera la posicion de donde se ubica el valor 
                        + "//linea donde obtengo el valor\n"
                        + "get_global $calc\n"
                        + "//para asignacion hacer un pop a la pila auxiliar\n"
                        + "\n"
                        + lsalida + ":\n";
                Valor c = new Valor(simb.tipoElemento, codigo);
                elementoRetorno ret = new elementoRetorno();
                ret.valor = c;
                return ret;

            } else {
                erroresEjecucion.addSemantico(0, 0, "No se puede realizar el calculo de la posicion de " + nombreArreglo + ", debido a que no existe");
            }

        } else {
            erroresEjecucion.addSemantico(0, 0, "No existe el arreglo " + nombreArreglo);
        }

        return new elementoRetorno(); //To change body of generated methods, choose Tools | Templates.
    }

}
