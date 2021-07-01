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
    
    public PasajeNormal(String nombre, String ced, String dest,
            double km, double tarB, double por){
        super(nombre, ced, dest, km, tarB);
        porcentajeAdicional = por;
        establecerValorPasaje();
    }
    
    public void establecerPorcentajeAdicional(double p){
        porcentajeAdicional = p;
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = (numeroKm * 0.15) + (tarifaBase + (tarifaBase * (
                porcentajeAdicional /100)));
    }
    
    public double obtenerPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s- Porcentaje adicional: %.2f%%\n"
                + "- Valor Pasaje: $%.2f\n",super.toString(),
                obtenerPorcentajeAdicional(),
                obtenerValorPasaje());
        return cadena;
    }
    
}
