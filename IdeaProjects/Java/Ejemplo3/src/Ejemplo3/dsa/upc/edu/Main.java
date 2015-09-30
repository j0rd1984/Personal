package Ejemplo3.dsa.upc.edu;
import java.io.*;

public class Main {

    //  the file we want to check
    String fileName = "C:\\Text.xlsx";
    File file = new File(fileName);

    // try to rename the file with the same name
    File sameFileName = new File(fileName);



    public static void main(String[] args) {
        File f = new File("C:\\Users\\Jordi\\IdeaProjects\\Ejemplo3\\Fichero.txt");
        if (f.exists() && !f.isDirectory()) {
            System.out.println("El archivo existe");
            boolean fileIsNotLocked = f.renameTo(f);
            if fileIsNotLocked
        }
            else{
            System.out.println("El archivo no existe");
        }
    }
}
