/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeFicheros;

import java.io.File;

/*
 *Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y
‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de
‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de
ayuda los códigos numéricos ASCII:
 */
public class EjercicioA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aplicacion de los numeros ASCII : indicamos que A es 65 y Z es 90 .
        int A = 65;
        int Z = 90;
        // Y esto es para cambiar de numeros a letras.
        char ch = (char) A;
        char chn = (char) Z;
        //se crean los archivos
        File f1 = new File("C:\\Users\\DAW\\Desktop\\DOCS\\Mis_Cosas");
        if (f1.mkdir()) {
            System.out.println("yo Men wat up, this Movida has been created my amigo");
        }

        File f2 = new File("C:\\Users\\DAW\\Desktop\\DOCS\\Alfabeto");
        if (f2.mkdir()) {
            System.out.println("ok, men, shut up mikhail ¡¡¡¡");
        }
//movemos los objetos de archivos ya creados del anterior ejercicio

        File fotoOrigen = new File("C:\\Users\\DAW\\Desktop\\FOTOS");
        File LibroOrigen = new File("C:\\Users\\DAW\\Desktop\\LECTURAS");
        File fotoDestino = new File("C:\\Users\\DAW\\Desktop\\DOCS\\Mis_Cosas\\FOTOS");
        File LibroDestino = new File("C:\\Users\\DAW\\Desktop\\DOCS\\Mis_Cosas\\LECTURAS");
//boolean para verificar si se movieron o no las carpetas.

        boolean verificar;
        verificar = fotoOrigen.renameTo(fotoDestino);
        System.out.println("el directorio C:\\Users\\DAW\\Desktop\\FOTOS a sido cambiado a: " + verificar);
        verificar = LibroOrigen.renameTo(LibroDestino);
        System.out.println("el directorio C:\\Users\\DAW\\Desktop\\LECTURAS a sido cambiado a: " + verificar);
        
        
//cramos un for para que recorra todas las letras en tipo ASCII
        for (char i = ch; i <= chn; i++) {
            System.out.println("" + i);

//cogemos la ruta C:\\Users\\DAW\\Desktop\\prueba
            File ruta = new File("C:\\Users\\DAW\\Desktop\\DOCS");
            //comprobamos si existe la ruta
            if (ruta.exists()) {
                //crea directorios con el nombre de la variable i(todas las letras de tipo ASCII)
                File f = new File("C:\\Users\\DAW\\Desktop\\DOCS\\Alfabeto\\" + i);
                if (f.mkdir()) {
                    System.out.println("yo ma men, ur directory has been created, by god; u know who is god, Dieguito papa¡¡¡¡¡¡");
                 
                }
            }

        }

    }
}
