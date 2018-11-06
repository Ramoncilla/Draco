/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import ASM.Ambito3D;
import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Funciones.Funcion;
import Arbol.Sentencias.DeclaArreglo;
import Arbol.Sentencias.Declaracion;
import D_Mas_Mas.Tabla_Simbolos.TablaSimbolos;
import draco.Constantes;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import static draco.Draco.declaracionesGlobales;
import static draco.Draco.funcionesArchivo;

/**
 *
 * @author Ramonella
 */
public class Archivo {
    
    public List<objetoBase> elementosArchivo;
    
    public List<objetoBase> sentenciasAEjecutar;
    
    public List<Importar> importaciones;
    public List<Importar> importacioneHechas;
    
    
    public Archivo(Object val){
        this.elementosArchivo= (ArrayList<objetoBase>)val;
        this.sentenciasAEjecutar= new ArrayList<>();
        this.importacioneHechas= new ArrayList<>();
        this.importaciones= new ArrayList<>();
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
            if(temp instanceof Declaracion || temp instanceof DeclaArreglo){
                declaracionesGlobales.add(temp);
            }else{
                elem = temp.ejecutar(codASM, tabla, ambitos, "");
            }
            
        }
        ambitos.salirAmbito();
        escribirArchivo(codASM.codigo);
    }
    
    
    private void guardarFunciones()
    {
        objetoBase temp;
        for (int i = 0; i < this.elementosArchivo.size(); i++) {
            temp= this.elementosArchivo.get(i);
            if(temp instanceof Funcion){
                funcionesArchivo.insertar(temp);
            }
        }
    
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
