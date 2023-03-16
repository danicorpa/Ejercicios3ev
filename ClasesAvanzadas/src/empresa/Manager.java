package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:17
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


public class Manager extends Empleado{


    private boolean sonrisa;

    public Manager(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, long salario, boolean sonrisa) {
        super(añoNacimiento, direccion, nombre, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {

        if (!sonrisa){
        return "Este Manager no suele sontreir!! Cuidado con hacer bromas!!!";
        } else {
            return "Este Manager es un vacilón, le mola mucho el cachondeo!!!";
            }
        }
}
