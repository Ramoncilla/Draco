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
public class CuerpoFuncion extends baseDraco{
    
    public List<baseDraco> sentencias;
    
    
    public CuerpoFuncion(Object v){
        this.sentencias= (ArrayList<baseDraco>)v;
    }
    
    
}
