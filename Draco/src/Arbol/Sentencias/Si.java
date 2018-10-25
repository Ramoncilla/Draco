/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import ASM.Generador;
import ASM.elementoRetorno;
import Arbol.Funciones.CuerpoFuncion;
import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Si extends objetoBase{
    public int tipoSi;
    public IF siInicial;
    public CuerpoFuncion sino;
    public List<IF> listaSinoSi;
    
    public Si(int tipo, Object si, Object sino, Object sinoSi){
        this.tipoSi= tipo;
        this.siInicial= (IF) si;
        this.sino = (CuerpoFuncion)sino;
        this.listaSinoSi= (ArrayList<IF>)sinoSi;
    }

    @Override
    public elementoRetorno ejecutar(Generador cod) {
        this.siInicial.ejecutar(cod);
        return new elementoRetorno();
    }
    
    
    
    
    
}
