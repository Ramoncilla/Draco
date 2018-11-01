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
1
set_global $calc

get_global 0
1
ADD
set_global 0

get_global 0
set_global 1 // posicion donde inician las dimensiones tp/n//Resolviendo las dimensiones del arreglo valores
//Dimension 1
get_global 0
10
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

get_global 0
get_global 4
ADD
set_global 0

/*RESOLVIENDO ASIGNACION DE valores*/
get_local 0
1
ADD

get_local $calc
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
1
1
MULT
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
1
1
MULT
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

//resolver expresion
1
1
MULT
//fin de resolver expresion

get_global 5
ADD
0
DIFF
set_global 5

get_global 3
1
ADD
set_global 3
BR L6

L10:
130
get_global 4
ADD //aqui va error 
BR L13

L8:
get_global 1
get_global 5
ADD

//linea donde obtengo el valor
get_global $calc
//para asignacion hacer un pop a la pila auxiliar

L13:
/*Resolviendo Expresion a asignar*/
99/*Asignando Valor*/
set_global $calc
100
get_local 0
1
ADD

get_local $calc
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
1
1
MULT
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
1
1
MULT
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

//resolver expresion
1
1
MULT
//fin de resolver expresion

get_global 5
ADD
0
DIFF
set_global 5

get_global 3
1
ADD
set_global 3
BR L14

L18:
130
get_global 4
ADD //aqui va error 
BR L21

L16:
get_global 1
get_global 5
ADD

//linea donde obtengo el valor
get_global $calc
//para asignacion hacer un pop a la pila auxiliar

L21:

PRINT
end

