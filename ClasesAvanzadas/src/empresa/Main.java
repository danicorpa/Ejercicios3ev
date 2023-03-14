package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:19
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @param
 * @see ""
 *
 */


public class Main {

    public static void main(String[] args) {

    Programador progrqamador = new Programador();
    progrqamador.setAñoNacimiento(1995);
    progrqamador.setNombre("A. Arenal");
    progrqamador.setDireccion("Pobladura del Valle, S/N");
    progrqamador.setFechaInicio(LocalDate.parse("2017-03-08"));
    String[] lenguajes = {"Java","JavaScript","python"};
    progrqamador.setLenguajes(lenguajes);

        System.out.println(progrqamador.getNombre() +
                " - " + progrqamador.getDireccion() +
                " - " + progrqamador.getAñoNacimiento() +
                " - " + progrqamador.getFechaInicio() +
                " - " + Arrays.toString(progrqamador.getLenguajes()));
    }
}
