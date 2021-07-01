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
public class PasajeTerceraEdad extends PasajeInterCantonal {
    
    public PasajeTerceraEdad(String nombre, String ced, String dest,
            double km, double tarB) {
        super(nombre, ced, dest, km, tarB);
        establecerValorPasaje();
    }
<<<<<<< HEAD

    public double getValorPasaje() {
        return valorPasaje;
    }
=======
>>>>>>> bc45ec9d47428d37f8c025c79929de640628b438
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = (numeroKm * 0.5) + (tarifaBase / 2);
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s- Valor pasaje: $%.2f\n",
                super.toString(), obtenerValorPasaje());
        return cadena;
    }
    
}
