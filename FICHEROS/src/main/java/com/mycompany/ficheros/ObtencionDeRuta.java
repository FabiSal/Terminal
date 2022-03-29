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
import java.io.File;

public class ObtencionDeRuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dos rutas absolutas
        File carpetaAbs = new File("C:\\Users\\DAW\\Documents\\NetBeansProjects");//ruta absoluta con la carpeta
        File archivoAbs = new File("C:\\Users\\DAW\\Documents\\NetBeansProjects\\PRUEBA.txt");//ruta relativa con el archivo
        // Dos rutas relativas
        File carpetaRel = new File("PRUEBA");//
        File fitxerRel = new File("\\NetBeansProjects\\PRUEBA.txt");
        // Mostrem sus rutas
        mostrarRutas(carpetaAbs);
        mostrarRutas(archivoAbs);
        mostrarRutas(carpetaRel);
        mostrarRutas(fitxerRel);
    }

    //esto te muestra el padre de las rutas
    public static void mostrarRutas(File f) {
        System.out.println("getParent() : " + f.getParent());
        System.out.println("getName() : " + f.getName());
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath() + "\n");
    }
}
