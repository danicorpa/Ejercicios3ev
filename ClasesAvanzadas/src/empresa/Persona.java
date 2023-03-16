package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:06
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


public class Persona {

    private int añoNacimiento;
    private String direccion;
    private String nombre;

    public Persona(int añoNacimiento, String direccion, String nombre) {
        this.añoNacimiento = añoNacimiento;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String cadena = "Detos del Empleado: " + "\nNombre: " + getNombre() + "\nDriección: " + getDireccion()
                + "\nAño de Nacimiento:  " + getAñoNacimiento();
        return cadena;
    }
}
