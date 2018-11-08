/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draco;

import ASM.Arbol.CuerpoFuncion;
import ASM.Arbol.ListaFunciones;
import ASM.Interprete;
import Arbol.Archivo;
import Arbol.PrimeraPasada;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import Errores.ListaErrores;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import zEjecucionDraco.EjecucionDraco;

/**
 *
 * @author Ramonella
 */
public class Draco {
    
    public static ListaErrores erroresEjecucion;
    public static ListaErrores errores3D;
    public static ListaErrores erroresJS;
    public static List<objetoBase> declaracionesGlobales;
    public static ListaFunciones funcionesArchivo;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        erroresEjecucion = new ListaErrores();
        erroresJS= new ListaErrores();
        errores3D= new ListaErrores();
        EjecutarAnalizadores e= new EjecutarAnalizadores();
        /*
       Archivo arch=  e.ejecutarDMM("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.dmm");
       if(arch!= null){
           declaracionesGlobales= new ArrayList<>();
           funcionesArchivo = new ListaFunciones();
           TablaSimbolos t = new TablaSimbolos();
           PrimeraPasada p = new PrimeraPasada(arch, t);
           p.llenarTabla();
           t.escribirTabla();
           arch.ejecutarArchivo(t);
           erroresEjecucion.moostrarErrores();
           
       }else{
           
       }*/
      zEjecucionDraco.Sentencias.CuerpoFuncion sentencias =  e.ejecutarDraco("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.draco");
      if(sentencias!= null){
          EjecucionDraco excute = new EjecucionDraco(sentencias);
          excute.ejecutarDraco();
          System.out.println("");
      }
      /*
     CuerpoFuncion f = e.ejecutarASM("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.asm");
     if(f!= null){
         Interprete g = new Interprete(f);
         g.ejecutar();
     }
     */
    }
    
    
    
}
