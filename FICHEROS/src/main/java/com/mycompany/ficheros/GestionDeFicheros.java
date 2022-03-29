/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAW
 */
public class GestionDeFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fotos = new File("C:\\prueba\\YOUBRO");
        File doc = new File("C:\\prueba\\YOUBRO\\Gatetes.txt");

        //ES RUTA DE DONDE ESTA EL ARCHIVO
        boolean mkdirYOBRO = fotos.mkdir();    
        if (mkdirYOBRO) {
            System.out.println("Creada carpeta " + fotos.getName() + "? " + mkdirYOBRO);
            //NECESITAS UN TRY SI O SI PARA CREAR UN FICHERO.
            try {
                //crea fichero.
                // A partir del objeto File creamos el fichero físicamente
                if (doc.createNewFile()) {
                    System.out.println("El fichero se ha creado correctamente");
                } else {
                    System.out.println("No ha podido ser creado el fichero");
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } else {
            boolean delCa = fotos.delete();
            System.out.println("Borrada carpeta " + fotos.getName() + "? " + delCa);
            boolean delAr = doc.delete();
            System.out.println("Borrado archivo " + doc.getName() + "? " + delAr);
        }
    }

}
