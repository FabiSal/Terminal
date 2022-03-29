package GestionDeFicheros;

import java.util.Scanner;
//mv /home/miguel /home/miguel2
public class prueba {

    public static void main(String[] args) {        
        Scanner miescaner = new Scanner (System.in);
        String comando = miescaner.next();
        String ruta1 = miescaner.next();
        String ruta2 = miescaner.next();
        miescaner.close();
        System.out.println(""+comando+" "+ruta1+" "+ruta2);
        
    }    
}
