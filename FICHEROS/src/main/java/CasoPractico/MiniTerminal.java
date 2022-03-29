/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoPractico;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class MiniTerminal {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        MiniFileManager objeto1 = new MiniFileManager();

        String entrada = teclado.nextLine();
        String[] entradaArr = entrada.split(" ");

        String comando = entradaArr[0];
        String dir = null;
        String dir2 = null;
        if (entradaArr.length > 1) {
            dir = entradaArr[1];
        }
        if (entradaArr.length > 2) {
            dir = entradaArr[1];
            dir2 = entradaArr[2];
        }
        if (entradaArr[0].equals("pwd")) {
            System.out.println("" + objeto1.getPWD());
        }
        if (entradaArr[0].equals("cd")) {
            System.out.println("" + objeto1.changeDir(dir));
        }
        
        
        if (entradaArr[0].equals("")) {
            System.out.println("" + objeto1.changeDir(dir));
        }
    }
}
