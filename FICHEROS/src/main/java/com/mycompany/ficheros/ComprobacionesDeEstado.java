/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficheros;

import java.io.File;

public class ComprobacionesDeEstado {

    public static void main(String[] args) {
        File temp = new File("C:\\prueba");//desde la raiz
        File fotos = new File("E:\\DAW\\VirtualBox_VMs DE fabian Salinas\\FabianSalinas.vdi");//verifica si existe el archivo
        File document = new File("C:\\Users\\DAW\\Documents\\homie");//verifica si existe la carpeta
        System.out.println(temp.getAbsolutePath() + " ¿existe? " + temp.exists());//boolean.
        mostrarEstado(fotos);
        mostrarEstado(document);
    }

    public static void mostrarEstado(File f) {                   //booleans. te dice si es archivo o carpeta.
        System.out.println(f.getAbsolutePath() + " ¿archivo? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " ¿carpeta? " + f.isDirectory());
    }

}
