/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
//C:\Users\DAW\Documents\NetBeansProjects

public class EjercicioA2 {

    public static File MuestraInfoRuta(File f) throws Exception {

        long milisegundos = f.lastModified();//devuelve la ultima fecha de edicion.
        Date fecha = new Date(milisegundos);
        String[] listado = f.list();

        if (listado == null || listado.length == 0) {
                for (int i = 0; i < 10; i++) {
                
            }
            System.out.println("No hay elementos dentro de la carpeta actual");
        } else {
            System.out.println("el nombre del directorio es: " + f.getName());

            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
                System.out.println(" ");
                System.out.println("Última modificación (ms) : " + milisegundos);
                System.out.println("Última modificación (fecha): " + fecha);
                System.out.println("Tamaño del archivo: " + f.length());
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Introduce la ruta la que quieras ");
        String path = Entrada.next(); //el usuario escribe por teclado / igualamos la ruta , a la entrada.
        File ruta = new File(path);//creamos el fichero e igualamos el fichero "(f)" a la ruta       
        MuestraInfoRuta(ruta);

    }

}
