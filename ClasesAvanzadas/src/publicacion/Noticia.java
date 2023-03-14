package publicacion;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 21:06
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


public class Noticia extends Publicacion{

    private String fuente;

    public Noticia(String texto, String encabezado, LocalDate fechaPublicacion, String fuente) {
        super(texto, encabezado, fechaPublicacion);
        this.fuente = fuente;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
