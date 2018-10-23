
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Oct 22 21:28:28 CST 2018
//----------------------------------------------------

package ASM.Analizador;

import java_cup.runtime.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;

/** CUP v0.10k generated parser.
  * @version Mon Oct 22 21:28:28 CST 2018
  */
public class ParserASM extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserASM() {super();}

  /** Constructor which sets the default scanner. */
  public ParserASM(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\003\003\000\002\005" +
    "\003\000\002\005\004\000\002\004\007\000\002\006\003" +
    "\000\002\006\004\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\004\023\004\001\002\000\004\024\012\001" +
    "\002\000\006\002\uffff\023\uffff\001\002\000\006\002\000" +
    "\023\004\001\002\000\004\002\010\001\002\000\004\002" +
    "\001\001\002\000\006\002\ufffe\023\ufffe\001\002\000\004" +
    "\027\013\001\002\000\022\015\025\016\023\017\017\020" +
    "\016\021\022\022\015\025\024\026\020\001\002\000\024" +
    "\015\ufffc\016\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc\025" +
    "\ufffc\026\ufffc\030\ufffc\001\002\000\024\015\ufff3\016\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\022\ufff3\025\ufff3\026\ufff3\030" +
    "\ufff3\001\002\000\024\015\ufff5\016\ufff5\017\ufff5\020\ufff5" +
    "\021\ufff5\022\ufff5\025\ufff5\026\ufff5\030\ufff5\001\002\000" +
    "\024\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6" +
    "\025\ufff6\026\ufff6\030\ufff6\001\002\000\024\015\ufffa\016" +
    "\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa\025\ufffa\026\ufffa" +
    "\030\ufffa\001\002\000\024\015\025\016\023\017\017\020" +
    "\016\021\022\022\015\025\024\026\020\030\027\001\002" +
    "\000\024\015\ufff4\016\ufff4\017\ufff4\020\ufff4\021\ufff4\022" +
    "\ufff4\025\ufff4\026\ufff4\030\ufff4\001\002\000\024\015\ufff7" +
    "\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\025\ufff7\026" +
    "\ufff7\030\ufff7\001\002\000\024\015\ufff9\016\ufff9\017\ufff9" +
    "\020\ufff9\021\ufff9\022\ufff9\025\ufff9\026\ufff9\030\ufff9\001" +
    "\002\000\024\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8" +
    "\022\ufff8\025\ufff8\026\ufff8\030\ufff8\001\002\000\024\015" +
    "\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022\ufffb\025\ufffb" +
    "\026\ufffb\030\ufffb\001\002\000\006\002\ufffd\023\ufffd\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\010\003\006\004\004\005\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\006\020\007\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserASM$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserASM$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserASM$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



 /* -------------------------==: DECLARAR EL ARBOL :==--------------------------*/
    //public Nodo Gramaticas;     
    public static String cadena;

	

	

/* -------------------------==: ERROR SINTACTICO :==--------------------------*/
public void syntax_error(Symbol s){
    System.out.println("Error Sintactico -> lexema: " +s.value+" Linea: " +s.right+ " Columna: "+s.left);
    cadena += "<tr>"
                + "<td><center><b>" + s.value + "</b></center></td>"
                + "<td><center><b>" + s.right + "</b></center></td>"
                + "<td><center><b>" + s.left+ "</b></center></td>"
                + "</tr>";
				
}

/* ------------------==: ERROR SINTACTICO NO RECUPERABLE :==------------------*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
    System.out.println("Error Sintactico No Recuperable-> Lexema: " +s.value+" Linea: "+s.right+ " Columna: "+s.left);
     cadena += "<tr>"
                + "<td><center><b>" + s.value + "</b></center></td>"
                + "<td><center><b>" + s.right + "</b></center></td>"
                + "<td><center><b>" + s.left+ "</b></center></td>"
                + "</tr>";
				
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserASM$actions {


//Operaciones_Listas operaciones = new Operaciones_Listas();



  private final ParserASM parser;

  /** Constructor */
  CUP$ParserASM$actions(ParserASM parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserASM$do_action(
    int                        CUP$ParserASM$act_num,
    java_cup.runtime.lr_parser CUP$ParserASM$parser,
    java.util.Stack            CUP$ParserASM$stack,
    int                        CUP$ParserASM$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserASM$result;

      /* select the action based on the action number */
      switch (CUP$ParserASM$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // VALOR ::= print 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // VALOR ::= mod 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // VALOR ::= div 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // VALOR ::= mult 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // VALOR ::= diff 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VALOR ::= add 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // VALOR ::= numero_entero 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // VALOR ::= numero_decimal 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(5/*VALOR*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LISTA_VALORES ::= LISTA_VALORES VALOR 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(4/*LISTA_VALORES*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LISTA_VALORES ::= VALOR 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(4/*LISTA_VALORES*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // FUNCION ::= function dolar identificador LISTA_VALORES end 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(2/*FUNCION*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-4)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LISTA_FUNCIONES ::= LISTA_FUNCIONES FUNCION 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(3/*LISTA_FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LISTA_FUNCIONES ::= FUNCION 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(3/*LISTA_FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LISTA_FUNCIONES 
            {
              Object RESULT = null;

              CUP$ParserASM$result = new java_cup.runtime.Symbol(1/*INICIO*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          return CUP$ParserASM$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).value;
		RESULT = start_val;
              CUP$ParserASM$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-1)).left, ((java_cup.runtime.Symbol)CUP$ParserASM$stack.elementAt(CUP$ParserASM$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$ParserASM$parser.done_parsing();
          return CUP$ParserASM$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

