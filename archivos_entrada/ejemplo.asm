function $principal
/*Reservando memoria para las variables globales*/
get_global 0
2
ADD
set_global 0
/*Inicializando p, edd global*/
6
0
ADD
get_global 0
set_global $calc
get_global 0
get_global 0
1
ADD
set_global $calc
get_global 0
1
ADD
set_global 0
get_global 0
2
ADD
set_global 0
/*RESOLVIENDO ASIGNACION DE p.edad global*/
6
0
ADD
get_global $calc
get_global $calc
1
ADD/*Resolviendo Expresion a asignar*/
25/*Asignando Valor*/
set_global $calc
/*RESOLVIENDO ASIGNACION DE p.nombre global*/
6
0
ADD
get_global $calc
get_global $calc
0
ADD/*Resolviendo Expresion a asignar*/
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
110 // n
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
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
85 // U
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
98 // b
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
110 // n
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
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
/*Asignando Valor*/
set_global $calc
115
//RESOLVIENDO ACCESO DE p.nombre global 
6
0
ADD
get_global $calc
get_global $calc
0
ADD
get_global $calc
PRINT
100
//RESOLVIENDO ACCESO DE p.edad global 
6
0
ADD
get_global $calc
get_global $calc
1
ADD
get_global $calc
PRINT
/*Inicializando pedro, edd local*/
get_local 0
1
ADD 
get_global 0
set_local $calc
get_global 0
get_global 0
1
ADD
set_global $calc
get_global 0
1
ADD
set_global 0
get_global 0
2
ADD
set_global 0
/*RESOLVIENDO ASIGNACION DE pedro.edad*/
get_local 0
1
ADD
get_local $calc
get_global $calc
1
ADD
/*Resolviendo Expresion a asignar*/
26/*Asignando Valor*/
set_global $calc
/*RESOLVIENDO ASIGNACION DE pedro.nombre*/
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
/*Resolviendo Expresion a asignar*/
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
112 // p
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
set_global $calc
/*RESOLVIENDO ASIGNACION DE c*/
/*Obteniendo posicion de c*/
6
1
add
/*Resolviendo Expresion a asignar*/
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
104 // h
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
108 // l
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
32 //  
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

//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc

set_global 2
SET_GLOBAL 1 

//buscando el valor del heap
get_global 0

//--- Cadena 1
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc
L1:
set_global 3
get_global 3
get_global 3 

-1
DIFF
EQZ

BR_IF L2 //verdaderas
BR L3 //falsas
L2:
set_global $calc
1
ADD
set_global 1
1
ADD
set_global 0
//calculo de valor = heap[posInicial]
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc //H
BR L1
L3:
set_global 3
set_global 3
set_global 3
set_global 3
//segunda cadena

get_global 0
get_global 2

get_global 0
get_global 2

get_global $calc //L

L4:
set_global 3
get_global 3
get_global 3 // ingresando una vez mas H

-1
DIFF
EQZ

BR_IF L5 //verdaderas
BR L6//falsas

L5:
set_global $calc
1
ADD
set_global 2
// 108 12 12
1
ADD
set_global 0
//calculo de valor = heap[posInicial]
get_global 0
get_global 2

get_global 0
get_global 2

get_global $calc //H
BR L4
L6:
//108 12 14 8 14 -1
set_global 3
set_global 3
set_global 3
set_global 3

//extra
get_global 0
-1
set_global $calc
get_global 0
1
ADD
set_global 0/*Asignando Valor*/
set_global $calc
115
//OBTENIENDO EL VALOR DE  c VARIABLE GLOBAL
6
1
add
get_global $calc

PRINT
100
//RESOLVIENDO ACCESO DE pedro.edad
get_local 0
1
ADD
get_local $calc
get_global $calc
1
ADD
get_global $calc

PRINT
115
//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc

PRINT
115
//OBTENIENDO EL VALOR DE  c VARIABLE GLOBAL
6
1
add
get_global $calc

PRINT
100
//RESOLVIENDO ACCESO DE pedro.edad
get_local 0
1
ADD
get_local $calc
get_global $calc
1
ADD
get_global $calc

PRINT
/*RESOLVIENDO ASIGNACION DE pedro.nombre*/
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
/*Resolviendo Expresion a asignar*/
//OBTENIENDO EL VALOR DE  c VARIABLE GLOBAL
6
1
add
get_global $calc
/*Asignando Valor*/
set_global $calc
115
//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc

PRINT
/*RESOLVIENDO ASIGNACION DE pedro.nombre*/
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
/*Resolviendo Expresion a asignar*/
GET_GLOBAL 0
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
110 // n
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
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
60 // <
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
51 // 3
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
set_global $calc
/*RESOLVIENDO ASIGNACION DE c*/
/*Obteniendo posicion de c*/
6
1
add
/*Resolviendo Expresion a asignar*/
//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc
/*Asignando Valor*/
set_global $calc
115
//OBTENIENDO EL VALOR DE  c VARIABLE GLOBAL
6
1
add
get_global $calc

PRINT
115
//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc

PRINT
/*RESOLVIENDO ASIGNACION DE p.edad global*/
6
0
ADD
get_global $calc
get_global $calc
1
ADD/*Resolviendo Expresion a asignar*/
//RESOLVIENDO ACCESO DE pedro.edad
get_local 0
1
ADD
get_local $calc
get_global $calc
1
ADD
get_global $calc

2
ADD/*Asignando Valor*/
set_global $calc
/*RESOLVIENDO ASIGNACION DE p.nombre global*/
6
0
ADD
get_global $calc
get_global $calc
0
ADD/*Resolviendo Expresion a asignar*/
//RESOLVIENDO ACCESO DE pedro.nombre
get_local 0
1
ADD
get_local $calc
get_global $calc
0
ADD
get_global $calc

GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
32 //  
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
104 // h
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
115 // s
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
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0

set_global 2
SET_GLOBAL 1 

//buscando el valor del heap
get_global 0

//--- Cadena 1
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc
L7:
set_global 3
get_global 3
get_global 3 

-1
DIFF
EQZ

BR_IF L8 //verdaderas
BR L9 //falsas
L8:
set_global $calc
1
ADD
set_global 1
1
ADD
set_global 0
//calculo de valor = heap[posInicial]
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc //H
BR L7
L9:
set_global 3
set_global 3
set_global 3
set_global 3
//segunda cadena

get_global 0
get_global 2

get_global 0
get_global 2

get_global $calc //L

L10:
set_global 3
get_global 3
get_global 3 // ingresando una vez mas H

-1
DIFF
EQZ

BR_IF L11 //verdaderas
BR L12//falsas

L11:
set_global $calc
1
ADD
set_global 2
// 108 12 12
1
ADD
set_global 0
//calculo de valor = heap[posInicial]
get_global 0
get_global 2

get_global 0
get_global 2

get_global $calc //H
BR L10
L12:
//108 12 14 8 14 -1
set_global 3
set_global 3
set_global 3
set_global 3

//extra
get_global 0
-1
set_global $calc
get_global 0
1
ADD
set_global 0/*Asignando Valor*/
set_global $calc
100
//RESOLVIENDO ACCESO DE p.edad global 
6
0
ADD
get_global $calc
get_global $calc
1
ADD
get_global $calc
PRINT
115
//RESOLVIENDO ACCESO DE p.nombre global 
6
0
ADD
get_global $calc
get_global $calc
0
ADD
get_global $calc
PRINT
end

