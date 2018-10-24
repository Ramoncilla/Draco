package ASM.Analizador;
    
import java_cup.runtime.Symbol;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;

%% 
 

/* ----------------------==: OPCIONES Y DECLARACIONES :==---------------------*/
%cupsym simbolosASM
%class ScannerASM
%cup
%public
%unicode
%public
%line
%char
%ignorecase
%caseless

  

/* -------------------------==: EXPRESIONES REGULARES :==---------------------*/
numero_entero             = [0-9]+
numero_decimal =  [0-9]+(("\."[0-9]+))
letras              = [a-zA-Z_]
caracter            = "'"([0-9]|[a-zA-Z])"'"
identificador                  = {letras}({letras}|{numero_entero})*


 LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"

    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
	 CommentContent       = ( [^*] | \*+ [^/*] )*
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
   
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}


%{
public static String cadena;

/* ------------------------==: METODO DE ERROR LEXICO :==---------------------*/
    private void ErrorScan(int linea, int columna, String valor) {
        System.out.println("Error Lexico Iden: " + valor + ", " + linea + ", " + columna);
        cadena += "<tr>"
                + "<td><center><b>" + valor + "</b></center></td>"
                + "<td><center><b>" + linea + "</b></center></td>"
                + "<td><center><b>" + columna + "</b></center></td>"
                + "</tr>";
    }

%}
%%

/* -----------------------------==: COMENTARIOS  :==--------------------------*/



/*------- Palabras reservadas -----------------*/


"{" {System.out.println("abreLlave");   return new Symbol (simbolosASM.abreLlave, yyline+1,yychar+1, new String (yytext()));}

"}" {System.out.println("cierraLlave");   return new Symbol (simbolosASM.cierraLlave, yyline+1,yychar+1, new String (yytext()));}

"(" {System.out.println("abrePar");   return new Symbol (simbolosASM.abrePar, yyline+1,yychar+1, new String (yytext()));}

")" {System.out.println("cierraPar");   return new Symbol (simbolosASM.cierraPar, yyline+1,yychar+1, new String (yytext()));}


":" {System.out.println("dosPuntos");   return new Symbol (simbolosASM.dosPuntos, yyline+1,yychar+1, new String (yytext()));}

";" {System.out.println("puntoComa");   return new Symbol (simbolosASM.puntoComa, yyline+1,yychar+1, new String (yytext()));}

"nulo" {System.out.println("nulo");   return new Symbol (simbolosASM.nulo, yyline+1,yychar+1, new String (yytext()));}

"," {System.out.println("coma");   return new Symbol (simbolosASM.coma, yyline+1,yychar+1, new String (yytext()));}

"." {System.out.println("punto");   return new Symbol (simbolosASM.punto, yyline+1,yychar+1, new String (yytext()));}

"-" {System.out.println("menos");   return new Symbol (simbolosASM.menos, yyline+1,yychar+1, new String (yytext()));}



"calc" {System.out.println("calc");   return new Symbol (simbolosASM.calc, yyline+1,yychar+1, new String (yytext()));}

"ADD" {System.out.println("add");   return new Symbol (simbolosASM.add, yyline+1,yychar+1, new String (yytext()));}

"DIFF" {System.out.println("diff");   return new Symbol (simbolosASM.diff, yyline+1,yychar+1, new String (yytext()));}

"MULT" {System.out.println("multiplicacion");   return new Symbol (simbolosASM.mult, yyline+1,yychar+1, new String (yytext()));}

"DIV" {System.out.println("division");   return new Symbol (simbolosASM.div, yyline+1,yychar+1, new String (yytext()));}

"MOD" {System.out.println("mod");   return new Symbol (simbolosASM.mod, yyline+1,yychar+1, new String (yytext()));}

"PRINT" {System.out.println("print");   return new Symbol (simbolosASM.print, yyline+1,yychar+1, new String (yytext()));}

"function" {System.out.println("function");   return new Symbol (simbolosASM.function, yyline+1,yychar+1, new String (yytext()));}

"$" {System.out.println("dolar");   return new Symbol (simbolosASM.dolar, yyline+1,yychar+1, new String (yytext()));}

"end" {System.out.println("end");   return new Symbol (simbolosASM.end, yyline+1,yychar+1, new String (yytext()));}

"SET_LOCAL" {System.out.println("set_local");   return new Symbol (simbolosASM.set_local, yyline+1,yychar+1, new String (yytext()));}

"GET_LOCAL" {System.out.println("get_local");   return new Symbol (simbolosASM.get_local, yyline+1,yychar+1, new String (yytext()));}

"SET_GLOBAL" {System.out.println("set_global");   return new Symbol (simbolosASM.set_global, yyline+1,yychar+1, new String (yytext()));}

"GET_GLOBAL" {System.out.println("get_global");   return new Symbol (simbolosASM.get_global, yyline+1,yychar+1, new String (yytext()));}

/* -------------------------==: EXPRESIONES REGULARES :==---------------------*/



{numero_entero}    {System.out.println(yytext());                return new Symbol (simbolosASM.numero_entero, yyline+1,yychar+1, new String (yytext()));}


{numero_decimal}    {System.out.println(yytext());                return new Symbol (simbolosASM.numero_decimal, yyline+1,yychar+1, new String (yytext()));}


{identificador}        {System.out.println(yytext());                return new Symbol (simbolosASM.identificador, yyline+1,yychar+1, new String (yytext()));}


{Comment}   {System.out.println("comentario");   /* se ignora*/}



/* -------------------------------==: BLANCOS :==-----------------------------*/
[ \t\r\f\n]+        { /* Se ignoran */}

/* --------------------------------==: ERROR :==------------------------------*/
/* Cualquier Otro */
.                      { ErrorScan(yyline,yychar,yytext()); }



