function $principal
115
GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
72 // H
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
79 // O
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


GET_GLOBAL 0
GET_GLOBAL 0
GET_GLOBAL 0
76 // L
SET_GLOBAL $calc
1
ADD
SET_GLOBAL 0
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


set_global 2
set_global 1

get_global 0//108 12

//
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc //H

L0:
set_global 3
get_global 3
get_global 3 // ingresando una vez mas H

1
DIFF
EQZ

BR_IF L1 //verdaderas
BR L2 //falsas

L1:
set_global $calc
1
ADD
set_global 1
// 108 12 12
1
ADD
set_global 0
//calculo de valor = heap[posInicial]
get_global 0
get_global 1

get_global 0
get_global 1

get_global $calc //H
BR L0
L2:
//108 12 14 8 14 -1
set_global 3
set_global 3
set_global 3
set_global 3


//segunda cadena
//
get_global 0
get_global 2

get_global 0
get_global 2

get_global $calc //L

L3:
set_global 3
get_global 3
get_global 3 // ingresando una vez mas H

1
DIFF
EQZ

BR_IF L4 //verdaderas
BR L5 //falsas

L4:
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
BR L3
L5:
//108 12 14 8 14 -1
set_global 3
set_global 3
set_global 3
set_global 3

//extra
-1
set_global $calc
get_global 0
1
ADD
set_global 0

PRINT

end

