package Streams;
/**
 * @author Daniel Martin Corpa
 * 20/4/23
 * 19:08
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

public class Transaccion {
    private int idTransaccion;
    private double precio;
    private String nombre;
    private String ciudad;
    private LocalDate fecha;

    public Transaccion(int idTransaccion, double precio, String nombre, String ciudad, LocalDate fecha) {
        this.idTransaccion = idTransaccion;
        this.precio = precio;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion=" + idTransaccion +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
