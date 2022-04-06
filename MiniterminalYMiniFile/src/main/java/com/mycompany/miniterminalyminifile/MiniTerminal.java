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
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class MiniTerminal {

    //*casa  C:\\Users\\prueba_terminal\\nuevo1
    //*colegio C:\\Users\\DAW
    static Scanner teclado = new Scanner(System.in);

    public static String[] leer_opcion() {

        String entrada = teclado.nextLine();
        String[] a = entrada.split(" ");

        return a;
    }

    public static void main(String[] args) throws InterruptedException {

        File ruta_inicial = new File("C:\\Users\\DAW\\Desktop\\FICHEROS\\src");

        MiniFileManager ruta = new MiniFileManager(ruta_inicial);

        boolean exit = false;

        do {
            String[] opcion = leer_opcion();

            if (opcion[0].equals("pwd")) {
                System.out.println("" + ruta.getPWD());
            } else
            try {
                if (opcion[0].equals("cd")) {
                    System.out.println("" + ruta.changeDir(opcion[1]));
                }
                if (opcion[0].equals("cd..")) {
                    ruta.changeDirFather();
                }
            } catch (FileNotFoundException x) {
                System.out.println(x.getMessage()); //imprime el mensage estandas de la excepcion o el que tu le das
                x.printStackTrace(); //te imprime el error con mas detalles
            }
            try {
                if (opcion[0].equals("mkdir")) {
                    System.out.println("" + ruta.MKDir(opcion[1]));

                }
            } catch (FileNotFoundException x) {
                System.out.println(x.getMessage()); //imprime el mensage estandas de la excepcion o el que tu le das
                x.printStackTrace(); //te imprime el error con mas detalles
            }
            if (opcion[0].equals("ls")) {
                ruta.printList(true);
            }
            if (opcion[0].equals("ll")) {
                ruta.printListPlus(true);
            }
            try {
                if (opcion[0].equals("rm")) {
                    String File = opcion[1];
                    System.out.println("" + ruta.RMFile(File));

                }
            } catch (FileNotFoundException x) {
                System.out.println(x.getMessage()); //imprime el mensage estandas de la excepcion o el que tu le das
                x.printStackTrace(); //te imprime el error con mas detalles
            }

            if (opcion[0].equals("mv")) {
                String File = opcion[1];
                String File2 = opcion[2];
                System.out.println("" + ruta.MVDir(opcion[1], opcion[2]));
            }
            if (opcion[0].equals("help")) {
                ruta.printHelp(true);
            }
            if (opcion[0].equals("exit")) {
                exit = true;
            }
        } while (exit == false);
    }
}
