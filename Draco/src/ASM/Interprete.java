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
    public double calc;
    public String cadenaImpresion;

    public Interprete(ListaFunciones funciones) {
        this.funciones = funciones;
        this.heap = new double[20000];
        this.stack = new double[20000];
        this.aux = new Stack<>();
        this.calc=0;
        this.cadenaImpresion = "";
        heap[0]=1;
        stack[0]=1;
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
            
        } else if(instruccion instanceof Get_global){
            Get_global g = (Get_global)instruccion;
            getGlobal(g.valor);
            
        }else if(instruccion instanceof Set_global){
            Set_global g = (Set_global)instruccion;
            setGlobal(g.valor);
        }
        
        

    }

    private void insertarAuxiliar(double val) {
        this.aux.push(val);
    }
    
    private void getGlobal(baseASM instruccion){
        
        if (instruccion instanceof Entero) {
            Entero t = (Entero) instruccion;
            double d = this.heap[t.valor];
            insertarAuxiliar(d);

        } else if (instruccion instanceof Decimal) {
            Decimal t = (Decimal) instruccion;
            int g= (int)t.valor;
            double d = this.heap[g];
            insertarAuxiliar(d);
            

        }else{
            //es calc

            
            
        }
        
        
    }

    private void setGlobal(baseASM instruccion){
        if (instruccion instanceof Entero) {
            Entero t = (Entero) instruccion;
            int pos = t.valor;
            double valor = aux.pop();
            this.heap[pos]=valor;

        } else if (instruccion instanceof Decimal) {
            Decimal t = (Decimal) instruccion;

            

        }else{
            //es calc
             if (this.aux.size() >= 2) {
            this.calc= this.aux.pop();
            double pos= this.aux.pop();
            int v = (int)pos;
            this.heap[v]= calc;
             }
            
        }
    }
    private void imprimir() {
        if (this.aux.size() >= 2) {
            double exp = aux.pop();
            double tipo = aux.pop();
            if (tipo == 100) {
                //entero
                int v = (int) exp;
                this.cadenaImpresion += v + "\n";
            } else  if(tipo == 99){
                //caracter
                int c =(int) exp;
                char b =  (char)Integer.parseInt(String.valueOf(c));
                this.cadenaImpresion += b + "\n";
            }else if(tipo== 102){
                //decimal
                this.cadenaImpresion+=exp+"\n";
            }else if(tipo == 98){
                //bool
                if(exp ==1){
                    this.cadenaImpresion+="verdadero\n";
                }else{
                    this.cadenaImpresion+="falso\n";
                }
                
            }else if(tipo == 115){
                //string
                int posH= (int) exp;
                String cad="";
                int cont=posH;
                int temp;
                char c;
                while(this.heap[cont]!=-1){
                    temp= (int)heap[cont];
                    c= (char)Integer.parseInt(String.valueOf(temp));
                    cad+=c;
                    cont++;
                }
                this.cadenaImpresion+=cad+"\n";
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
