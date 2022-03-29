/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoPractico;

/**
 *
 * @author DAW
 */
//C:\Users\DAW\Documents\NetBeansProjects
public class MiniFileManager {

    private String ruta_inicial;
    private String nueva_ruta;

    public MiniFileManager(String ruta_inicial, String nueva_ruta) {
        this.ruta_inicial = ruta_inicial;
        this.nueva_ruta = nueva_ruta;
    }

    public MiniFileManager() {

    }

    public String getNueva_ruta() {
        return this.nueva_ruta = ruta_inicial + this.nueva_ruta;
    }

    public void setNueva_ruta(String nueva_ruta) {

    }

    public String getRuta_inicial() {
        return this.ruta_inicial = "C:\\Users\\DAW\\Documents\\NetBeansProjects";
    }

    public void setRuta_inicial(String ruta_inicial) {

    }

    public String getPWD() {
        return getRuta_inicial();
    }

    public boolean changeDir(String dir) {

            return false;
        
    }

    public void printList(boolean info) {

    }

    public void printListplus(boolean info) {

    }

    public String MKDir(String dir) {

        return null;
    }

    public String RMFile(String File) {

        return null;
    }

    public String MVDir(String dir, String dir2) {

        return null;
    }

    public void printHelp(boolean info) {

    }
}
