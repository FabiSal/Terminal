/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//---------------------------------tipos de archivos y directorios----------------------------------------------------
//C:\Users\DAW\Desktop\Entornos\Practica_git_1.oft
//C:\Users\DAW\Desktop\Entornos

public class EjercicioA1 {

//------------------------------------funcion MuestraInfoRuta-----------------------------
    public static void MuestraInfoRuta(File ruta) throws FileNotFoundException {      
        //si la ruta no existe, saltaria la excepcion FileNotFoundException
        if (!ruta.exists()) {
            throw new FileNotFoundException();
        }
        //si la ruta fuera un archivo, imprimiria su nombre
        if (ruta.isFile()) {
            System.out.println("el nombre del archivo txt es: A " + ruta.getName());
        }
        //si la ruta fuera un directorio, imprimiria su nombre mas los nombres de todos los directorios y archivos que existieran
        if (ruta.isDirectory()) {
            System.out.println("el nombre del drectorio es: * " + ruta.getName()+""
                   
                    + " y contiente los sigueintes archivos y directorios: ");
          
            for (File ruta2 : ruta.listFiles()) {
                
                if (ruta2.isDirectory()) {
                    System.out.println("*" + ruta2.getName());
                }
                if (ruta2.isFile()) {
                    System.out.println("A" + ruta2.getName());
                }
            }
        }
    }
//bucle y lo damu(las listas.)
//--------------------------------------Main Class-----------------------------------------
    public static void main(String[] args) throws FileNotFoundException {
        Scanner Entrada = new Scanner(System.in);
        try {
            System.out.println("Introduce la ruta la que quieras ");
            String path = Entrada.next(); //el usuario escribe por teclado / igualamos la ruta al scanner.
            File ruta = new File(path);//creamos el fichero "ruta" e igualamos el fichero "path" a la ruta       
            MuestraInfoRuta(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("yo bro, are u ok, ma homie, this is ma barrio men?" + e);
        }
    }
}