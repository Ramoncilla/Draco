/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draco;

import ASM.Analizador.ParserASM;
import ASM.Analizador.ScannerASM;
import ASM.Arbol.CuerpoFuncion;
import ASM.Arbol.ListaFunciones;
import Arbol.Archivo;
import Arbol.objetoBase;
import D_Mas_Mas.Analizador.ParserDMM;
import D_Mas_Mas.Analizador.ScannerDMM;
import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JOptionPane;
import ASM.Generador;
import DracoScript.Analizador.ParserDraco;
import DracoScript.Analizador.ScannerDraco;

/**
 *
 * @author Ramonella
 */
public class EjecutarAnalizadores {

    public Archivo ejecutarDMM(String ruta) throws Exception {

        if (ruta.isEmpty() || ruta.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Error, cadena no valida para analizar D++.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
        } else {
            LectoArchivos lector = new LectoArchivos(ruta);
            String cadena = lector.obtenerContenidoArchivo(ruta);
            if (cadena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error, no es posible analizar una cadena vacia para D++.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Inicio de Analisis D++");
                ScannerDMM scannerDMM = new ScannerDMM(new BufferedReader(new StringReader(cadena)));
                ParserDMM parserDMM = new ParserDMM(scannerDMM);
                parserDMM.parse();
                Archivo a = ParserDMM.elementosArchivo;

                /*
                Generador g = new Generador();
                a.ejecutar(g);
                g.addCodigo(a.retorno.valor.valor.toString());*/
                //Archivo a = ParserDMM.elementosArchivo;
                // retorno= parserHtml.codigoHTML;
                System.out.println("Fin de analisis D++");
                return a;
            }
        }

        return null;
    }

    public zEjecucionDraco.Sentencias.CuerpoFuncion ejecutarDraco(String ruta) throws Exception {

        if (ruta.isEmpty() || ruta.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Error, cadena no valida para analizar D++.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
        } else {
            LectoArchivos lector = new LectoArchivos(ruta);
            String cadena = lector.obtenerContenidoArchivo(ruta);
            if (cadena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error, no es posible analizar una cadena vacia para D++.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Inicio de Analisis Draco");
                ScannerDraco scanner = new ScannerDraco(new BufferedReader(new StringReader(cadena)));
                ParserDraco parser = new ParserDraco(scanner);
                parser.parse();
                zEjecucionDraco.Sentencias.CuerpoFuncion cuerpo = (zEjecucionDraco.Sentencias.CuerpoFuncion) ParserDraco.sentenciasArchivo;
                System.out.println("Fin de analisis Draco");
                return cuerpo;

            }
        }

        zEjecucionDraco.Sentencias.CuerpoFuncion ret = new zEjecucionDraco.Sentencias.CuerpoFuncion();
        return ret;

    }

    public CuerpoFuncion ejecutarASM(String ruta) throws Exception {

        if (ruta.isEmpty() || ruta.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Error, cadena no valida para analizar ASM.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
        } else {
            LectoArchivos lector = new LectoArchivos(ruta);
            String cadena = lector.obtenerContenidoArchivo(ruta);
            if (cadena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error, no es posible analizar una cadena vacia para ASM.", "DRACO ENSAMBLADO WEB", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Inicio de Analisis ASM");
                ScannerASM scanner = new ScannerASM(new BufferedReader(new StringReader(cadena)));
                ParserASM parser = new ParserASM(scanner);
                parser.parse();
                CuerpoFuncion g = ParserASM.sentenciasArchivo;
                System.out.println("Fin de analisis ASM");
                return g;

            }
        }

        return null;
    }

}
