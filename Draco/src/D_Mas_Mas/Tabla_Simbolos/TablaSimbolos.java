/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Mas_Mas.Tabla_Simbolos;

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
