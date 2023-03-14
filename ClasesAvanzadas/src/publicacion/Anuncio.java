package publicacion;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 21:08
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


public class Anuncio extends Publicacion{

    private String fechaCaducidad;

    public Anuncio(String texto, String encabezado, LocalDate fechaPublicacion, String autor) {
        super(texto, encabezado, fechaPublicacion);
        this.fechaCaducidad = autor;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
