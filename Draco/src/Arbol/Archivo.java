/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Archivo {
    
    public List<objetoBase> elementosArchivo;
    
    
    public Archivo(Object val){
        this.elementosArchivo= (ArrayList<objetoBase>)val;
    }
    
 
    
    public void ejecutarArchivo(TablaSimbolos tabla){
        Generador codASM = new Generador();
        objetoBase temp;
        elementoRetorno elem;
        Ambito3D ambitos = new Ambito3D();
        ambitos.addAmbiente(Constantes.GLOBAL);
       //reservarEspcioGlobales(codASM, tabla);
        for (int i = 0; i < this.elementosArchivo.size(); i++) {
            temp= this.elementosArchivo.get(i);
            elem = temp.ejecutar(codASM, tabla, ambitos, "");
        }
        ambitos.salirAmbito();
        escribirArchivo(codASM.codigo);
    }
    
    
    
    
    
    public  void escribirArchivo(String cad){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.asm");
            pw = new PrintWriter(fichero);
            pw.println(cad);
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
