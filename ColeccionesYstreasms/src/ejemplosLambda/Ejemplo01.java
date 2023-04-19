package ejemplosLambda;
/**
 * @author Daniel Martin Corpa
 * 18/4/23
 * 20:00
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


public class Ejemplo01 {

    public static void main(String[] args) {
    Ejemplo01 ejemplosLambda = new Ejemplo01();
    ejemplosLambda.ejemplo1(123);

    // Instaciamos la interface funcional
    ValidaImpar valida = n -> n%2!=0;
        System.out.println(valida.esImpar(2));

        Ejemplo04Lambda cuad = (a, b) -> a*a+b*b;
        System.out.println(cuad.ejemplo4(3,4));

        DevuelvePi pi = () -> Math.PI;
        System.out.println(pi.ejemplo6());

    }


    public boolean ejemplo1(int n) {
        return n % 2 != 0;
    }
    public boolean ejemplo2(Character c) {
        return c == 'y';
    }
    public double ejemplo3(double x, double y) {
        return x + y;
    }
    public int ejemplo4(int a, int b) {
        return a * a + b * b;
    }
    public int ejemplo5() {
        return 42;
    }
    public double ejemplo6() {
        return Math.PI;
    }
    public void ejemplo7(String s) {
        System.out.println(s);
    }
    public void ejemplo8() {
        System.out.println("Hola, mundo.");
    }

    // Como ejercicio, trata de “traducir” la expresión anterior a un método (estático o de
    //instancia, aquí es irrelevante):

    public int[] sumaResta(int a, int b){
        int suma = a+b;
        int resta = a-b;
        return new int[]{suma,resta};
    }

}
