/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;
import java.util.Date;


public class PropiedaDeLosFichero {


    public static void main(String[] args) {
        File documento = new File("C:\\Users\\DAW\\Documents\\NetBeansProjects\\PRUEBA.txt");
        System.out.println(documento.getAbsolutePath());//te enseña la ruta absoluta

        long milisegundos = documento.lastModified();//devuelve la ultima fecha de edicion.
        Date fecha = new Date(milisegundos);

        System.out.println("Última modificación (ms) : " + milisegundos);
        System.out.println("Última modificación (fecha): " + fecha);
        System.out.println("Tamaño del archivo: " + documento.length());//el tamaño del archivo en bytes/Gbytes/Kbytes...      
    }
}

