function $principal
/*Reservando memoria para las variables globales*/
get_global 0
0
ADD
set_global 0
//creando apuntadores para el arreglo local  valores

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
set_global $calc

get_global 0
1
ADD
set_global 0

get_global 0
set_global 1 // posicion donde inician las dimensiones tp
//Resolviendo las dimensiones del arreglo valores
//Dimension 1
get_global 0
10
set_global $calc

get_global 0
1
ADD
set_global 0
//Dimension 2
get_global 0
3
set_global $calc

get_global 0
1
ADD
set_global 0
get_global 1
1
DIFF

get_global $calc 
set_global 2 //no de dimensiones  del arreglo tdim
1
set_global 3 // contador del ciclo para ingresar las  dimensiones tcont

L1:

get_global 3
get_global 2
LTE 
BR_IF L3
BR L2

L2:
get_global 3
1
DIFF
EQZ
BR_IF L5
BR L4

L4:
get_global 1
get_global $calc

1
DIFF

0
DIFF // tRes

get_global 1
1
ADD
set_global 1

get_global 3
1
ADD
set_global 3

BR L1

L5:

get_global 1
get_global $calc

MULT

get_global 1
get_global $calc
1
DIFF
ADD
0
DIFF

get_global 1
1
ADD
set_global 1

get_global 3
1
ADD
set_global 3

BR L1

L3:
1
ADD

set_global 4
get_global 0
get_global 4
set_global $calc

get_global 0
1
ADD
set_global 0
//******************** nuevo 
get_global 0
get_global 2
ADD
set_global 0
//************ fin de lo nuevo 

get_global 0
get_global 4
ADD
set_global 0

/*RESOLVIENDO ASIGNACION DE valores*/
//asignando valores de dimenesiones al heap

//para un arreglo local
get_local 0
1
ADD
get_local $calc


get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 3 //posInician valor de las dimensiones
get_local 0
1
ADD

get_local $calc
//asignando valores de dimenesiones al heap local 

//para un arreglo local
get_local 0
1
ADD
get_local $calc


//para ambos casos

get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 1 //posInician valor de las dimensiones

get_local 1
set_local 2

get_local 2
//resuelve expresion
2
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
get_local 2
//resuelve expresion
2
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
set_global 1 //tposInicio
get_global 1


get_global $calc //apuntador donde inicia el arreglo

get_global $calc //numero de dimensiones 

//guardando la posicion donde en verdad inician las posiciones del arreglo

set_global 2 // tDimensiones (t4)

//calculo de tp

get_global 1
2 
ADD
set_global 3 // tp

// calculo de tposInicio
get_global 1
2
ADD
set_global 1

get_global 1
get_global $calc
get_global 1
ADD
1
ADD
set_global 1

1
set_global 4 // tcont

0
set_global 5 //tRes

L6:

get_global 4
get_global 2
LTE
BR_IF L8
BR L7

L7:

//resuelvo expresion
get_local 3
get_global $calc
//fin de expresion

get_global 3
get_global $calc
LT 
BR_IF L10
BR L9

L9:
get_global 4
1
DIFF
EQZ
BR_IF L12
BR L11

L11:

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

0
DIFF

set_global 5

get_global 4
1
ADD
set_global 4

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 

BR L6 

L12:

get_global 4
1
ADD
set_global 4

get_global 3
get_global $calc

get_global 5
MULT
set_global 5

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

get_global 5
ADD
0
DIFF
set_global 5

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 
BR L6

L10:
130
get_global 4
ADD //aqui va error 
BR L13

L8:
get_local 3
get_global 5
ADD

set_local 5
get_local 5
//linea donde obtengo el valor
get_global $calc
//para asignacion hacer un pop a la pila auxiliar

L13:
set_local 4
//obtengo la direccion de donde se debe asignar
get_local 5
/*Resolviendo Expresion a asignar*/
1666/*Asignando Valor*/
set_global $calc
/*RESOLVIENDO ASIGNACION DE valores*/
//asignando valores de dimenesiones al heap

//para un arreglo local
get_local 0
1
ADD
get_local $calc


get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 3 //posInician valor de las dimensiones
get_local 0
1
ADD

get_local $calc
//asignando valores de dimenesiones al heap local 

//para un arreglo local
get_local 0
1
ADD
get_local $calc


//para ambos casos

get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 1 //posInician valor de las dimensiones

get_local 1
set_local 2

get_local 2
//resuelve expresion
9
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
get_local 2
//resuelve expresion
2
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
set_global 1 //tposInicio
get_global 1


get_global $calc //apuntador donde inicia el arreglo

get_global $calc //numero de dimensiones 

//guardando la posicion donde en verdad inician las posiciones del arreglo

set_global 2 // tDimensiones (t4)

//calculo de tp

get_global 1
2 
ADD
set_global 3 // tp

// calculo de tposInicio
get_global 1
2
ADD
set_global 1

get_global 1
get_global $calc
get_global 1
ADD
1
ADD
set_global 1

1
set_global 4 // tcont

0
set_global 5 //tRes

L14:

get_global 4
get_global 2
LTE
BR_IF L16
BR L15

L15:

//resuelvo expresion
get_local 3
get_global $calc
//fin de expresion

get_global 3
get_global $calc
LT 
BR_IF L18
BR L17

L17:
get_global 4
1
DIFF
EQZ
BR_IF L20
BR L19

L19:

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

0
DIFF

set_global 5

get_global 4
1
ADD
set_global 4

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 

BR L14 

L20:

get_global 4
1
ADD
set_global 4

get_global 3
get_global $calc

get_global 5
MULT
set_global 5

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

get_global 5
ADD
0
DIFF
set_global 5

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 
BR L14

L18:
130
get_global 4
ADD //aqui va error 
BR L21

L16:
get_local 3
get_global 5
ADD

set_local 5
get_local 5
//linea donde obtengo el valor
get_global $calc
//para asignacion hacer un pop a la pila auxiliar

L21:
set_local 4
//obtengo la direccion de donde se debe asignar
get_local 5
/*Resolviendo Expresion a asignar*/
999/*Asignando Valor*/
set_global $calc
/*RESOLVIENDO ASIGNACION DE valores*/
//asignando valores de dimenesiones al heap

//para un arreglo local
get_local 0
1
ADD
get_local $calc


get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 3 //posInician valor de las dimensiones
get_local 0
1
ADD

get_local $calc
//asignando valores de dimenesiones al heap local 

//para un arreglo local
get_local 0
1
ADD
get_local $calc


//para ambos casos

get_global $calc // apuntador
set_global 1 

get_global 1
get_global $calc // noDimensiones
set_global 2


get_global 2
2
MULT
get_global 1
ADD
set_local 1 //posInician valor de las dimensiones

get_local 1
set_local 2

get_local 2
//resuelve expresion
0
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
get_local 2
//resuelve expresion
0
//fin de resuelve expresion
set_global $calc

get_local 2
1
ADD
set_local 2
set_global 1 //tposInicio
get_global 1


get_global $calc //apuntador donde inicia el arreglo

get_global $calc //numero de dimensiones 

//guardando la posicion donde en verdad inician las posiciones del arreglo

set_global 2 // tDimensiones (t4)

//calculo de tp

get_global 1
2 
ADD
set_global 3 // tp

// calculo de tposInicio
get_global 1
2
ADD
set_global 1

get_global 1
get_global $calc
get_global 1
ADD
1
ADD
set_global 1

1
set_global 4 // tcont

0
set_global 5 //tRes

L22:

get_global 4
get_global 2
LTE
BR_IF L24
BR L23

L23:

//resuelvo expresion
get_local 3
get_global $calc
//fin de expresion

get_global 3
get_global $calc
LT 
BR_IF L26
BR L25

L25:
get_global 4
1
DIFF
EQZ
BR_IF L28
BR L27

L27:

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

0
DIFF

set_global 5

get_global 4
1
ADD
set_global 4

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 

BR L22 

L28:

get_global 4
1
ADD
set_global 4

get_global 3
get_global $calc

get_global 5
MULT
set_global 5

//resuelvo expresion
get_local 3
get_global $calc
//fin expresion

get_global 5
ADD
0
DIFF
set_global 5

get_global 3
1
ADD
set_global 3
///aqui viene lo nuevoo 
  get_local 3
1
ADD
set_local 3
//fin de lo nuevo 
BR L22

L26:
130
get_global 4
ADD //aqui va error 
BR L29

L24:
get_local 3
get_global 5
ADD

set_local 5
get_local 5
//linea donde obtengo el valor
get_global $calc
//para asignacion hacer un pop a la pila auxiliar

L29:
set_local 4
//obtengo la direccion de donde se debe asignar
get_local 5
/*Resolviendo Expresion a asignar*/
1888/*Asignando Valor*/
set_global $calc
/*-------- INICIO SI ---------*/
/*--- Codigo condicion ---*/
0
1
DIFF
EQZ
BR_IF L32 //etiqueta Falsa
BR L31 //verdadera
L31:
/*------- inicio codigo Instrucciones  ------------*/
115
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
116 // t
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
110 // n
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
113 // q
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
117 // u
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
110 // n
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
114 // r
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
114 // r
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
97 // a
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
113 // q
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
117 // u
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
-1 // escape 
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0

PRINT
/*------- fin codigo Instrucciones  ------------*/
BR L30
L32:
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
108 // l
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
99 // c
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
114 // r
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
101 // e
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
99 // c
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

PRINT
BR L30
L30:
/*-------- FIN SI ---------*/
end

