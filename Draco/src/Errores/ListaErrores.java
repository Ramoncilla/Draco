/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import draco.Constantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class ListaErrores {
    
   public List<Error_> errores;
   
   
   public ListaErrores(){
       this.errores= new ArrayList<>();
   }
    
   
   public void addSemantico(int col, int fil, String desc){
       Error_ e = new Error_(col, fil, Constantes.SEMANTICO, desc);
       this.errores.add(e);
   }
    
   
   public void addLexico(int col, int fil, String desc){
       Error_ e = new Error_(col, fil, Constantes.LEXICO, desc);
       this.errores.add(e);
   }
   
   public void addSintactico(int col, int fil, String desc){
       Error_ e = new Error_(col, fil, Constantes.SINTACTICO, desc);
       this.errores.add(e);
   }
}
