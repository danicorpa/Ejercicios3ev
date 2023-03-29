package geometria;
/**
 * @author Daniel Martin Corpa
 * 28/3/23
 * 17:14
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
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(3,5);
        //Linea l = new Linea();
        Linea l = new Linea(p1,p2);
        System.out.println(p1.toString()+"\n"+p2.toString()+"\n"+l.toString());
        l.dibujarLinea();




    }
}
