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
public abstract class PasajeInterCantonal implements Serializable{
    
    protected String nombrePasajero;
    protected String cedula;
    protected String destino;
    protected double numeroKm;
    protected double tarifaBase;
    protected double valorPasaje;

    public PasajeInterCantonal(String nombre, String ced, String dest,
            double km, double tarB){
        nombrePasajero = nombre;
        cedula = ced;
        destino = dest;
        numeroKm = km;
        tarifaBase = tarB;
    }
    
    public void establecerNombrePasajero(String n){
        nombrePasajero = n;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerDestino(String d){
        destino = d;
    }
    
    public void establecerNumeroKm(double km){
        numeroKm = km;
    }
    
    public void establecerTarifaBase(double tar){
        tarifaBase = tar;
    }
    
    public abstract void establecerValorPasaje();
    
    public String obtenerNombrePasajero(){
        return nombrePasajero;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerDestino(){
        return destino;
    }
    
    public double obtenerNumeroKm(){
        return numeroKm;
    }
    
    public double obtenerTarifaBase(){
        return tarifaBase;
    }
    
    public double obtenerValorPasaje(){
        return valorPasaje;
    }
    
    @Override
    public String toString(){
        return String.format("- Nombre del pasajero: %s\n"
                + "- Cédula: %s\n"
                + "- Destino: %s\n"
                + "- Número de Km: %.2f Km\n"
                + "- TarifaBase: $%.2f\n",
                obtenerNombrePasajero(),
                obtenerCedula(),
                obtenerDestino(),
                obtenerNumeroKm(),
                obtenerTarifaBase());
    }
    
    
}
