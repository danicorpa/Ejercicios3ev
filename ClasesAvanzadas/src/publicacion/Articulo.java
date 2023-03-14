package publicacion;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 21:09
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


public class Articulo extends Publicacion{

    private String autor;

    public Articulo(String texto, String encabezado, LocalDate fechaPublicacion, String autor) {
        super(texto, encabezado, fechaPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
