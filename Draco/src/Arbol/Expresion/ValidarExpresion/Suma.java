/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Generador;
import ASM.Valor;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class Suma extends elementoOperacion {

    public Generador gen;

    public Suma(Generador c) {
        this.gen = c;
    }

    public Valor operar(Valor v1, Valor v2) {

        Valor ret = new Valor();
        String s;

        /*----- Enteros  ----------*/
        if (esEntero(v1) && esDecimal(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esDecimal(v1) && esEntero(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esDecimal(v1) && esCaracter(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esCaracter(v1) && esDecimal(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esBooleano(v1) && esDecimal(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esDecimal(v1) && esBooleano(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } else if (esDecimal(v1) && esDecimal(v2)) {
            s = sumar(v1, v2);
            ret.crearDecimal(s);
            return ret;

        } /*----- Enteros  ----------*/ 
        else if (esEntero(v1) && esCaracter(v2)) {
            s = sumar(v1, v2);
            ret.crearEntero(s);
            return ret;

        } else if (esCaracter(v1) && esEntero(v2)) {
            s = sumar(v1, v2);
            ret.crearEntero(s);
            return ret;
        } else if (esBooleano(v1) && esEntero(v2)) {
            s = sumar(v1, v2);
            ret.crearEntero(s);
            return ret;
        } else if (esEntero(v1) && esBooleano(v2)) {
            s = sumar(v1, v2);
            ret.crearEntero(s);
            return ret;
        } else if (esEntero(v1) && esEntero(v2)) {
            s = sumar(v1, v2);
            ret.crearEntero(s);
            return ret;
        } /*------------ Cadena --------------------*/ 
        else if (esCadena(v1) && esEntero(v2)) {

        } else if (esCadena(v1) && esDecimal(v2)) {

        } else if (esDecimal(v1) && esCadena(v2)) {

        } else if (esEntero(v1) && esCadena(v2)) {

        } else if (esCadena(v1) && esCaracter(v2)) {
            Valor cad1= charACadena(v2);
            String c = sumarCadenas(v1, cad1);
            ret.crearCadena(c);
            return ret;
        } else if (esCaracter(v1) && esCadena(v2)) {
            Valor cad1= charACadena(v1);
            String c = sumarCadenas(cad1, v2);
            ret.crearCadena(c);
            return ret;
        } else if (esCadena(v1) && esCadena(v2)) {
            String c = sumarCadenas(v1, v2);
            ret.crearCadena(c);
            return ret;
        }else if(esCaracter(v1) && esCaracter(v2)){
            Valor c1 = charACadena(v1);
            Valor c2 = charACadena(v2);
            String c = sumarCadenas(c1, c2);
            ret.crearCadena(c);
            return ret;
            
        }/*---------- Booleanos -----------------*/ 
        else if (esBooleano(v1) && esBooleano(v2)) {
            s = sumar(v1, v2);
            ret.crearBooleano(s);
            return ret;
        }
        erroresEjecucion.addSemantico(0, 0, "Tipo no valido para realizar una suma, " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public String sumar(Valor v1, Valor v2) {
        String val = v1.valor.toString() + "\n"
                + v2.valor.toString() + "\n"
                + "ADD";
        return val;
    }

    
    private Valor charACadena(Valor v){
        
        String cadena="//castear char a cadena\n" +
"\n" +
"get_global 0\n" +
"get_global 0\n" +
v.valor+"\n" +
"set_global $calc\n" +
"\n" +
"get_global 0\n" +
"1\n" +
"ADD\n" +
"set_global 0\n" +
"\n" +
"get_global 0\n" +
"-1\n" +
"set_global $calc\n" +
"\n" +
"get_global 0\n" +
"1\n" +
"ADD\n" +
"set_global 0\n";
        
        Valor vRet = new Valor();
        vRet.crearCadena(cadena);
        return vRet;
    }
    
    
   
    public String sumarCadenas(Valor v1, Valor v2) {
        String l0, l1, l2, l3, l4, l5;
        l0 = gen.getEtiqueta();
        l1 = gen.getEtiqueta();
        l2 = gen.getEtiqueta();
        l3 = gen.getEtiqueta();
        l4 = gen.getEtiqueta();
        l5 = gen.getEtiqueta();
        String codigo = v1.valor.toString() + "\n"
                + v2.valor.toString() + "\n";

        codigo += "set_global 2\n"
                + "SET_GLOBAL 1 \n"
                + "\n"
                + "//buscando el valor del heap\n"
                + "get_global 0\n"
                + "\n"
                + "//--- Cadena 1\n"
                + "get_global 0\n"
                + "get_global 1\n"
                + "\n"
                + "get_global 0\n"
                + "get_global 1\n"
                + "\n"
                + "get_global $calc\n"
                + l0 + ":\n"
                + "set_global 3\n"
                + "get_global 3\n"
                + "get_global 3 \n"
                + "\n"
                + "-1\n"
                + "DIFF\n"
                + "EQZ\n"
                + "\n"
                + "BR_IF " + l1 + " //verdaderas\n"
                + "BR " + l2 + " //falsas\n"
                + l1 + ":\n"
                + "set_global $calc\n"
                + "1\n"
                + "ADD\n"
                + "set_global 1\n"
                + "1\n"
                + "ADD\n"
                + "set_global 0\n"
                + "//calculo de valor = heap[posInicial]\n"
                + "get_global 0\n"
                + "get_global 1\n"
                + "\n"
                + "get_global 0\n"
                + "get_global 1\n"
                + "\n"
                + "get_global $calc //H\n"
                + "BR " + l0 + "\n"
                + l2 + ":\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "//segunda cadena\n"
                + "\n"
                + "get_global 0\n"
                + "get_global 2\n"
                + "\n"
                + "get_global 0\n"
                + "get_global 2\n"
                + "\n"
                + "get_global $calc //L\n"
                + "\n"
                + l3 + ":\n"
                + "set_global 3\n"
                + "get_global 3\n"
                + "get_global 3 // ingresando una vez mas H\n"
                + "\n"
                + "-1\n"
                + "DIFF\n"
                + "EQZ\n"
                + "\n"
                + "BR_IF " + l4 + " //verdaderas\n"
                + "BR " + l5 + "//falsas\n"
                + "\n"
                + l4 + ":\n"
                + "set_global $calc\n"
                + "1\n"
                + "ADD\n"
                + "set_global 2\n"
                + "// 108 12 12\n"
                + "1\n"
                + "ADD\n"
                + "set_global 0\n"
                + "//calculo de valor = heap[posInicial]\n"
                + "get_global 0\n"
                + "get_global 2\n"
                + "\n"
                + "get_global 0\n"
                + "get_global 2\n"
                + "\n"
                + "get_global $calc //H\n"
                + "BR " + l3 + "\n"
                + l5 + ":\n"
                + "//108 12 14 8 14 -1\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "set_global 3\n"
                + "\n"
                + "//extra\n"
                + "get_global 0\n"
                + "-1\n"
                + "set_global $calc\n"
                + "get_global 0\n"
                + "1\n"
                + "ADD\n"
                + "set_global 0";

        return codigo;

    }
    
    
    

}
