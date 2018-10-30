function $principal
/*RESOLVIENDO ASIGNACION DE cad*/
/*Obteniendo posicion de cad*/
get_local 0
2
add
/*Resolviendo Expresion a asignar*/
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
80 // P
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
100 // d
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
114 // r
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
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
/*Asignando Valor*/
set_local $calc
/*RESOLVIENDO ASIGNACION DE b*/
/*Obteniendo posicion de b*/
get_local 0
3
add
/*Resolviendo Expresion a asignar*/
1/*Asignando Valor*/
set_local $calc
/*RESOLVIENDO ASIGNACION DE c*/
/*Obteniendo posicion de c*/
get_local 0
4
add
/*Resolviendo Expresion a asignar*/
122/*Asignando Valor*/
set_local $calc
/*RESOLVIENDO ASIGNACION DE h*/
/*Obteniendo posicion de h*/
get_local 0
1
add
/*Resolviendo Expresion a asignar*/
10/*Asignando Valor*/
set_local $calc
100
//OBTENIENDO EL VALOR DE  h
get_local 0
1
add
get_local $calc

25
ADD
PRINT
115
//OBTENIENDO EL VALOR DE  cad
get_local 0
2
add
get_local $calc

PRINT
98
//OBTENIENDO EL VALOR DE  b
get_local 0
3
add
get_local $calc

PRINT
99
//OBTENIENDO EL VALOR DE  c
get_local 0
4
add
get_local $calc

PRINT
100
//OBTENIENDO EL VALOR DE  h
get_local 0
1
add
get_local $calc

PRINT
end

