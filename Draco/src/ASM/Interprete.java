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

    CuerpoFuncion sentencias;
    public double[] heap;
    public double[] stack;
    public Stack<Double> aux;
    public double calc;
    public String cadenaImpresion;

    public Interprete(CuerpoFuncion funciones) {
        this.sentencias = funciones;
        this.heap = new double[20000];
        this.stack = new double[20000];
        this.aux = new Stack<>();
        this.calc = 0;
        this.cadenaImpresion = "";
        heap[0] = 6;
        stack[0] = 1;
    }

    public String ejecutar() {
        baseASM temp;
        baseASM sentTempo2;
        boolean banderaE = true;
        for (int i = 0; i < this.sentencias.Size(); i++) {

            if (banderaE) {
                temp = this.sentencias.get(i);
                if (temp instanceof InicioFuncion) {
                    InicioFuncion f = (InicioFuncion) temp;
                    if (f.nombreFuncion.equalsIgnoreCase(Constantes.PRINCIPAL)) {
                        for (int j = i; j < this.sentencias.Size(); j++) {
                            sentTempo2 = this.sentencias.get(j);
                            if (sentTempo2 instanceof FinFuncion) {
                                //if(sentTempo2.nombre.toUpperCase() == principal.toUpperCase()){
                                banderaE = false;
                                break;
                                //}
                            }
                            if (sentTempo2 instanceof BR) {
                                this.ejecutarInstruccion(sentTempo2);
                                banderaE = false;
                                break;
                            }
                            
                            if (sentTempo2 instanceof BR_IF) {
                                this.ejecutarInstruccion(sentTempo2);
                                banderaE = false;
                                break;
                            }
                            this.ejecutarInstruccion(sentTempo2);
                        }
                    }
                }
            } else {
                break;
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

        } else if (instruccion instanceof Get_global) {
            Get_global g = (Get_global) instruccion;
            getGlobal(g.valor);

        } else if (instruccion instanceof Set_global) {
            Set_global g = (Set_global) instruccion;
            setGlobal(g.valor);
        } else if (instruccion instanceof REL) {
            REL g = (REL) instruccion;
            relacional(g.operador);
        }else if(instruccion instanceof BR){
            BR salto = (BR) instruccion;
            this.saltar(salto.etiqueta);
        }else if(instruccion instanceof BR_IF){
            double d = this.aux.pop();
            BR_IF salto = (BR_IF)instruccion;
            if(d==0){
                this.saltar(salto.etiqF);
            }else{
                this.saltar(salto.etiV);
                System.out.println("No es valido realizar el salto con "+ salto.etiqF);
            }
        }else if(instruccion instanceof EQZ){
            double d = this.aux.pop();
            if(d==0){
                this.aux.push(1.0);
            }else{
                this.aux.push(0.0);
            }
        }
        
    }

    private void insertarAuxiliar(double val) {
        this.aux.push(val);
    }

    private void getGlobal(baseASM instruccion) {

        if (instruccion instanceof Entero) {
            Entero t = (Entero) instruccion;
            double d = this.heap[t.valor];
            insertarAuxiliar(d);

        } else if (instruccion instanceof Decimal) {
            Decimal t = (Decimal) instruccion;
            int g = (int) t.valor;
            double d = this.heap[g];
            insertarAuxiliar(d);
        } else {
            //es calc
            this.calc = this.aux.pop();
            int v = (int) calc;
            double d = this.heap[v];
            insertarAuxiliar(d);
        }
    }

    private void setGlobal(baseASM instruccion) {
        if (instruccion instanceof Entero) {
            Entero t = (Entero) instruccion;
            int pos = t.valor;
            double valor = aux.pop();
            this.heap[pos] = valor;

        } else if (instruccion instanceof Decimal) {
            Decimal t = (Decimal) instruccion;
            int pos = (int) t.valor;
            double valor = aux.pop();
            this.heap[pos] = valor;
        } else {
            //es calc
            if (this.aux.size() >= 2) {
                this.calc = this.aux.pop();
                double pos = this.aux.pop();
                int v = (int) pos;
                this.heap[v] = calc;
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
            } else if (tipo == 99) {
                //caracter
                int c = (int) exp;
                char b = (char) Integer.parseInt(String.valueOf(c));
                this.cadenaImpresion += b + "\n";
            } else if (tipo == 102) {
                //decimal
                this.cadenaImpresion += exp + "\n";
            } else if (tipo == 98) {
                //bool
                if (exp == 1) {
                    this.cadenaImpresion += "verdadero\n";
                } else {
                    this.cadenaImpresion += "falso\n";
                }

            } else if (tipo == 115) {
                //string
                int posH = (int) exp;
                String cad = "";
                int cont = posH;
                int temp;
                char c;
                while (this.heap[cont] != -1) {
                    temp = (int) heap[cont];
                    c = (char) Integer.parseInt(String.valueOf(temp));
                    cad += c;
                    cont++;
                }
                this.cadenaImpresion += cad + "\n";
            }
        }
    }

    private void relacional(String oper) {
        if (this.aux.size() >= 2) {
            double val2 = aux.pop();
            double val1 = aux.pop();
            switch (oper) {

                case "<": {
                    if (val1 < val2) {
                        aux.push(1.0);
                    } else {
                        aux.push(0.0);
                    }
                    break;
                }
                case ">": {
                    if (val1 > val2) {
                        aux.push(1.0);
                    } else {
                        aux.push(0.0);
                    }
                    break;
                }
                case "<=": {
                    if (val1 <= val2) {
                        aux.push(1.0);
                    } else {
                        aux.push(0.0);
                    }
                    break;
                }

                case ">=": {
                    if (val1 >= val2) {
                        aux.push(1.0);
                    } else {
                        aux.push(0.0);
                    }
                    break;
                }
            }
        }
    }

    private void multiplicar() {
        if (this.aux.size() >= 2) {
            double val2 = aux.pop();
            double val1 = aux.pop();
            double res = val1 * val2;
            this.aux.push(res);
        }
    }

    private void dividir() {
        if (this.aux.size() >= 2) {
            double val2 = aux.pop();
            double val1 = aux.pop();
            double res = val1 / val2;
            this.aux.push(res);
        }
    }

    private void restar() {
        if (this.aux.size() >= 2) {
            double val2 = aux.pop();
            double val1 = aux.pop();
            double res = val1 - val2;
            this.aux.push(res);
        }

    }

    private void sumar() {
        if (this.aux.size() >= 2) {
            double val2 = aux.pop();
            double val1 = aux.pop();
            double res = val1 + val2;
            this.aux.push(res);
        }
    }

    private void saltar(String nombreSalto) {
        baseASM sentTemporal, sentTempo2;
        boolean banderaE = true;
        for (int i = 0; i < this.sentencias.Size(); i++) {
            if (banderaE == true) {
                sentTemporal = this.sentencias.get(i);
                if (sentTemporal instanceof ETIQUETA) {
                    ETIQUETA t = (ETIQUETA) sentTemporal;
                    if (t.etiqueta.equalsIgnoreCase(nombreSalto)) {
                        for (int j = i; j < this.sentencias.Size(); j++) {
                            sentTempo2 = this.sentencias.get(j);

                            if (sentTempo2 instanceof InicioFuncion) {
                                banderaE = false;
                                break;
                            }
                            if (sentTempo2 instanceof FinFuncion) {
                                banderaE = false;
                                break;
                            }
                            if (sentTempo2 instanceof BR) {
                                this.ejecutarInstruccion(sentTempo2);
                                banderaE = false;
                               break;
                            }
                            
                            if (sentTempo2 instanceof BR_IF) {
                                this.ejecutarInstruccion(sentTempo2);
                                banderaE = false;
                                break;
                            }
                            this.ejecutarInstruccion(sentTempo2);
                        }
                    }

                }

            } else {
                break;
            }
        }
    }

    }
