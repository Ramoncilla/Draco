/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Mas_Mas.Tabla_Simbolos;

import ASM.Ambito3D;
import draco.Constantes;
import java.util.ArrayList;
import java.util.List;
import static draco.Draco.erroresEjecucion;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Ramonella
 */
public class TablaSimbolos {
    
    
    public List<Simbolo> listaSimbolos;
    
    public TablaSimbolos(){
        this.listaSimbolos= new ArrayList<>();
    }
    
    
    public void insertarSimbolo(Simbolo s){
        
        boolean val= existeSimbolo(s);
        if(!val){
            this.listaSimbolos.add(s);
        }else{
           erroresEjecucion.addSemantico(0, 0, "La variable "+ s.nombreCorto+", ya existe en el ambito actual");
        }
    }
    
    
    public boolean existeSimbolo (Simbolo s){
        
        Simbolo simb;
        for (int i = 0; i <this.listaSimbolos.size(); i++) {
            simb= listaSimbolos.get(i);
            if(simb.nombreCorto.equalsIgnoreCase(s.nombreCorto) &&
                    simb.ambito.equalsIgnoreCase(s.ambito)){
                return true;
            }
        }
        return false;
    }
    
    
    
   public int obtenerNumeroGlobales(){
       int g =0;
       Simbolo temporal;
       for (int i = 0; i < this.listaSimbolos.size(); i++) {
           temporal = this.listaSimbolos.get(i);
           if(temporal.ambito.equalsIgnoreCase(Constantes.GLOBAL)){
               g++;
           }
       }
       return g;
   } 
    
    
   
   
   
 /*----------------- OBTENER TIPO DE UNA VARIABLE ---------------------------------*/
 
   public String obtenerTipoVar(String nombre, Ambito3D ambiente){
      Ambito3D ambitoTemporal = ambiente.clonar();
      String cadenaAmbito;
      String tipo="";
       for (int i = 0; i < ambiente.ambientes.size(); i++) {
           cadenaAmbito = ambitoTemporal.getAmbito();
           tipo = getTipo(cadenaAmbito, nombre);
           if(!(tipo.equalsIgnoreCase(""))){
               return tipo;
           }
           ambitoTemporal.salirAmbito();
       }
      return "";      
   }
    
private String getTipo (String cadenaAmbito, String nombre ){
  Simbolo simTemporal;

  for (int i =0; i<this.listaSimbolos.size(); i++){
      simTemporal  = this.listaSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombreCorto.equalsIgnoreCase(nombre)){
              return simTemporal.tipoElemento;
          }
      }
  }
return "";
}



/*--------------------------- OBTENER SI ES O NO ATRIBUTO UNA VARIABLE -------------------------------*/
public Object esAtributo(String nombre, Ambito3D ambitos){
 
  Ambito3D ambitoTemporal = ambitos.clonar();
  int  cont =0;
  String cadenaAmbito="";
   
  if(this.listaSimbolos.isEmpty()){
      cont+=0;
  }
  else{
    for(int i =0; i<ambitos.ambientes.size(); i++){
        cadenaAmbito = ambitoTemporal.getAmbito();
        cont=cont + existeListaLocal(cadenaAmbito,nombre);
        if(cont>0){
          return false;
        }
        ambitoTemporal.salirAmbito();
    }
}

 
  ambitoTemporal= ambitos.clonar();
   cont =0;
   cadenaAmbito="";
   
  if(this.listaSimbolos.isEmpty()){
      cont+=0;
  }
  else{
    for(int i =0; i<ambitos.ambientes.size(); i++){
        cadenaAmbito = ambitoTemporal.getAmbito();
        cont=cont + existeListaGlobal(cadenaAmbito,nombre);
        if(cont>0){
          return true;
        }
        ambitoTemporal.salirAmbito();
    }
}

return null;

}
   

private int existeListaGlobal (String cadenaAmbito, String nombre ){
  Simbolo simTemporal;
  int cont =0;
  nombre= nombre+"";
  for (int i =0; i<this.listaSimbolos.size(); i++){
      simTemporal  = this.listaSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombreCorto.equalsIgnoreCase(nombre)){
            if(simTemporal.ambito.equalsIgnoreCase(Constantes.GLOBAL)){
              cont++;
            }
              
          }
      }
  }
return cont;
}


private int existeListaLocal (String cadenaAmbito, String nombre ){
  Simbolo simTemporal;
  int cont =0;
  nombre= nombre+"";
  for (int i =0; i<this.listaSimbolos.size(); i++){
      simTemporal  = this.listaSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombreCorto.equalsIgnoreCase(nombre)){
            if(!(simTemporal.ambito.equalsIgnoreCase(Constantes.GLOBAL))){
              cont++;
            }
              
          }
      }
  }
return cont;
}




/*=================== Obtener la posicion de una variable global=========================*/

public int obtenerPosAtributo(String nombre, Ambito3D ambitos){
  Ambito3D ambitoTemporal = ambitos.clonar();
  String cadenaAmbito="";
  for(int i =0; i<ambitos.ambientes.size(); i++){
    cadenaAmbito = ambitoTemporal.getAmbito();
    int  cont= this.posGlobal(cadenaAmbito,nombre);
    if(cont>=0){
      return cont;
    }
    ambitoTemporal.salirAmbito();
}
return -1; 
}


private int posGlobal (String cadenaAmbito, String nombre ){
  Simbolo simTemporal;

  for (int i =0; i<this.listaSimbolos.size(); i++){
      simTemporal  = this.listaSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombreCorto.equalsIgnoreCase(nombre)){
            if(simTemporal.ambito.equalsIgnoreCase(Constantes.GLOBAL)){
              return simTemporal.apuntador;
            }
              
          }
      }
  }
return -1;
}



/*============= OBTENER LA POSICION DE UNA VARIABLE LOCAL ==========================*/
public int obtenerPosLocal (String nombre, Ambito3D ambitos){
   Ambito3D ambitoTemporal = ambitos.clonar();
   String cadenaAmbito="";
  for(int i =0; i<ambitos.ambientes.size(); i++){
    cadenaAmbito = ambitoTemporal.getAmbito();
    int cont= this.posLocal(cadenaAmbito,nombre);
    if(cont>=0){
      return cont;
    }
   ambitoTemporal.salirAmbito();
}
return -1;
  
};


private int posLocal (String cadenaAmbito, String nombre ){
  Simbolo simTemporal;

  for (int i =0; i<this.listaSimbolos.size(); i++){
      simTemporal  = this.listaSimbolos.get(i);
      if(simTemporal.ambito.equalsIgnoreCase(cadenaAmbito)){
          if(simTemporal.nombreCorto.equalsIgnoreCase(nombre)){
              if(!(simTemporal.ambito.equalsIgnoreCase(Constantes.GLOBAL))){
              return simTemporal.apuntador;
            }
              
          }
      }
  }
return -1;
};









   
   
   
   public void escribirTabla(){

    String  encabezado="<table border =1><tr>"
    +"<th>Nombre</th>"
              +"<th> Ambito</th>"
              +"<th>Tipo Simbolo </th>"
              +"<th> Rol </th>"
              
              +"<th>Tipo Elemento </th>"
              +"<th> Apuntador</th>"
              +"<th> Tamanio </th>"
              +"<th> No. Parametros</th>"
              +"<th> Cadena Parametros </th>"
              +"<th> Nombre Funcion </th>"
              +"<th> No. Dimensiones </th>"
              +"</tr>";
    String cuerpo ="";
    Simbolo temporal;          
    for (int i = 0; i < this.listaSimbolos.size(); i++) {
      temporal = this.listaSimbolos.get(i);
      cuerpo +=temporal.getHTMLSimbolo();
    }
    String tabla =encabezado + cuerpo+"</table>";
    FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\tablaSimbolo.html");
            pw = new PrintWriter(fichero);
            pw.println(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

}
    
}
