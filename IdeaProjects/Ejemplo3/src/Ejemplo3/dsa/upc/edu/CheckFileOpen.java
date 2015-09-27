package Ejemplo3.dsa.upc.edu;

import java.io.*;

/**
 * Created by Jordi on 27/09/2015.
 */
public class CheckFileOpen {
    public static boolean isFileUnlocked(File fichero.txt) {
        try {
            FileInputStream in = new FileInputStream(file);
            if (in!=null) in.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
