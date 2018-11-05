function $principal
/*Reservando memoria para las variables globales*/
get_global 0
0
ADD
set_global 0
/*RESOLVIENDO ASIGNACION DE i*/
/*Obteniendo posicion de i*/
get_local 0
1
add
/*Resolviendo Expresion a asignar*/
0/*Asignando Valor*/
set_local $calc
/*INICIO A RESOLVER PARA*/
L3:
/*Condicion del ciclo para*/
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
1
add
get_local $calc

10
LT
BR_IF L2
BR L1

L1:

/*-------- INICIO SI ---------*/
/*--- Codigo condicion ---*/
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
1
add
get_local $calc

1
LT
BR_IF L8
BR L7
L7:
/*------- inicio codigo Instrucciones  ------------*/
BR L4 // haciendo etiqueta continue 
/*------- fin codigo Instrucciones  ------------*/
BR L6
L8:
L6:
/*-------- FIN SI ---------*/
100
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
1
add
get_local $calc

PRINT
/*REsolviendo asignacion del ciclo para */
/*RESOLVIENDO ASIGNACION DE i*/
/*Obteniendo posicion de i*/
get_local 0
1
add
/*Resolviendo Expresion a asignar*/
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
1
add
get_local $calc

1
ADD/*Asignando Valor*/
set_local $calc
BR L3
/*Continue del ciclo para*/
L4: //etiqueta continuar para
/*RESOLVIENDO ASIGNACION DE i*/
/*Obteniendo posicion de i*/
get_local 0
1
add
/*Resolviendo Expresion a asignar*/
//OBTENIENDO EL VALOR DE  i VARIABLE LOCAL 
get_local 0
1
add
get_local $calc

1
ADD/*Asignando Valor*/
set_local $calc
BR L3
L2:

L5: //etiqueta break del ciclo para 
/*-------- FIN PARA --------*/
end

