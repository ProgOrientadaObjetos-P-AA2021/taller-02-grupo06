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
        
        PasajeMenorEdad p3 = new PasajeMenorEdad("Jamil", "123549889",
                "Cuenca", 120, 12.55, 5);
        PasajeMenorEdad p4 = new PasajeMenorEdad("Jose", "1234567897",
                "Guayaquil", 156, 230, 10);
        
        PasajeTerceraEdad p5 = new PasajeTerceraEdad("Julio", "468546156",
                "Quito", 280, 22);
        PasajeTerceraEdad p6 = new PasajeTerceraEdad("Mario", "32863168354",
                "Zamora", 150, 12.3);
        
        PasajeUniversitario p7 = new PasajeUniversitario("Martha", "23159855",
                "Loja", 100, 6.21, "UTPL");
        PasajeUniversitario p8 = new PasajeUniversitario("Erika", "232168462",
                "Quito", 300, 48, "Universidad central");

        pasajes.add(p1);
        pasajes.add(p2);
        pasajes.add(p3);
        pasajes.add(p4);
        pasajes.add(p5);
        pasajes.add(p6);
        pasajes.add(p7);
        pasajes.add(p8);

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
