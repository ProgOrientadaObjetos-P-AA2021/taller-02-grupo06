/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    private double porcentajeAdicional;
    
    public PasajeNormal(double val, double por){
        super(val);
        porcentajeAdicional = por;
    }
    
    public void establecerPorcentajeAdicional(double p){
        porcentajeAdicional = p;
    }
    
    @Override
    public void establecerValorPasaje(){
        
    }
    
}
