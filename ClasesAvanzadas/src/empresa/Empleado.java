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
    private Long salario;

    public Empleado(){}

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
}
