package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:13
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.time.LocalDate;

/**
 * @param
 * @see ""
 *
 */


public class Empleado extends Persona{

    private LocalDate fechaInicio;
    private long salario;

    public Empleado(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, long salario) {
        super(añoNacimiento, direccion, nombre);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena="Detos del Empleado: " + "\nNombre: " + getNombre()
                + "\nDriección: " + getDireccion()
                + "\nFecha de Inicio: " + getFechaInicio()
                + "\nAño de Nacimiento:  " + getAñoNacimiento()
                + "\nTiene un salario de: " +getSalario();
        return cadena;
    }
}
