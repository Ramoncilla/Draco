package zEjecucionDraco;

import ASM.Ambito3D;
import ASM.Valor;
import draco.Constantes;
import static draco.Draco.erroresJS;
import zEjecucionDraco.Expresion.*;
import zEjecucionDraco.Sentencias.*;

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
    public String cadenaImprimir;

    public EjecucionDraco(CuerpoFuncion sent) {
        opRestar = new RestarD();
        opSumar = new SumaD();
        opMultiplicar = new MutiplicacionD();
        opElevar = new PotenciaD();
        opDividir = new DivisionD();
        opModulo = new ModuloD();
        this.sentenciasArchivo = sent;
        this.cadenaImprimir = "";

    }

    public void ejecutarDraco() {
        baseDraco sentencia;
        TablaSimboloD tabla = new TablaSimboloD();
        Ambito3D ambito = new Ambito3D();
        ambito.addAmbiente(Constantes.GLOBAL);
        for (int i = 0; i < this.sentenciasArchivo.sentencias.size(); i++) {
            sentencia = sentenciasArchivo.sentencias.get(i);
            this.evaluarSentencia(sentencia, tabla, ambito);
        }
        ambito.salirAmbito();
        System.out.println(this.cadenaImprimir);
    }

    private retorno evaluarSentencia(baseDraco sentencia, TablaSimboloD tabla, Ambito3D ambito) {

        if (sentencia instanceof Asignacion) {

            Asignacion asig = (Asignacion) sentencia;
            retorno r = this.asignacion(asig, tabla, ambito);
            return r;

        } else if (sentencia instanceof Declaracion) {
            Declaracion decla = (Declaracion) sentencia;
            retorno r = this.declaracion(decla, tabla, ambito);
            return r;
        } else if (sentencia instanceof Imprimir) {
            Imprimir ele = (Imprimir) sentencia;
            retorno r = this.imprimir(ele, tabla, ambito);
            return r;
        } else if (sentencia instanceof Mientras) {
            Mientras m = (Mientras) sentencia;
            retorno r = this.mientras(m, tabla, ambito);
            return r;

        } else if (sentencia instanceof Para) {
            Para m = (Para) sentencia;
            retorno r = this.para(m, tabla, ambito);
            return r;
        } else if (sentencia instanceof Smash) {
            Smash m = (Smash) sentencia;
            retorno r = this.smash(m, tabla, ambito);
            return r;
        } else if (sentencia instanceof Cuadrado) {

        } else if (sentencia instanceof CuerpoFuncion) {

        } else if (sentencia instanceof Linea) {

        } else if (sentencia instanceof Ovalo) {

        } else if (sentencia instanceof P_Cadena) {

        } else if (sentencia instanceof Punto) {

        } else if (sentencia instanceof Run_Dasm) {

        } else if (sentencia instanceof Si) {
            Si nodoIf = (Si) sentencia;
            return this.Si(nodoIf, tabla, ambito);

        }

        return new retorno();
    }

    /*----------------------- Ejecuion de Sentencias ---------------------------------*/
   
    private retorno Si(Si elemento, TablaSimboloD tabla, Ambito3D ambito){
    
        /*
      SI::= IF  1
	| IF:a SINO  2
	| IF:a L_SINO_SI:b 3
	| IF:a L_SINO_SI:b SINO:c  4   
    */
        retorno ret;
        switch (elemento.tipoSi) {
            case 1:{
                ret = this.resolverIF(elemento.siInicial, tabla, ambito);
                return ret;
            }
            case 2:{
                 ret = this.resolverIF(elemento.siInicial, tabla, ambito);
                 if(!ret.banderaSi){
                   ret=  this.resolverSino(elemento.sino, tabla, ambito); 
                 }
                 return ret;
            }
            case 3:{
                ret = this.resolverIF(elemento.siInicial, tabla, ambito);
                IF siTemporal;
                int i=0;
                while((!ret.banderaSi) && i<elemento.listaSinoSi.size()){
                    siTemporal =elemento.listaSinoSi.get(i);
                    ret= resolverIF(siTemporal, tabla, ambito);
                    i++;
                }
                
                return ret;
            }
            case 4:{
                ret = this.resolverIF(elemento.siInicial, tabla, ambito);
                IF siTemporal;
                int i=0;
                while((!ret.banderaSi) && i<elemento.listaSinoSi.size()){
                    siTemporal =elemento.listaSinoSi.get(i);
                    ret= resolverIF(siTemporal, tabla, ambito);
                    i++;
                }
                if(!ret.banderaSi){
                   ret=  this.resolverSino(elemento.sino, tabla, ambito); 
                 }
               return ret;
            }       
        } 
        return new retorno();
    }
    
    
    private retorno resolverSino(CuerpoFuncion nodo, TablaSimboloD tabla, Ambito3D ambiente) {
        ambiente.addSino();
        retorno ret = new retorno();
        baseDraco item;
        for (int i = 0; i < nodo.sentencias.size(); i++) {
            item = nodo.sentencias.get(i);
            ret = evaluarSentencia(item, tabla, ambiente);
        }
        ambiente.salirAmbito();
        ret.banderaSi = true;
        return ret;
    }

    private retorno resolverIF(IF elemento, TablaSimboloD tabla, Ambito3D ambito) {
        retorno ret = new retorno();
        baseDraco expresionIf = elemento.condicion;
        CuerpoFuncion sentenciasCuerpo = elemento.instrucciones;
        Valor v = resolverExpresion(expresionIf, tabla, ambito);
        if (!v.tipo.equalsIgnoreCase(Constantes.NULO)) {
            if (esBooleano(v)) {
                if (v.valor.toString().equalsIgnoreCase(Constantes.VERDADERO)) {
                    ambito.addSi();
                    baseDraco item;
                    for (int i = 0; i < sentenciasCuerpo.sentencias.size(); i++) {
                        item = sentenciasCuerpo.sentencias.get(i);
                        ret = evaluarSentencia(item, tabla, ambito);
                    }
                    ambito.salirAmbito();
                    ret.banderaSi = true;
                    return ret;

                } else {
                    ret.banderaSi = false;
                    return ret;
                }
            } else {
                erroresJS.addSemantico(0, 0, "La expresion de la sentencia SI, no retorna un valor valido DracoScript");
            }
        } else {
            erroresJS.addSemantico(0, 0, "La expresion de la sentencia SI, no retorna un valor valido DracoScript");
        }

        ret.banderaSi = false;
        return ret;
    }

    private retorno imprimir(Imprimir elemento, TablaSimboloD tabla, Ambito3D ambito) {
        Valor expr = resolverExpresion(elemento.expresion, tabla, ambito);
        this.cadenaImprimir += expr.valor.toString() + "\n";
        return new retorno();
    }

    private retorno declaracion(Declaracion elemento, TablaSimboloD tabla, Ambito3D ambito) {
        Declaracion decla = (Declaracion) elemento;
        DeclaAsigna temp;
        for (int i = 0; i < decla.declaraciones.size(); i++) {
            temp = decla.declaraciones.get(i);
            Variable var = new Variable(temp.idDecla, ambito.getAmbito());
            tabla.insertarVariable(var);
            if (temp.asignacion != null) {
                retorno r = evaluarSentencia(temp.asignacion, tabla, ambito);
            }
        }
        return new retorno();
    }

    private retorno asignacion(Asignacion elemento, TablaSimboloD tabla, Ambito3D ambito) {

        Asignacion asigna = (Asignacion) elemento;
        Variable var = tabla.obtenerVariable(asigna.nombre, ambito);
        if (var != null) {
            Valor res = resolverExpresion(asigna.expresion, tabla, ambito);
            var.asignarValor(res);
        } else {
            erroresJS.addSemantico(0, 0, "La variable " + asigna.nombre + ", no existe, no se puede asignar");
        }

        return new retorno();
    }

    private retorno mientras(Mientras elemento, TablaSimboloD tabla, Ambito3D ambito) {
        Mientras sent = (Mientras) elemento;
        Valor v = resolverExpresion(sent.expresion, tabla, ambito);
        retorno ret = new retorno();
        if (v.tipo.equalsIgnoreCase(Constantes.BOOLEANO)) {

            while (v.valor.toString().equalsIgnoreCase(Constantes.VERDADERO)) {
                ambito.addMientras();
                baseDraco temporal;
                for (int i = 0; i < sent.sentencias.sentencias.size(); i++) {
                    temporal = sent.sentencias.sentencias.get(i);
                    if (ret.detener) {
                        break;
                    } else {
                        ret = this.evaluarSentencia(temporal, tabla, ambito);
                    }
                }

                if (ret.detener) {
                    ret.detener = false;
                    ambito.salirAmbito();
                    break;
                }

                v = resolverExpresion(sent.expresion, tabla, ambito);
                ambito.salirAmbito();
            }

        } else {
            erroresJS.addSemantico(0, 0, "La condicion para el ciclo while no es valida");
        }

        return new retorno();
    }

    private retorno para(Para elemento, TablaSimboloD tabla, Ambito3D ambito) {
        ambito.addPara();
        retorno r1 = this.evaluarSentencia(elemento.declaAsigna, tabla, ambito);
        Valor v = resolverExpresion(elemento.condicion, tabla, ambito);
        retorno ret = new retorno();

        if (v.tipo.equalsIgnoreCase(Constantes.BOOLEANO)) {
            while (v.valor.toString().equalsIgnoreCase(Constantes.VERDADERO)) {
                baseDraco temporal;
                for (int i = 0; i < elemento.sentencias.sentencias.size(); i++) {
                    temporal = elemento.sentencias.sentencias.get(i);
                    if (ret.detener) {
                        break;
                    } else {
                        ret = this.evaluarSentencia(temporal, tabla, ambito);
                    }
                }

                if (ret.detener) {
                    ret.detener = false;
                    break;
                }

                v = resolverExpresion(elemento.condicion, tabla, ambito);
                this.evaluarSentencia(elemento.asignaControl, tabla, ambito);
            }

        } else {
            erroresJS.addSemantico(0, 0, "La condicion para el ciclo while no es valida");
        }

        ambito.salirAmbito();
        return new retorno();

    }

    private retorno smash(Smash elemento, TablaSimboloD tabla, Ambito3D ambito) {
        retorno r = new retorno();
        r.detener = true;
        return r;
    }

    /*------------- Resolver Expresiones ----------------------- */
    private Valor resolverExpresion(baseDraco expr, TablaSimboloD tabla, Ambito3D ambito) {
        if (expr instanceof Entero) {
            Entero t = (Entero) expr;
            Valor r = new Valor();
            r.crearEntero(t.valorEntero);
            return r;
        } else if (expr instanceof Identificador) {
            Identificador id = (Identificador) expr;
            Variable v = tabla.obtenerVariable(id.nombre, ambito);
            if (v != null) {
                return v.valor;
            } else {
                erroresJS.addSemantico(0, 0, "La variable " + id.nombre + ", no existe, no se puede obtener su valor");
                return new Valor();
            }
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
        } else if (expr instanceof Aritmetica) {
            Aritmetica oper = (Aritmetica) expr;
            Valor v1 = resolverExpresion(oper.valor1, tabla, ambito);
            Valor v2 = resolverExpresion(oper.valor2, tabla, ambito);

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
            Valor v1 = resolverExpresion(oper.valor1, tabla, ambito);
            Valor v2 = resolverExpresion(oper.valor2, tabla, ambito);
            RelacionD resolutor = new RelacionD();
            Valor v = resolutor.operar(v1, v2, oper.operador);
            return v;
        } else if (expr instanceof Logica) {
            Logica oper = (Logica) expr;
            Valor v1 = resolverExpresion(oper.valor1, tabla, ambito);
            Valor v2 = resolverExpresion(oper.valor2, tabla, ambito);
            logicaD resolutor = new logicaD();
            Valor v = resolutor.operar(v1, v2, oper.operador);
            return v;
        } else if (expr instanceof Not) {
            Not oper = (Not) expr;
            Valor v = new Valor();
            v.crearBooleano(Constantes.FALSO);
            Valor v1 = resolverExpresion(oper.valor1, tabla, ambito);
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
