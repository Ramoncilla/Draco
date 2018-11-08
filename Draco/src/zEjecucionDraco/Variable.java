/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco;

import ASM.Valor;
import draco.Constantes;
import zEjecucionDraco.Sentencias.Asignacion;

/**
 *
 * @author Ramonella
 */
public class Variable {
    
        public String nombre;
        public String tipo;
        public Valor valor;
        public String ambito;
        public Asignacion asignaDecla;
    
    
      public Variable(String nom, String ambito)
        {
            this.nombre = nom;
            this.ambito = ambito;
            this.tipo= Constantes.ENTERO;
            this.valor= new Valor();
            this.valor.crearEntero(0);
            this.asignaDecla= null;
            
        }

        public void asignarValor(Valor v)
        {
           this.valor= v;
           this.tipo= v.tipo;
        }


}
