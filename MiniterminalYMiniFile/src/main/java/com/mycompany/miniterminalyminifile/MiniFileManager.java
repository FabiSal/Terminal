/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miniterminalyminifile;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Date;

//C:\Users\DAW\Documents\NetBeansProjects
public class MiniFileManager {
    
    private File ruta;
    
    public MiniFileManager(File ruta_inicial) {
        this.ruta = ruta_inicial;
    }
    
    public MiniFileManager() {
        
    }
    
    public File getRuta_inicial() {
        return ruta;
    }
    
    public void setRuta_inicial(String ruta_inicial) {
        
    }
    
    public File getPWD() {
        return ruta;
    }
    
    public boolean changeDir(String dir) throws FileNotFoundException {
        File ruta_nueva = new File(dir);
        if (!ruta_nueva.exists()) {
            throw new FileNotFoundException("that path doesn´t exist ma homie!!");
        }
        ruta = ruta_nueva; //igualo la ruta inicial con la nueva ruta con la que queremos movernos
        return true;
    }
    
    public void changeDirFather() throws FileNotFoundException {
        
        File ruta_nueva = new File(ruta.getParent());
        if (!ruta_nueva.exists()) {
            throw new FileNotFoundException("that path doesn´t exist ma homie!!");
        }
        System.out.println("" + ruta.getParent());
        ruta = ruta_nueva;
    }
    
    public void printList(boolean info) {
        if (info == true) {
            for (File ruta2 : ruta.listFiles()) {
                if (ruta2.isDirectory()) {
                    System.out.println("" + ruta2.getName());
                }
            }
            for (File ruta2 : ruta.listFiles()) {
                if (ruta2.isFile()) {
                    System.out.println("" + ruta2.getName());
                }
            }
        }
    }
    
    public void printListPlus(boolean info) {
        if (info == true) {
            for (File ruta2 : ruta.listFiles()) {
                if (ruta2.isDirectory()) {
                    System.out.println("" + ruta2.getName());
                    System.out.println("Tamaño del archivo: " + ruta2.length());
                    long milisegundos = ruta2.lastModified();
                    Date fecha = new Date(milisegundos);
                    System.out.println("Última modificación (ms) : " + milisegundos);
                    System.out.println("Última modificación (fecha): " + fecha);
                }
            }
            for (File ruta2 : ruta.listFiles()) {
                if (ruta2.isFile()) {
                    System.out.println("" + ruta2.getName());
                    System.out.println("Tamaño del archivo: " + ruta2.length());
                    long milisegundos = ruta2.lastModified();
                    Date fecha = new Date(milisegundos);
                    System.out.println("Última modificación (ms) : " + milisegundos);
                    System.out.println("Última modificación (fecha): " + fecha);
                }
            }
        }
    }

//---------------------funcion para crear directorio------------------------------
    public boolean MKDir(String dir) throws FileNotFoundException {
        //creo una nueva ruta y la igualo al String dir
        File nuevo = new File(dir);
        //si la ruta existe, lanza la siguiente excepcion
        if (nuevo.exists()) {
            throw new FileNotFoundException("yo bro, what u doing? the path already exist");
        }
        if (!nuevo.getParentFile().exists()) {
            throw new FileNotFoundException("yo bro, what u doing? his father doesn´t exist");
        }
        
        return nuevo.mkdir();
    }
//rm , borra el archivo y la carpeta. no borra la carpeta si contiene archivos.

    public String RMFile(String file) throws FileNotFoundException {
        //creo una nueva ruta, con el fichero dentro
        File ruta2 = new File(file);
        //si no existe la ruta, lanza una excepcion
        if (!ruta2.exists()) {
            throw new FileNotFoundException();
        } else { //sino
            if (ruta2.isFile()) { //si la ruta es un ficher, recorre la lista de la nueva ruta
                boolean borrado = ruta2.delete(); //creo un boolean para saber si se ha eliminado o no el fichero
                System.out.println("Borrada carpeta " + ruta2.getName() + " " + borrado); //incdica que el fichero a sido borrado
            }
            if (ruta2.isDirectory()) { //si la ruta es un directorio
                for (File ruta3 : ruta2.listFiles()) { //recorre la nueva lista del directorio y elimina todo su contenido, tanto de lo que tenia dentro como el propio directorio
                    if (ruta3.isFile()) {
                        System.out.println("" + ruta3.getName());
                        boolean borrado = ruta3.delete();
                        System.out.println("Borrada carpeta " + ruta3.getName() + " " + borrado);
                        boolean borrado2 = ruta2.delete();
                        System.out.println("Borrada carpeta " + ruta2.getName() + " " + borrado2);
                    }
                }
            }
        }
        return "se ha eliminado"; //nos devolveria el siguiente mensaje
    }
    
    public String MVDir(String dir, String dir2) {
        File origen = new File(dir);
        File detino = new File(dir2);
        boolean verificar = origen.renameTo(detino);
        System.out.println("" + verificar);
        
        ruta = new File(dir2); //igualo ruta a la nueva direccion
        return "se a movido a " + dir2;
    }
    
    public void printHelp(boolean info) {
        System.out.println("-PWD te devuelve la ruta en la que estas situado"
                + "-LS (list) lista el contenido de un directorio"
                + "-CD (change directory) permite moverse entre directorios del sistema"
                + "-MV (Move) mueve directorios o archivos de una ubicación a otra"
                + "-RM (Remove) elimina archivos"
                + "-MKDIR crear un nuevo subdirectorio o carpeta del sistema de archivos");
    }
}
