package EjemploClaseParametrizada;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 19:03
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

/**
 * @param
 * @see ""
 *
 */


public class Main {

    public static void main(String[] args) {

        // Contenedor con Integer
        Contenedor<Integer> numero = new Contenedor<>();
        numero.guardar(123);
        System.out.println(numero.devolver());

        // Contenedor con String
        Contenedor<String> cadena = new Contenedor<>();
        cadena.guardar("Esto es una cadnea dentro de una clase parametrizada");
        System.out.println(cadena.devolver());

    }
}
