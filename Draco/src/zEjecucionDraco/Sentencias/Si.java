/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zEjecucionDraco.Sentencias;

import java.util.ArrayList;
import java.util.List;
import zEjecucionDraco.baseDraco;

/**
 *
 * @author Ramonella
 */
public class Si  extends baseDraco{
    
     public int tipoSi;
    public IF siInicial;
    public CuerpoFuncion sino;
    public List<IF> listaSinoSi;
   
    
    /*
      SI::= IF  1
	| IF:a SINO  2
	| IF:a L_SINO_SI:b 3
	| IF:a L_SINO_SI:b SINO:c  4   
    */
    
    public Si(int tipo, Object si, Object sino, Object sinoSi){
        this.tipoSi= tipo;
        this.siInicial= (IF) si;
        this.sino = (CuerpoFuncion)sino;
        this.listaSinoSi= (ArrayList<IF>)sinoSi;

        
    }
    
    
}
