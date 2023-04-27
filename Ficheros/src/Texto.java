/**
 * @author Daniel Martin Corpa
 * 27/4/23
 * 18:44
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.io.File;
import java.io.IOException;

/**
 * @param
 * @see ""
 *
 */


public class Texto {

    public static void main(String[] args) {
        String ruta = "Ficheros/src/"; // Ruta donde estará el archivo que vamos a manipular
        String archivo = "file.txt";
        String carpeta = "../ejemplo";
        File file = new File(ruta+archivo); //
        System.out.println("Vamos a ver métodos para File: ");
        System.out.println("Existe el fichero?? "+file.exists());
        if(!file.exists()){
            try {
                boolean creado = file.createNewFile();
                if (creado){
                    System.out.println("El fichero se ha creado en "+file.getCanonicalPath());
                }else{
                    System.out.println("El archivo ya exsite.");
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                System.out.println("Problema al crear el fichero. ");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Es un archivo?? "+file.isFile());
        System.out.println("Dime la ruta de ");
        System.out.println("Permisos: ");
        System.out.println("* Lectura."+file.canRead());
        System.out.println("* Escritura."+file.canWrite());
        System.out.println("* Ejecución."+file.canExecute());
        File carp = new File(carpeta);


    }
}
