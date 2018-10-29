/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Mas_Mas.Tabla_Simbolos;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Simbolo {
    
    public String nombreCorto;
    public String tipoSimbolo;
    public String ambito;
    public String tipoElemento;
    public String rol;
    public int apuntador;
    public int tamanio;
    public List<objetoBase> dimensiones;
    public int noParametros;
    public String parametrosFuncionCadena;
    public String nombreFuncion;
    public objetoBase expresionAtributo;
    public int noDimensiones;
    public List<Object> arregloNs;
    
    
    
    public  Simbolo(){
	this.nombreCorto ="";
	this.tipoSimbolo="";//arreglo, puntero, var , obj, edd
	this.tipoElemento="";//entero, persona, char, dcimal
	this.ambito=""; //persona1_entero_metodoBonito_decimal_if1
	this.rol=""; //variable local, parametro, retorno, atributo, clase, metodo
	this.apuntador=-1;
	this.tamanio=0;//tamanho de una clase o de un metodo
	this.dimensiones =new ArrayList<>(); //nodo de las las dimensines de un arreglo
    this.noParametros =-1; 
    this.parametrosFuncionCadena="";//ENTERO_CARACTER_OBJ
    this.nombreFuncion="";
    this.expresionAtributo=null;//pubico entero a =5;	
    this.noDimensiones=0;
    this.arregloNs = new ArrayList<>();
}
    
    
    public void setValoresVariables(String nombreC, String tipoSimb, String tipoE, String ambito, String rol, int apu, int size){
         this.nombreCorto= nombreC;
 	 this.tipoSimbolo= tipoSimb;
 	 this.tipoElemento= tipoE;
 	 this.ambito= ambito;
 	 this.rol = rol;
 	 this.apuntador= apu;
 	 this.tamanio=size;
    }
    



 public void setValoresArreglo (String nombreC, String tipoSimb, String tipoElemento, String ambito,String rol, int apu, int size, int noDimensiones, List<objetoBase>listaDim) {
     this.nombreCorto = nombreC;
     this.tipoSimbolo= tipoSimb;
     this.tipoElemento= tipoElemento;
     this.ambito= ambito;
     this.rol = rol;
     this.apuntador= apu;
     this.tamanio = size;
     this.noDimensiones= noDimensiones;
     this.dimensiones = listaDim;

 }


    public void setExpresionAtributo(objetoBase expresionAtributo) {
        this.expresionAtributo = expresionAtributo;
    }

    public void setArregloNs(List<Object> arregloNs) {
        this.arregloNs = arregloNs;
    }


public String getHTMLSimbolo() {

        String cadenaSimbolo= "<tr>"
        +"<td>"+this.nombreCorto+"</td>"
            +"<td>"+this.ambito +"</td>"
            +"<td>"+this.tipoSimbolo +"</td>"
            +"<td>"+this.rol +"</td>"
            +"<td>"+this.tipoElemento +"</td>"
            +"<td>"+this.apuntador +"</td>"
            +"<td>"+this.tamanio +"</td>"
            +"<td>"+this.noParametros +"</td>"
            +"<td>"+this.parametrosFuncionCadena +"</td>"
            +"<td>"+this.nombreFuncion +"</td>"
            +"<td>"+this.noDimensiones +"</td>"
            +"</tr>";

            return cadenaSimbolo;
}


public void setValoresFuncion (String nombreC, String tipo, String tipoS, String ambito,String rol,int apuntador,int tamanio,int noPar,String cadenParametros,String nombreFun){
    this.nombreCorto= nombreC;
    this.tipoElemento=tipo;
    this.tipoSimbolo = tipoS;
    this.ambito= ambito;
    this.rol = rol;
    this.apuntador= apuntador;
    this.tamanio = tamanio;
    this.noParametros= noPar;
    this.parametrosFuncionCadena= cadenParametros;
    this.nombreFuncion= nombreFun;

}

    
}
