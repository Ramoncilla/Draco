/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Expresion;

import Arbol.objetoBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class Acceso extends objetoBase{
    
    public List<objetoBase>elementos;
    
    
    public Acceso(Object valores){
        this.elementos = (ArrayList<objetoBase>)valores;
    }
}
