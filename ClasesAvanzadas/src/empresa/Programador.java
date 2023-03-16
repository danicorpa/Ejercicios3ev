package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:16
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


public class Programador extends Empleado {

    private String[] lenguajes;

    public Programador(int añoNacimiento, String direccion, String nombre, LocalDate fechaInicio, long salario, String[] lenguajes) {
        super(añoNacimiento, direccion, nombre, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        String cadena = "Detos del Empleado: " + "\nNombre: " + getNombre() + "\nDriección: " + getDireccion()
                + "\nFecha de Inicio: " + getFechaInicio() + "\nAño de Nacimiento:  " + getAñoNacimiento()
                + "\nTiene un salario de: " + getSalario() + "Estos son los lenguajes que conoce actualmente el programador: " + Arrays.toString(this.lenguajes);
        return cadena;
    }

    public void anadirLenguaje(String lenguaje) {

        String[] arrayNuevo = new String[lenguajes.length + 1];
        for (int i = 0; i < lenguajes.length; i++) {
            arrayNuevo[i] = lenguajes[i];
        }
        arrayNuevo[arrayNuevo.length - 1] = lenguaje;
        lenguajes = arrayNuevo.clone();
    }

    public void anadirLenguaje(String lenguaje, int anyosExperiencia) {

        if (anyosExperiencia > 2) {
            anadirLenguaje(lenguaje);
        } else {
            System.out.println("No tienes suficiente experiencia.");
        }
    }
}
