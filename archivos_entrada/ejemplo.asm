function $principal
/*Reservando memoria para las variables globales*/
get_global 0
0
ADD
set_global 0
/*RESOLVIENDO ASIGNACION DE bandera*/
/*Obteniendo posicion de bandera*/
get_local 0
1
add
/*Resolviendo Expresion a asignar*/
1/*Asignando Valor*/
set_local $calc
/*RESOLVIENDO ASIGNACION DE i*/
/*Obteniendo posicion de i*/
get_local 0
2
add
/*Resolviendo Expresion a asignar*/
0/*Asignando Valor*/
set_local $calc
/*-------- INICIO MIENTRAS -------*/
L3: //etiqueta pivote ciclo 
L4: // etiqueta continuar 
// REsolucion de condicion del ciclo 
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
2
add
get_local $calc

10
GT
BR_IF L2
BR L1

L2:
100
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
2
add
get_local $calc

PRINT
/*RESOLVIENDO ASIGNACION DE i*/
/*Obteniendo posicion de i*/
get_local 0
2
add
/*Resolviendo Expresion a asignar*/
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
2
add
get_local $calc

1
ADD/*Asignando Valor*/
set_local $calc
BR L3
L1:
L5:// etiqueta break 
/*-------- FIN MIENTRAS --------*/
/*-------- INICIO SI ---------*/
/*--- Codigo condicion ---*/
// cadena a convertir
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
65 // A
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0

//iniciando el caluclo de la sumatorio de caracteres
set_global 1 //pos del caracter actual
0
set_global 2 //acumulador 

L7:
get_global 1 
get_global $calc //caracter actual (tVal)
-1
DIFF
EQZ
BR_IF L8
BR L9

L8:
//calculando tVal
get_global 1 
get_global $calc //caracter actual (tVal)
get_global 2
ADD
set_global 2

get_global 1
1
ADD
set_global 1

BR L7

L9:
get_global 2
//fin de obtener valor entero de una cadena 

90
LT
BR_IF L11
BR L10
L10:
/*------- inicio codigo Instrucciones  ------------*/
115
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
101 // e
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
115 // s
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
116 // t
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
111 // o
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
101 // e
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
115 // s
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
118 // v
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
97 // a
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
108 // l
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
105 // i
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
100 // d
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
111 // o
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0

PRINT
/*------- fin codigo Instrucciones  ------------*/
BR L6
L11:
115
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
101 // e
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
115 // s
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
116 // t
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
111 // o
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
110 // n
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
111 // o
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
58 // :
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
40 // (
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0

PRINT
BR L6
L6:
/*-------- FIN SI ---------*/
end

