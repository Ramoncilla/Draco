/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draco;

/**
 *
 * @author Ramonella
 */
public class Draco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        EjecutarAnalizadores e= new EjecutarAnalizadores();
        e.ejecutarDMM("C:\\Users\\Ramonella\\Documents\\Repositorios\\Draco\\archivos_entrada\\ejemplo.dmm");
    }
    
}
