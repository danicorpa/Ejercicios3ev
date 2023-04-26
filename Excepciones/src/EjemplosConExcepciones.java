/**
 * @author Daniel Martin Corpa
 * 26/4/23
 * 17:51
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @param
 * @see ""
 *
 */

public class EjemplosConExcepciones {

    public static void main(String[] args) {
        // para gestionar los posbles errores en ejecucion
        // 1) try {} ---> aqui metemos el codigo que puede fallar
        // 2) catch {tipoExcepciopn nombreExcepcion} ---> cuando salta una excepción entra por aqui
        // lo que pone entre las llaves es lo que quieres que haga en caso
        // de que se produzca esa excepción.
        // 3) opcionalmente finally {} ---> se ejecuta despues del try si no salta excepcion,
        // y despues del catch si ha sido capturada

        int numerador = 0;
        int denominador = 0;
        String[] array = {"uno", "dos", "tres"};
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();

            try {
                for (int i = 0; i < 10; i++) {
                    ar.add(i);
                }

                ar.get(11);
                int numero = sc.nextInt();
                System.out.println(numerador / denominador);
                System.out.println(array[3]);

            } catch (ArrayIndexOutOfBoundsException e) {
                //Si salta la excepcion se crea el objeto e
                System.out.println("Te has pasado de posición en el array, Melón!!");
                //e.printStackTrace();
            } catch (ArithmeticException e1) {
                System.out.println(e1.getMessage() + " Dividiste por Zero y sabes que es ilegal... Melón!!");
            } catch (InputMismatchException e2) {
                System.out.println("Debes meter un entero, Melón!!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Te pasaste en eñ ArrayList!!Melón...");
            } catch (Exception e4) {
                e4.printStackTrace();
            }
    }
}
