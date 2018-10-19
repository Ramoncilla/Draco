/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol.Sentencias;

import Arbol.objetoBase;

/**
 *
 * @author Ramonella
 */
public class AsignaUnario extends objetoBase {
    
    public String id;
    public String operador;
    
    
    public AsignaUnario(Object id, Object op){
        this.id= id.toString();
        this.operador= op.toString();
    }
    
}
