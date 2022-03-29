/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;

/**
 *
 * @author DAW
 */
public class GestionDeFicherosRename {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File origenDir = new File("C:/Temp/Fotos");
        File destinoDir = new File("C:/Temp/Media/Fotografies");
        File origenDoc = new File("C:/Temp/Media/Fotografies/Document.txt");
        File destinoDoc = new File("C:/Temp/Document.txt");

        boolean res = origenDir.renameTo(destinoDir);
        System.out.println("Se ha movido y renombrado la carpeta? " + res);
        res = origenDoc.renameTo(destinoDoc);
        System.out.println("Se ha movido el documento? " + res);
    }

}

