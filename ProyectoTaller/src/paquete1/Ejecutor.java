/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();

        PasajeNormal p1 = new PasajeNormal("Luis Carrillo", "1122334455",
                "Suces", 3, 1, 2);
        PasajeNormal p2 = new PasajeNormal("Angel Mogrovejo", "7896855123",
                "Algelia", 5, 1.5, 4);
        
        //PasajeMenorEdad p3 = new PasajeMenorEdad();

        pasajes.add(p1);
        pasajes.add(p2);
        //pasajes.add(p3);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(
                nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {

            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(
                nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
