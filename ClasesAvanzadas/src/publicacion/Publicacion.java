package publicacion;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 21:01
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


public class Publicacion {

   private String texto;
   private String encabezado;
   private LocalDate fechaPublicacion;
    public Publicacion(String texto, String encabezado, LocalDate fechaPublicacion){
       this.texto = texto;
       this.encabezado = encabezado;
       this.fechaPublicacion = fechaPublicacion;
    }

   public String getTexto() {
      return texto;
   }

   public void setTexto(String texto) {
      this.texto = texto;
   }

   public String getEncabezado() {
      return encabezado;
   }

   public void setEncabezado(String encabezado) {
      this.encabezado = encabezado;
   }

   public LocalDate getFechaPublicacion() {
      return fechaPublicacion;
   }

   public void setFechaPublicacion(LocalDate fechaPublicacion) {
      this.fechaPublicacion = fechaPublicacion;
   }
}
