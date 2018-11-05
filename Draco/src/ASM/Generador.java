/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import Arbol.Expresion.ValidarExpresion.nodoCondicion;

/**
 *
 * @author Ramonella
 */
public class Generador {

    public String codigo;
    public int contEtiquetas;
    public Etiquetas etiquetasRetorno;
    public Etiquetas etiquetasBreak;
    public Etiquetas etiquetasContinuar;

    public Generador() {
        this.codigo = "";
        this.contEtiquetas = 0;
        this.etiquetasRetorno = new Etiquetas();
        this.etiquetasBreak = new Etiquetas();
        this.etiquetasContinuar = new Etiquetas();
    }

    public void addCodigo(String c) {
        this.codigo += c;
    }

    public void addMensaje(String c) {
        this.codigo += "/*" + c + "*/\n";
    }

    public void imprimirCod() {
        System.out.println(this.codigo);
    }

    public String getEtiqueta() {
        contEtiquetas++;
        return "L" + contEtiquetas;
    }

    public nodoCondicion casteoBoolCondicion(Valor v) {

        String etiqV = this.getEtiqueta();
        String etiqF = this.getEtiqueta();
        String codigo = v.valor.toString() + "\n"
                + "1\n"
                + "DIFF\n"
                + "EQZ\n"
                + "BR_IF " + etiqF + " //etiqueta Falsa\n"
                + "BR " + etiqV + " //verdadera\n";
        nodoCondicion retorno = new nodoCondicion(codigo);
        retorno.addFalsa(etiqF);
        retorno.addVerdadera(etiqV);
        return retorno;
    }

  
   

}
