/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAW
 */
public class EscrituraEnFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\DAW\\Documents\\NetBeansProjects\\ENTEROS.txt");
            FileWriter fw = new FileWriter(f, false); //con el true evita que ser sobreecriba la primera linea y te la pone en la siguiente linea.
            int valor = 4;                                      //con el false se elimina la primera linea.
            for (int i = 1; i <= 20; i++) {
                fw.write("" + valor); // escribimos valor
                fw.write(" "); // escribimos espacio en blanco
                valor = valor * 99; // calculamos próximo valor
            }
            fw.write("\n"); // escribimos nueva línea
            fw.close(); // cerramos el FileWriter
            System.out.println("Fichero escrito correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}


