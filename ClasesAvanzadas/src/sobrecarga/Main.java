package sobrecarga;
/**
 * @author Daniel Martin Corpa
 * 15/3/23
 * 18:49
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

        SuperClase sc = new SuperClase();
        System.out.println("** Llamamos al metodo de la superclase.**");
        sc.metodo();
        SubClase sub = new SubClase();
        System.out.println("** Llamamos al metodo sobreescrito de la subclase.**");
        sub.metodo();
        System.out.println("** Llamamos al metodo sobrecargado de la subclase.**");
        sub.metodo("Sobrecarga: mecagondio!! ");


    }
}
