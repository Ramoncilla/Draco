/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion.ValidarExpresion;

import ASM.Generador;
import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresEjecucion;

/**
 *
 * @author Ramonella
 */
public class opRelacional extends elementoOperacion {

    Generador asm;

    public opRelacional(Generador c) {

        this.asm = c;
    }

    /* int int
        int double
        double int
        double double
        cadena caracter
        caracter cadena
        caracter caracter
        cadena cadena
        int caracter
        double caracter
        caracter double
        caracter int
        bool bool
     */
    public Valor menor(Valor v1, Valor v2) {
        if (esEntero(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esEntero(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esDecimal(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esDecimal(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esCadena(v1) && esCaracter(v2)) {
            Valor e1 = casterCadenaAEntero(v1);
            return obtenerCadenaOP(e1,v2,"LT");

        } else if (esCaracter(v1) && esCadena(v2)) {

            Valor e2 = casterCadenaAEntero(v2);
            return obtenerCadenaOP(v1,e2,"LT");
            
        } else if (esCaracter(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1,v2,"LT");

        } else if (esCadena(v1) && esCadena(v2)) {
            Valor e1 = casterCadenaAEntero(v1);
            Valor e2 = casterCadenaAEntero(v2);
            return obtenerCadenaOP(e1,e2,"LT");
        } else if (esEntero(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esDecimal(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esCaracter(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");

        } else if (esCaracter(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LT");
        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion menor con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public Valor menorIgual(Valor v1, Valor v2) {
        if (esEntero(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esEntero(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esDecimal(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esDecimal(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esCadena(v1) && esCaracter(v2)) {
            Valor e1= this.casterCadenaAEntero(v1);
            return this.obtenerCadenaOP(e1, v2, "LTE");
            
        } else if (esCaracter(v1) && esCadena(v2)) {
            Valor e2= this.casterCadenaAEntero(v2);
            return this.obtenerCadenaOP(v1, e2, "LTE");

        } else if (esCaracter(v1) && esCaracter(v2)) {
            return this.obtenerCadenaOP(v1, v2, "LTE");

        } else if (esCadena(v1) && esCadena(v2)) {
            Valor e1= this.casterCadenaAEntero(v1);
             Valor e2= this.casterCadenaAEntero(v2);
            return this.obtenerCadenaOP(e1, e2, "LTE");

        } else if (esEntero(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esDecimal(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esCaracter(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");

        } else if (esCaracter(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "LTE");
        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion menor igual con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public Valor mayor(Valor v1, Valor v2) {
        if (esEntero(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esEntero(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esDecimal(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esDecimal(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esCadena(v1) && esCaracter(v2)) {
             Valor e1= this.casterCadenaAEntero(v1);
             return this.obtenerCadenaOP(e1, v2, "GT");

        } else if (esCaracter(v1) && esCadena(v2)) {
             Valor e2= this.casterCadenaAEntero(v2);
             return this.obtenerCadenaOP(v1, e2, "GT");

        } else if (esCaracter(v1) && esCaracter(v2)) {

             return this.obtenerCadenaOP(v1, v2, "GT");
        } else if (esCadena(v1) && esCadena(v2)) {
 Valor e1= this.casterCadenaAEntero(v1);
  Valor e2= this.casterCadenaAEntero(v2);
             return this.obtenerCadenaOP(e1, e2, "GT");
        } else if (esEntero(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esDecimal(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esCaracter(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");

        } else if (esCaracter(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GT");
        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion mayor con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public Valor mayorIgual(Valor v1, Valor v2) {
        if (esEntero(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esEntero(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esDecimal(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esDecimal(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esCadena(v1) && esCaracter(v2)) {
             Valor e1= this.casterCadenaAEntero(v1);
 
             return this.obtenerCadenaOP(e1, v2, "GTE");

        } else if (esCaracter(v1) && esCadena(v2)) {
  
  Valor e2= this.casterCadenaAEntero(v2);
             return this.obtenerCadenaOP(v1, e2, "GTE");

        } else if (esCaracter(v1) && esCaracter(v2)) {
   
             return this.obtenerCadenaOP(v1, v2, "GTE");
        } else if (esCadena(v1) && esCadena(v2)) {
   Valor e1= this.casterCadenaAEntero(v1);
  Valor e2= this.casterCadenaAEntero(v2);
             return this.obtenerCadenaOP(e1, e2, "GTE");
        } else if (esEntero(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esDecimal(v1) && esCaracter(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esCaracter(v1) && esEntero(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");

        } else if (esCaracter(v1) && esDecimal(v2)) {
            return obtenerCadenaOP(v1, v2, "GTE");
        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion mayor igual con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public Valor distintoA(Valor v1, Valor v2) {
        String etiqV, etiqF, cod;
        if (esEntero(v1) && esEntero(v2)) {

            
            
        } else if (esEntero(v1) && esDecimal(v2)) {

        } else if (esDecimal(v1) && esEntero(v2)) {

        } else if (esDecimal(v1) && esDecimal(v2)) {

        } else if (esCadena(v1) && esCaracter(v2)) {

        } else if (esCaracter(v1) && esCadena(v2)) {

        } else if (esCaracter(v1) && esCaracter(v2)) {

        } else if (esCadena(v1) && esCadena(v2)) {

        } else if (esEntero(v1) && esCaracter(v2)) {

        } else if (esDecimal(v1) && esCaracter(v2)) {

        } else if (esCaracter(v1) && esEntero(v2)) {

        } else if (esCaracter(v1) && esDecimal(v2)) {

        } else if (esBooleano(v1) && esBooleano(v2)) {

        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion distinto a con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }

    public Valor igualIgual(Valor v1, Valor v2) {
        String etiqV, etiqF, cod;

        /* int int
        int double
        double int
        double double
        cadena caracter
        caracter cadena
        caracter caracter
        cadena cadena
        int caracter
        double caracter
        caracter double
        caracter int
        bool bool*/
        if (esEntero(v1) && esEntero(v2)) {

        } else if (esEntero(v1) && esDecimal(v2)) {

        } else if (esDecimal(v1) && esEntero(v2)) {

        } else if (esDecimal(v1) && esDecimal(v2)) {

        } else if (esCadena(v1) && esCaracter(v2)) {

        } else if (esCaracter(v1) && esCadena(v2)) {

        } else if (esCaracter(v1) && esCaracter(v2)) {

        } else if (esCadena(v1) && esCadena(v2)) {

        } else if (esEntero(v1) && esCaracter(v2)) {

        } else if (esDecimal(v1) && esCaracter(v2)) {

        } else if (esCaracter(v1) && esEntero(v2)) {

        } else if (esCaracter(v1) && esDecimal(v2)) {

        } else if (esBooleano(v1) && esBooleano(v2)) {

        }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion distinto a con los tipos " + v1.tipo + " y " + v2.tipo);
        return new Valor();
    }
    
    private Valor obtenerCadenaOP(Valor v1, Valor v2, String operador) {
        String etiqV, etiqF, cod;
        nodoCondicion ret;
        etiqV = asm.getEtiqueta();
        etiqF = asm.getEtiqueta();
        cod = getCadenaValor(v1) + "\n"
                + getCadenaValor(v2) + "\n"
                + operador + "\n"
                + "BR_IF " + etiqF + "\n"
                + "BR " + etiqV + "\n";
        ret = new nodoCondicion(cod);
        ret.addVerdadera(etiqV);
        ret.addFalsa(etiqF);
        Valor c = new Valor(Constantes.CONDICION, ret);
        return c;
    }

    private Valor casterCadenaAEntero(Valor val1) {
        
        String l0,l1,l2;
        l0= asm.getEtiqueta();
        l1= asm.getEtiqueta();
        l2= asm.getEtiqueta();
        String codigo = "// cadena a convertir\n"
                + val1.valor.toString()+"\n";

        codigo += "//iniciando el caluclo de la sumatorio de caracteres\n"
                + "set_global 1 //pos del caracter actual\n"
                + "0\n"
                + "set_global 2 //acumulador \n"
                + "\n"
                + l0+":\n"
                + "get_global 1 \n"
                + "get_global $calc //caracter actual (tVal)\n"
                + "-1\n"
                + "DIFF\n"
                + "EQZ\n"
                + "BR_IF "+l1+"\n"
                + "BR "+l2+"\n"
                + "\n"
                + l1+":\n"
                + "//calculando tVal\n"
                + "get_global 1 \n"
                + "get_global $calc //caracter actual (tVal)\n"
                + "get_global 2\n"
                + "ADD\n"
                + "set_global 2\n"
                + "\n"
                + "get_global 1\n"
                + "1\n"
                + "ADD\n"
                + "set_global 1\n"
                + "\n"
                + "BR "+l0+"\n"
                + "\n"
                + l2+":\n"
                + "get_global 2\n"
                + "//fin de obtener valor entero de una cadena \n";
        
        Valor r = new Valor();
        r.crearEntero(codigo);
        return r;
    }
    /*
    public nodoCondicion distintoA (Valor v1, Valor v2){
        String etiqV, etiqF, cod;
        
         /* int int
        int double
        double int
        double double
        cadena caracter
        caracter cadena
        caracter caracter
        cadena cadena
        int caracter
        double caracter
        caracter double
        caracter int
        bool bool
       
        
         if(esEntero(v1) && esEntero(v2)){
             etiqV= asm.getEtiqueta();
             etiqF= asm.getEtiqueta();
             cod= getCadenaValor(v1)+"\n"
                     +getCadenaValor(v2)+ "\n"
                     + ""
             
             
             
         }else if(esEntero(v1) && esDecimal(v2)){
             
             
         }else if(esDecimal(v1) && esEntero(v2)){
             
             
         }else if(esDecimal(v1) && esDecimal(v2)){
             
             
         }else if(esCadena(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esCadena(v2)){
             
             
         }else if(esCaracter(v1) && esCaracter(v2)){
             
             
         }else if(esCadena(v1) && esCadena(v2)){
             
             
         }else if(esEntero(v1) && esCaracter(v2)){
             
             
         }else if(esDecimal(v1) && esCaracter(v2)){
             
             
         }else if(esCaracter(v1) && esEntero(v2)){
             
             
         }else if(esCaracter(v1) && esDecimal(v2)){
             
             
         }else if(esBooleano(v1) && esBooleano(v2)){
             
             
         }
        erroresEjecucion.addSemantico(0, 0, "No es valido realizar operacion distinto a con los tipos "+ v1.tipo+" y "+ v2.tipo);
        return null;
    }
    
    
     */

}
