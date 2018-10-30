/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.objetoBase;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Acceso extends objetoBase{
    
     public int tipoAcceso;
     public objetoBase valor1;
     public objetoBase valor2;
     public objetoBase valor3;
  
     
    
     public Acceso(Object tipo, Object val1 ){
         this.tipoAcceso=(int)tipo;
         this.valor1= (objetoBase)val1;
     }
     
      public Acceso(Object tipo, Object val1, Object val2 ){
         this.tipoAcceso=(int)tipo;
         this.valor1= (objetoBase)val1;
         this.valor2= (objetoBase)val2;
         
     }
    
      
    public Acceso(Object tipo, Object val1, Object val2, Object val3 ){
         this.tipoAcceso=(int)tipo;
         this.valor1= (objetoBase)val1;
         this.valor2= (objetoBase)val2;
          this.valor3= (objetoBase)val3;
     }
      
    
   

    @Override
    public elementoRetorno ejecutar(Generador cod, TablaSimbolos tabla) {
        return super.ejecutar(cod, tabla); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
   
}
