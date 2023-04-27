/**
 * @author Daniel Martin Corpa
 * 27/4/23
 * 20:19
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @param
 * @see ""
 *
 */


public class EscribirFile {

    public static void main(String[] args) {
        String ruta    = "Ficheros/src/";
        String archivo = ruta+"fichero.txt";
        File file = new File(archivo);
        // Creamos un objeto escrito con fileWriter y le añadimos al final o sobreescribimos
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(file, false);
            for(int i=0;i < 10 ;i++) {
                escritor.write("Estoy escribiendo en el fichero. Otra vez.\n");
            }
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println("Error E/S.");
        }finally{
            try {
                escritor.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
