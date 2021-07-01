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
public class PasajeUniversitario extends PasajeInterCantonal
        implements Serializable {
    
    private String nombreUniversidad;
    
    public PasajeUniversitario(String nombre, String ced, String dest,
            double km, double tarB, String nombreU){
        super(nombre, ced, dest, km, tarB);
        nombreUniversidad = nombreU;
        establecerValorPasaje();
    }
    
    public void establecerNombreUniversidad(String nU){
        nombreUniversidad = nU;
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = tarifaBase / 2;
    }
    
    public String obtenerNombreUniversidad(){
        return nombreUniversidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s- Nombre de la Universidad: %s\n"
                + "- Valor Pasaje: $%.2f\n", super.toString(),
                obtenerNombreUniversidad(), obtenerValorPasaje());
        return cadena;
    }
    
}
