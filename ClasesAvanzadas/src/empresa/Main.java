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

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * @param
 * @see ""
 *
 */


public class Main {

    public static void main(String[] args) {

    Programador progrqamador = new Programador( 1990, "Maldonado","Currito", LocalDate.now(),20000L,
            new String[]{"Java","Python","JavaScript"});



    progrqamador.setAñoNacimiento(1995);
    progrqamador.setNombre("A. Arenal");
    progrqamador.setDireccion("Pobladura del Valle, S/N");
    progrqamador.setFechaInicio(LocalDate.parse("2017-03-08"));
    String[] lenguajes = {"Java","JavaScript","Python"};
    progrqamador.setLenguajes(lenguajes);

    Persona p = new Persona(1900, "Arenal", "Alberto");
    Empleado e = new Empleado(1900, "Cosmonauta", "Juanito Ollarzabal" , LocalDate.now(), 20000L);
    Cliente c = new Cliente(2009,"Capitan Haya", "Alberto Nuñez", true, "2003");
    Manager m = new Manager(1976, "Almansa", "Fernando Martin", LocalDate.now(), 20000L, true);

        System.out.println(p);
        System.out.println(e);
        System.out.println(c);
        System.out.println(m);

        progrqamador.anadirLenguaje("Ruby");
        System.out.println(Arrays.toString(progrqamador.getLenguajes()));
        progrqamador.anadirLenguaje("C Sharp", 2_5);
        System.out.println(Arrays.toString(progrqamador.getLenguajes()));

        Persona pc = new Cliente( 3000, "Avda America", "Lo tengo todo", true,"309870");
        Persona pe = new Empleado(1900, "Goya", "Damelo todo", LocalDate.now(), 50000L);

        System.out.println(
                "Nombre del cliente " + pc.getNombre()
                + "\n Vive en " + pc.getDireccion()
                + "\n su nombre es " + pc.getNombre()
        );
    }
}


