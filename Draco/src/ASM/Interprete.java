/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import ASM.Arbol.Funcion;
import ASM.Arbol.ListaFunciones;
import ASM.Arbol.*;
import draco.Constantes;
import java.util.Stack;

/**
 *
 * @author Ramonella
 */
public class Interprete {

    ListaFunciones funciones;
    public double[] heap;
    public double[] stack;
    public Stack<Double> aux;
    public int h;
    public int p;
    public String cadenaImpresion;

    public Interprete(ListaFunciones funciones) {
        this.funciones = funciones;
        this.heap = new double[20000];
        this.stack = new double[20000];
        this.aux = new Stack<>();
        this.h = 0;
        this.p = 0;
        this.cadenaImpresion = "";
    }

    public String ejecutar() {
        Funcion temp;
        baseASM instruccionTemp;
        for (int i = 0; i < this.funciones.Size(); i++) {
            temp = this.funciones.get(i);
            if (temp.nombreFunc.equalsIgnoreCase(Constantes.PRINCIPAL)) {
                for (int j = 0; j < temp.sentencias.Size(); j++) {
                    instruccionTemp = temp.sentencias.get(j);
                    ejecutarInstruccion(instruccionTemp);
                }
            }
        }
        System.out.println("Impresion:     " + this.cadenaImpresion);
        return this.cadenaImpresion;
    }

    private void ejecutarInstruccion(baseASM instruccion) {

        if (instruccion instanceof PRINT) {
            imprimir();
            
        } else if (instruccion instanceof Entero) {
            Entero t = (Entero) instruccion;
            insertarAuxiliar(t.valor);

        } else if (instruccion instanceof Decimal) {
            Decimal t = (Decimal) instruccion;
            insertarAuxiliar(t.valor);

        } else if (instruccion instanceof DIFF) {
            restar();
            
        } else if (instruccion instanceof DIV) {
            dividir();
            
        } else if (instruccion instanceof MULT) {
            multiplicar();
            
        } else if (instruccion instanceof ADD) {
            sumar();
            
        }

    }

    private void insertarAuxiliar(double val) {
        this.aux.push(val);
    }

    private void imprimir() {
        if (this.aux.size() >= 2) {
            double exp = aux.pop();
            double tipo = aux.pop();
            if (tipo == 99) {
                int v = (int) exp;
                this.cadenaImpresion += v + "\n";
            } else {

            }
        }
    }

    private void multiplicar() {
        if (this.aux.size() >= 2) {
            double val1 = aux.pop();
            double val2 = aux.pop();
            double res = val1 * val2;
            this.aux.push(res);
        }
    }

    private void dividir() {
        if (this.aux.size() >= 2) {
            double val1 = aux.pop();
            double val2 = aux.pop();
            double res = val1 / val2;
            this.aux.push(res);
        }
    }

    private void restar() {
        if (this.aux.size() >= 2) {
            double val1 = aux.pop();
            double val2 = aux.pop();
            double res = val1 - val2;
            this.aux.push(res);
        }

    }

    private void sumar() {
        if (this.aux.size() >= 2) {
            double val1 = aux.pop();
            double val2 = aux.pop();
            double res = val1 + val2;
            this.aux.push(res);
        }
    }

}
