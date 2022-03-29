/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeFicheros;

import java.io.File;
import static java.lang.System.console;

public class EjercicioA3 { 

    public static void main(String[] args) {
//------------------------------------se crean objetos de File , archivos-----------------------------------------------

        File fotografiasorigen = new File("C:\\Users\\DAW\\Desktop\\Fotografias");
        File fotografiasDestino = new File("C:\\Users\\DAW\\Desktop\\FOTOS");
        File docuementosorigen = new File("C:\\Users\\DAW\\Desktop\\documentos");
        File documentosDestino = new File("C:\\Users\\DAW\\Desktop\\DOCS");
        File Librosorigen = new File("C:\\Users\\DAW\\Desktop\\Libros");
        File LibrosDestino = new File("C:\\Users\\DAW\\Desktop\\LECTURAS");

//----------------------para cambian la ruta, te dira true o false, dependidendo si cambio o no.-------------------------------------
        boolean verificar;
        verificar = fotografiasorigen.renameTo(fotografiasDestino);
        System.out.println("el directorio C:/users/DAW/Desktop/Fotografias a sido cambiado a: " + verificar);
        verificar = docuementosorigen.renameTo(documentosDestino);
        System.out.println("el directorio C:/users/DAW/Desktop/Fotografias a sido cambiado a: " + verificar);
        verificar = Librosorigen.renameTo(LibrosDestino);
        System.out.println("el directorio C:/users/DAW/Desktop/Fotografias a sido cambiado a: " + verificar);

//------------------------------si existe la ruta los cambia------------------------------------------------
//para que te indique los archivos que estan dentro.
          //siempre te ordena alfabeticamente todos los archivos que continene la ruta pa.
        for (File ruta2 : fotografiasDestino.listFiles()) {
            if (ruta2.isFile()) {           //recorre el nombre de los archivos y por cada archivo borra todos los caracteres que vayan despues del '.'(hasta que sae encuentra el '.')
                System.out.println("C:\\Users\\DAW\\Desktop\\FOTOS\\" + ruta2.getName().substring(0,ruta2.getName().lastIndexOf('.')));
            }                                                                                   //corta desda la posicin 0(valor solo numerico) hasta el valor introduciod 'algo'.
        }
         System.out.println("------------------------------------------------------------------");
        for (File ruta2 : LibrosDestino.listFiles()) {
            if (ruta2.isFile()) {           //recorre el nombre de los archivos y por cada archivo borra todos los caracteres que vayan despues del '.'(hasta que sae encuentra el '.')
                System.out.println("C:\\Users\\DAW\\Desktop\\FOTOS\\" + ruta2.getName().substring(0,ruta2.getName().lastIndexOf('.')));
            }
        }
    }
}
                    