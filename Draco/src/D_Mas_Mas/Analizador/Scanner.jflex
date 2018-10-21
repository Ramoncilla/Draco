package  D_Mas_Mas.Analizador;
    

import java_cup.runtime.Symbol;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;

%% 

/* ----------------------==: OPCIONES Y DECLARACIONES :==---------------------*/
%cupsym simbolosDMM
%class ScannerDMM
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
bool = (("'"{bool_elemento}"'")|("\""{bool_elemento}"\"")|({bool_elemento}))


comentMulti   		= "/*"~"*/"
comentSimple 		 = "//"[^\n']+
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

"entero" {System.out.println("t_entero");   return new Symbol (simbolosDMM.t_entero, yyline+1,yychar+1, new String (yytext()));}


"decimal" {System.out.println("t_decimal");   return new Symbol (simbolosDMM.t_decimal, yyline+1,yychar+1, new String (yytext()));}


"cadena" {System.out.println("t_cadena");   return new Symbol (simbolosDMM.t_cadena, yyline+1,yychar+1, new String (yytext()));}



"caracter" {System.out.println("t_caracter");   return new Symbol (simbolosDMM.t_caracter, yyline+1,yychar+1, new String (yytext()));}


"booleano" {System.out.println("t_booleano");   return new Symbol (simbolosDMM.t_booleano, yyline+1,yychar+1, new String (yytext()));}


"{" {System.out.println("abreLlave");   return new Symbol (simbolosDMM.abreLlave, yyline+1,yychar+1, new String (yytext()));}

"}" {System.out.println("cierraLlave");   return new Symbol (simbolosDMM.cierraLlave, yyline+1,yychar+1, new String (yytext()));}

"(" {System.out.println("abrePar");   return new Symbol (simbolosDMM.abrePar, yyline+1,yychar+1, new String (yytext()));}

")" {System.out.println("cierraPar");   return new Symbol (simbolosDMM.cierraPar, yyline+1,yychar+1, new String (yytext()));}

"[" {System.out.println("abreCor");   return new Symbol (simbolosDMM.abreCor, yyline+1,yychar+1, new String (yytext()));}

"]" {System.out.println("cierraCor");   return new Symbol (simbolosDMM.cierraCor, yyline+1,yychar+1, new String (yytext()));}


":" {System.out.println("dosPuntos");   return new Symbol (simbolosDMM.dosPuntos, yyline+1,yychar+1, new String (yytext()));}

";" {System.out.println("puntoComa");   return new Symbol (simbolosDMM.puntoComa, yyline+1,yychar+1, new String (yytext()));}

"si" {System.out.println("si");   return new Symbol (simbolosDMM.si, yyline+1,yychar+1, new String (yytext()));}

"sino" {System.out.println("sino");   return new Symbol (simbolosDMM.sino, yyline+1,yychar+1, new String (yytext()));}

"continuar" {System.out.println("continuar");   return new Symbol (simbolosDMM.continuar, yyline+1,yychar+1, new String (yytext()));}

"estructura" {System.out.println("estructura");   return new Symbol (simbolosDMM.estructura, yyline+1,yychar+1, new String (yytext()));}

"punto" {System.out.println("puntoD");   return new Symbol (simbolosDMM.puntoD, yyline+1,yychar+1, new String (yytext()));}


"cuadrado" {System.out.println("cuadrado");   return new Symbol (simbolosDMM.cuadrado, yyline+1,yychar+1, new String (yytext()));}

"ovalo" {System.out.println("ovalo");   return new Symbol (simbolosDMM.ovalo, yyline+1,yychar+1, new String (yytext()));}


"linea" {System.out.println("liena");   return new Symbol (simbolosDMM.linea, yyline+1,yychar+1, new String (yytext()));}



"principal" {System.out.println("principal");   return new Symbol (simbolosDMM.principal, yyline+1,yychar+1, new String (yytext()));}

"vacio" {System.out.println("vacio");   return new Symbol (simbolosDMM.vacio, yyline+1,yychar+1, new String (yytext()));}

"nulo" {System.out.println("nulo");   return new Symbol (simbolosDMM.nulo, yyline+1,yychar+1, new String (yytext()));}

"para" {System.out.println("para");   return new Symbol (simbolosDMM.para, yyline+1,yychar+1, new String (yytext()));}

"mientras" {System.out.println("mientras");  return new Symbol (simbolosDMM.mientras, yyline+1,yychar+1, new String (yytext()));}

"detener" {System.out.println("detener");   return new Symbol (simbolosDMM.detener, yyline+1,yychar+1, new String (yytext()));}

"imprimir" {System.out.println("imprimir");   return new Symbol (simbolosDMM.imprimir, yyline+1,yychar+1, new String (yytext()));}

"retornar" {System.out.println("retornar");   return new Symbol (simbolosDMM.retornar, yyline+1,yychar+1, new String (yytext()));}


"importar" {System.out.println("importar");   return new Symbol (simbolosDMM.importar, yyline+1,yychar+1, new String (yytext()));}

"," {System.out.println("coma");   return new Symbol (simbolosDMM.coma, yyline+1,yychar+1, new String (yytext()));}

"." {System.out.println("punto");   return new Symbol (simbolosDMM.punto, yyline+1,yychar+1, new String (yytext()));}


"++" {System.out.println("masMas");   return new Symbol (simbolosDMM.masMas, yyline+1,yychar+1, new String (yytext()));}

"--" {System.out.println("menosMenos");   return new Symbol (simbolosDMM.menosMenos, yyline+1,yychar+1, new String (yytext()));}

"+" {System.out.println("mas");   return new Symbol (simbolosDMM.mas, yyline+1,yychar+1, new String (yytext()));}

"?" {System.out.println("?");   return new Symbol (simbolosDMM.interrogacion, yyline+1,yychar+1, new String (yytext()));}

"-" {System.out.println("menos");   return new Symbol (simbolosDMM.menos, yyline+1,yychar+1, new String (yytext()));}

"*" {System.out.println("multiplicacion");   return new Symbol (simbolosDMM.multiplicacion, yyline+1,yychar+1, new String (yytext()));}

"/" {System.out.println("division");   return new Symbol (simbolosDMM.division, yyline+1,yychar+1, new String (yytext()));}

"^" {System.out.println("potencia");   return new Symbol (simbolosDMM.potencia, yyline+1,yychar+1, new String (yytext()));}

"%" {System.out.println("residuo");   return new Symbol (simbolosDMM.residuo, yyline+1,yychar+1, new String (yytext()));}

"<"         {System.out.println("menor");  return new Symbol (simbolosDMM.menor, yyline+1,yychar+1, new String (yytext()));}

">"         {System.out.println("mayor");  return new Symbol (simbolosDMM.mayor, yyline+1,yychar+1, new String (yytext()));}

"<=" {System.out.println("menorIgual");   return new Symbol (simbolosDMM.menorIgual, yyline+1,yychar+1, new String (yytext()));}
">=" {System.out.println("mayorIgual");   return new Symbol (simbolosDMM.mayorIgual, yyline+1,yychar+1, new String (yytext()));}

"==" {System.out.println("igualIgual");   return new Symbol (simbolosDMM.igualIgual, yyline+1,yychar+1, new String (yytext()));}

"!=" {System.out.println("disitnoA");   return new Symbol (simbolosDMM.distintoA, yyline+1,yychar+1, new String (yytext()));}

"&&" {System.out.println("and");   return new Symbol (simbolosDMM.and, yyline+1,yychar+1, new String (yytext()));}

"||" {System.out.println("or");   return new Symbol (simbolosDMM.or, yyline+1,yychar+1, new String (yytext()));}

"!" {System.out.println("not");  return new Symbol (simbolosDMM.not, yyline+1,yychar+1, new String (yytext()));}

{bool_elemento}  {System.out.println("valor bool");               return new Symbol (simbolosDMM.valBool, yyline+1,yychar+1, new String (yytext()));}

"=" {System.out.println("igual");   return new Symbol (simbolosDMM.igual, yyline+1,yychar+1, new String (yytext()));}


/* -------------------------==: EXPRESIONES REGULARES :==---------------------*/

{cadena}    {System.out.println(yytext());                return new Symbol (simbolosDMM.cadena, yyline+1,yychar+1, new String (yytext()));}

{numero_entero}    {System.out.println(yytext());                return new Symbol (simbolosDMM.numero_entero, yyline+1,yychar+1, new String (yytext()));}


{numero_decimal}    {System.out.println(yytext());                return new Symbol (simbolosDMM.numero_decimal, yyline+1,yychar+1, new String (yytext()));}


{identificador}        {System.out.println(yytext());                return new Symbol (simbolosDMM.identificador, yyline+1,yychar+1, new String (yytext()));}

{caracter}    {System.out.println(yytext());                return new Symbol (simbolosDMM.caracter, yyline+1,yychar+1, new String (yytext()));}

{comentMulti}   {System.out.println("Coment Multi");   /* se ignora*/}

{comentSimple}   {System.out.println("Coment simple");   /* se ignora*/}
{comentMulti2}   {System.out.println("Coment Multi2");   /* se ignora*/}

{comentSimple2}   {System.out.println("Coment simple2");   /* se ignora*/}

/* -------------------------------==: BLANCOS :==-----------------------------*/
[ \t\r\f\n]+        { /* Se ignoran */}

/* --------------------------------==: ERROR :==------------------------------*/
/* Cualquier Otro */
.                      { ErrorScan(yyline,yychar,yytext()); }

