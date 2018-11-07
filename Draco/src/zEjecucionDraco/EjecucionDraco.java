package zEjecucionDraco;

import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresJS;
import zEjecucionDraco.Expresion.*;
import zEjecucionDraco.Sentencias.CuerpoFuncion;

/**
 *
 * @author Ramonella
 */
public class EjecucionDraco {

    public CuerpoFuncion sentenciasArchivo;
    RestarD opRestar;
    SumaD opSumar;
    MutiplicacionD opMultiplicar;
    PotenciaD opElevar;
    DivisionD opDividir;
    ModuloD opModulo;

    public EjecucionDraco(CuerpoFuncion sent) {
        opRestar = new RestarD();
        opSumar = new SumaD();
        opMultiplicar = new MutiplicacionD();
        opElevar = new PotenciaD();
        opDividir = new DivisionD();
        opModulo = new ModuloD();

    }

    /*------------- Resolver Expresiones ----------------------- */
    private Valor resolverExpresion(baseDraco expr) {
        if (expr instanceof Entero) {
            Entero t = (Entero) expr;
            Valor r = new Valor();
            r.crearEntero(t.valorEntero);
            return r;
        } else if (expr instanceof Booleano) {
            Booleano t = (Booleano) expr;
            Valor r = new Valor();
            r.crearBooleano(t.valBooleano);
            return r;
        } else if (expr instanceof Cadena) {
            Cadena t = (Cadena) expr;
            Valor r = new Valor();
            r.crearCadena(t.valorCadena);
            return r;
        } else if (expr instanceof Caracter) {
            Caracter t = (Caracter) expr;
            Valor r = new Valor();
            r.crearCaracter(t.valorCaracter);
            return r;
        } else if (expr instanceof Decimal) {
            Decimal t = (Decimal) expr;
            Valor r = new Valor();
            r.crearDecimal(t.valorDecimal);
            return r;
        } else if (expr instanceof Identificador) {

        } else if (expr instanceof Aritmetica) {
            Aritmetica oper = (Aritmetica) expr;
            Valor v1 = resolverExpresion(oper.valor1);
            Valor v2 = resolverExpresion(oper.valor2);

            switch (oper.operador) {
                case "+": {
                    Valor ret = opSumar.operar(v1, v2);
                    return ret;
                }
                case "-": {
                    Valor ret = opRestar.operar(v1, v2);
                    return ret;
                }

                case "*": {
                    Valor ret = opMultiplicar.operar(v1, v2);
                    return ret;
                }

                case "/": {
                    Valor ret = opDividir.operar(v1, v2);
                    return ret;
                }

                case "^": {
                    Valor ret = opElevar.operar(v1, v2);
                    return ret;
                }

                case "%": {
                    Valor ret = opModulo.operar(v1, v2);
                    return ret;
                }
            }
            return new Valor();
        } else if (expr instanceof Relacional) {

            Relacional oper = (Relacional) expr;
            Valor v1 = resolverExpresion(oper.valor1);
            Valor v2 = resolverExpresion(oper.valor2);
            RelacionD resolutor = new RelacionD();
            Valor v = resolutor.operar(v1, v2, oper.operador);
            return v;
        } else if (expr instanceof Logica) {
            Logica oper = (Logica) expr;
            Valor v1 = resolverExpresion(oper.valor1);
            Valor v2 = resolverExpresion(oper.valor2);
            logicaD resolutor = new logicaD();
            Valor v = resolutor.operar(v1, v2, oper.operador);
            return v;
        } else if (expr instanceof Not) {
            Not oper = (Not) expr;
            Valor v = new Valor();
            v.crearBooleano(Constantes.FALSO);
            Valor v1 = resolverExpresion(oper.valor1);
            if (esBooleano(v1)) {
                int n1 = obtenerValorEnteroBool(v1);

                if (n1 == 0) {
                    v.crearBooleano(Constantes.VERDADERO);
                    return v;
                }
                v.crearBooleano(Constantes.FALSO);
                return v;
            }

            erroresJS.addSemantico(0, 0, "Para resolver una expresion logica , ambos operandos deben de ser booleanos, y los tipos de AND son , " + v1.tipo + " ( " + v1.valor + ")  ");
            return new Valor();
        }
        return new Valor();
    }

    public boolean esBooleano(Valor v) {
        return v.tipo.equalsIgnoreCase(Constantes.BOOLEANO);
    }

    public int obtenerValorEnteroBool(Valor v) {
        if (v.valor.toString().equalsIgnoreCase(Constantes.VERDADERO)) {
            return 1;
        }
        return 0;
    }

}
