package zEjecucionDraco;

import ASM.Valor;
import zEjecucionDraco.Expresion.*;
import zEjecucionDraco.Sentencias.CuerpoFuncion;

/**
 *
 * @author Ramonella
 */
public class EjecucionDraco {
    
    public CuerpoFuncion sentenciasArchivo;
        RestarD opRestar;
        SumaD opSumar ;
        MutiplicacionD opMultiplicar ;
        PotenciaD opElevar ;
        DivisionD opDividir ;
        ModuloD opModulo ;
        
    public EjecucionDraco(CuerpoFuncion sent){
  opRestar = new RestarD();
        opSumar = new SumaD();
         opMultiplicar = new MutiplicacionD();
       opElevar = new PotenciaD();
       opDividir = new DivisionD();
         opModulo = new ModuloD();

    }







  /*------------- Resolver Expresiones ----------------------- */

    

  private Valor resolverExpresion(baseDraco expr)
  {
      if(expr instanceof Entero){
         Entero t =(Entero)expr;
         Valor r = new Valor();
         r.crearEntero(t.valorEntero);
         return r;
      } 
      else if( expr instanceof Booleano){
         Booleano t =(Booleano)expr;
         Valor r = new Valor();
         r.crearBooleano(t.valBooleano);
         return r;
      }
      else if( expr instanceof Cadena){
         Cadena t =(Cadena)expr;
         Valor r = new Valor();
         r.crearCadena(t.valorCadena);
         return r; 
      }
      else if( expr instanceof Caracter){
         Caracter t =(Caracter)expr;
         Valor r = new Valor();
         r.crearCaracter(t.valorCaracter);
         return r;
      }
      else if( expr instanceof Decimal){
         Decimal t =(Decimal)expr;
         Valor r = new Valor();
         r.crearDecimal(t.valorDecimal);
         return r;
      }
      else if( expr instanceof Identificador){
          
      }
      else if( expr instanceof Aritmetica){
        Aritmetica oper=(Aritmetica)expr;
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
      }
      else if( expr instanceof Relacional){
          
      }
      else if( expr instanceof Logica){
          
      }
      else if( expr instanceof Not){
          
      }
      return new Valor();
  }


    
}
