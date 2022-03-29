/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

/**
 *
 * @author DAW
 */
/**
 * @param args the command line arguments
 */
import java.io.File;
import java.util.Scanner;

public class LecturaDeFicheros {

    public static final int NUM_VALORES = 10;

    public static void main(String[] args) {

        try {
            
            // Intentamos abrir el fichero                           //poner simpre la ruta.absoluta
            File f = new File("C:\\Users\\DAW\\Documents\\NetBeansProjects\\ENTEROS.txt");
            Scanner lector = new Scanner(f);

            // Si llega aquí es que ha abierto el fichero :)
            for (int i = 0; i < NUM_VALORES; i++) {
                int valor = lector.nextInt();
                System.out.println("El valor leído es: " + valor);
            }

            // ¡Hay que cerrar el fichero!
            lector.close();

        } catch (Exception e) {
            // En caso de excepción mostramos el error
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
}
