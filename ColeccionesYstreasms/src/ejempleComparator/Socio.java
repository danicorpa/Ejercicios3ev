package ejempleComparator;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 19:24
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

import java.time.LocalDate;

public class Socio {


    int idSocio;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int idSocio, String nombre, LocalDate fechaNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Socio nº: " +
                "idSocio=" + idSocio +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
