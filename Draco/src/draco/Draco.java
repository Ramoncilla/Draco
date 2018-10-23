/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draco;

import ASM.Arbol.ListaFunciones;
import ASM.Interprete;
import Errores.ListaErrores;

/**
 *
 * @author Ramonella
 */
public class Draco {
    
    public static ListaErrores erroresEjecucion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        erroresEjecucion = new ListaErrores();
        EjecutarAnalizadores e= new EjecutarAnalizadores();
        e.ejecutarDMM("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.dmm");
     //   e.ejecutarDraco("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.draco");
     ListaFunciones f = e.ejecutarASM("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.asm");
     if(f!= null){
         Interprete g = new Interprete(f);
         g.ejecutar();
     }
     
    }
    
}
