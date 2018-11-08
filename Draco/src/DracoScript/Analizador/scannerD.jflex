package  DracoScript.Analizador;
    

import java_cup.runtime.Symbol;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;

%% 

/* ----------------------==: OPCIONES Y DECLARACIONES :==---------------------*/
%cupsym simbolosDraco
%class ScannerDraco
%cup
%public
%unicode
%public
%line
%char
%ignorecase
%caseless

/* -------------------------==: EXPRESIONES REGULARES :==---------------------*/
entero              = [0-9]+
numero_entero             = [0-9]+
numero_decimal =  [0-9]+(("\."[0-9]+))
letras              = [a-zA-Z_]
cadena              = [\"] ~[\"]
caracter            = "'"([0-9]|[a-zA-Z])"'"
identificador                  = {letras}({letras}|{numero_entero})*

bool_elemento=("verdadero"|"falso"|"true"|"false")


comentMulti2   		= "$*"~"*$"
comentSimple2 		 = "$$"[^\n']+




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

"entero" {System.out.println("t_entero");   return new Symbol (simbolosDraco.t_entero, yyline+1,yychar+1, new String (yytext()));}


"decimal" {System.out.println("t_decimal");   return new Symbol (simbolosDraco.t_decimal, yyline+1,yychar+1, new String (yytext()));}


"cadena" {System.out.println("t_cadena");   return new Symbol (simbolosDraco.t_cadena, yyline+1,yychar+1, new String (yytext()));}



"caracter" {System.out.println("t_caracter");   return new Symbol (simbolosDraco.t_caracter, yyline+1,yychar+1, new String (yytext()));}


"booleano" {System.out.println("t_booleano");   return new Symbol (simbolosDraco.t_booleano, yyline+1,yychar+1, new String (yytext()));}

"var" {System.out.println("t_booleano");   return new Symbol (simbolosDraco.var, yyline+1,yychar+1, new String (yytext()));}



"{" {System.out.println("abreLlave");   return new Symbol (simbolosDraco.abreLlave, yyline+1,yychar+1, new String (yytext()));}

"}" {System.out.println("cierraLlave");   return new Symbol (simbolosDraco.cierraLlave, yyline+1,yychar+1, new String (yytext()));}

"(" {System.out.println("abrePar");   return new Symbol (simbolosDraco.abrePar, yyline+1,yychar+1, new String (yytext()));}

")" {System.out.println("cierraPar");   return new Symbol (simbolosDraco.cierraPar, yyline+1,yychar+1, new String (yytext()));}



":" {System.out.println("dosPuntos");   return new Symbol (simbolosDraco.dosPuntos, yyline+1,yychar+1, new String (yytext()));}

";" {System.out.println("puntoComa");   return new Symbol (simbolosDraco.puntoComa, yyline+1,yychar+1, new String (yytext()));}


"if" {System.out.println("if");   return new Symbol (simbolosDraco.si, yyline+1,yychar+1, new String (yytext()));}

"not" {System.out.println("notIf");   return new Symbol (simbolosDraco.notIf, yyline+1,yychar+1, new String (yytext()));}

"elif" {System.out.println("elif");   return new Symbol (simbolosDraco.elif, yyline+1,yychar+1, new String (yytext()));}


"smash" {System.out.println("smash");   return new Symbol (simbolosDraco.smash, yyline+1,yychar+1, new String (yytext()));}


"while" {System.out.println("while");   return new Symbol (simbolosDraco.t_while, yyline+1,yychar+1, new String (yytext()));}


"for" {System.out.println("for");   return new Symbol (simbolosDraco.t_for, yyline+1,yychar+1, new String (yytext()));}


"print" {System.out.println("print");   return new Symbol (simbolosDraco.print, yyline+1,yychar+1, new String (yytext()));}


"RunMultDasm" {System.out.println("RunMultDasm");   return new Symbol (simbolosDraco.runMultDasm, yyline+1,yychar+1, new String (yytext()));}


"point" {System.out.println("puntoD");   return new Symbol (simbolosDraco.point, yyline+1,yychar+1, new String (yytext()));}


"quadrate" {System.out.println("cuadrado");   return new Symbol (simbolosDraco.quadrate, yyline+1,yychar+1, new String (yytext()));}

"oval" {System.out.println("ovalo");   return new Symbol (simbolosDraco.oval, yyline+1,yychar+1, new String (yytext()));}


"line" {System.out.println("liena");   return new Symbol (simbolosDraco.line, yyline+1,yychar+1, new String (yytext()));}

"if not" {System.out.println("if not");   return new Symbol (simbolosDraco.ifnot, yyline+1,yychar+1, new String (yytext()));}


"String" {System.out.println("string");   return new Symbol (simbolosDraco.t_String, yyline+1,yychar+1, new String (yytext()));}


"nulo" {System.out.println("nulo");   return new Symbol (simbolosDraco.nulo, yyline+1,yychar+1, new String (yytext()));}

"," {System.out.println("coma");   return new Symbol (simbolosDraco.coma, yyline+1,yychar+1, new String (yytext()));}

"." {System.out.println("punto");   return new Symbol (simbolosDraco.punto, yyline+1,yychar+1, new String (yytext()));}


"++" {System.out.println("masMas");   return new Symbol (simbolosDraco.masMas, yyline+1,yychar+1, new String (yytext()));}

"--" {System.out.println("menosMenos");   return new Symbol (simbolosDraco.menosMenos, yyline+1,yychar+1, new String (yytext()));}

"+" {System.out.println("mas");   return new Symbol (simbolosDraco.mas, yyline+1,yychar+1, new String (yytext()));}

"-" {System.out.println("menos");   return new Symbol (simbolosDraco.menos, yyline+1,yychar+1, new String (yytext()));}

"*" {System.out.println("multiplicacion");   return new Symbol (simbolosDraco.multiplicacion, yyline+1,yychar+1, new String (yytext()));}

"/" {System.out.println("division");   return new Symbol (simbolosDraco.division, yyline+1,yychar+1, new String (yytext()));}

"^" {System.out.println("potencia");   return new Symbol (simbolosDraco.potencia, yyline+1,yychar+1, new String (yytext()));}

"<=" {System.out.println("menorIgual");   return new Symbol (simbolosDraco.menorIgual, yyline+1,yychar+1, new String (yytext()));}
">=" {System.out.println("mayorIgual");   return new Symbol (simbolosDraco.mayorIgual, yyline+1,yychar+1, new String (yytext()));}

"==" {System.out.println("igualIgual");   return new Symbol (simbolosDraco.igualIgual, yyline+1,yychar+1, new String (yytext()));}

"%" {System.out.println("residuo");   return new Symbol (simbolosDraco.residuo, yyline+1,yychar+1, new String (yytext()));}

"<"         {System.out.println("menor");  return new Symbol (simbolosDraco.menor, yyline+1,yychar+1, new String (yytext()));}

">"         {System.out.println("mayor");  return new Symbol (simbolosDraco.mayor, yyline+1,yychar+1, new String (yytext()));}



"!=" {System.out.println("disitnoA");   return new Symbol (simbolosDraco.distintoA, yyline+1,yychar+1, new String (yytext()));}

"&&" {System.out.println("and");   return new Symbol (simbolosDraco.and, yyline+1,yychar+1, new String (yytext()));}

"||" {System.out.println("or");   return new Symbol (simbolosDraco.or, yyline+1,yychar+1, new String (yytext()));}

"!" {System.out.println("not");  return new Symbol (simbolosDraco.not, yyline+1,yychar+1, new String (yytext()));}

{bool_elemento}  {System.out.println("valor bool");               return new Symbol (simbolosDraco.valBool, yyline+1,yychar+1, new String (yytext()));}

"=" {System.out.println("igual");   return new Symbol (simbolosDraco.igual, yyline+1,yychar+1, new String (yytext()));}


"'" {System.out.println("igual");   return new Symbol (simbolosDraco.comillaSimple, yyline+1,yychar+1, new String (yytext()));}


"dasm" {System.out.println("igual");   return new Symbol (simbolosDraco.dasm, yyline+1,yychar+1, new String (yytext()));}
/* -------------------------==: EXPRESIONES REGULARES :==---------------------*/

{cadena}    {System.out.println(yytext());                return new Symbol (simbolosDraco.cadena, yyline+1,yychar+1, new String (yytext()));}

{numero_entero}    {System.out.println(yytext());                return new Symbol (simbolosDraco.numero_entero, yyline+1,yychar+1, new String (yytext()));}


{numero_decimal}    {System.out.println(yytext());                return new Symbol (simbolosDraco.numero_decimal, yyline+1,yychar+1, new String (yytext()));}


{identificador}        {System.out.println(yytext());                return new Symbol (simbolosDraco.identificador, yyline+1,yychar+1, new String (yytext()));}

{caracter}    {System.out.println(yytext());                return new Symbol (simbolosDraco.caracter, yyline+1,yychar+1, new String (yytext()));}


{comentMulti2}   {System.out.println("Coment Multi2");   /* se ignora*/}
{comentSimple2}   {System.out.println("Coment simple2");   /* se ignora*/}

/* -------------------------------==: BLANCOS :==-----------------------------*/
[ \t\r\f\n]+        { /* Se ignoran */}

/* --------------------------------==: ERROR :==------------------------------*/
/* Cualquier Otro */
.                      { ErrorScan(yyline,yychar,yytext()); }


