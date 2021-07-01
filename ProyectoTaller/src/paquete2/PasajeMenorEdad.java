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
public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable {

    private double descuento;

    public PasajeMenorEdad(String nombre, String ced, String dest,
            double km, double tarB, double des) {
        super(nombre, ced, dest, km, tarB);
        descuento = des;
        establecerValorPasaje();
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerDescuento(double d) {
        descuento = d;
    }

    @Override
    public void establecerValorPasaje() {
        valorPasaje = (numeroKm * 0.10) + (tarifaBase - (tarifaBase
                * (descuento / 100)));
    }

    @Override
    public String toString () {
        String cadena = String.format("%s- Porcentaje descuento: %.2f%%\n"
                + "- Valor pasaje: $%.2f\n", super.toString(),
                obtenerDescuento(), obtenerValorPasaje());
        return cadena;
    }

}
