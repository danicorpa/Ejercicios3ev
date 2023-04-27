/**
 * @author Daniel Martin Corpa
 * 27/4/23
 * 19:55
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @param
 * @see ""
 *
 */


public class EjemploScanner {

    public static void main(String[] args) {
        String ruta = "Ficheros/src/";
        String file = "HolaMundo.java";
        File archivo = new File(ruta + file);

        if (archivo.exists()) {
            System.out.println("Existe.");

        }
        Scanner lector = null;
        try {
            lector = new Scanner(archivo);
            // con el scanner leemos linea a linea
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            System.out.println("Ruta no encontrada.");
            System.out.println("Lo estas buscando en " + archivo.getAbsolutePath());
        }finally{
            lector.close();
        }
    }
}
