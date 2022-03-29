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

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se tiene que importar el fichero. con import.
                //tiene que estar donde esta el proyecto y con la extension del fichero
        File fichero = new File("prueba1.txt");
        try{
        if (fichero.exists()){
            System.out.println("nombre del archivo " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir " + fichero.canRead());
            System.out.println("Sepuede leer " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
        }
        
        }catch(ArithmeticException e){
            System.out.println("esta mal todo ");
        }
    }
    
}
