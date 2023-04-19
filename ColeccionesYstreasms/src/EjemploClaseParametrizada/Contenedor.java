package EjemploClaseParametrizada;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 18:57
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


public class Contenedor <T>{ // T = Cualquier tipo de dato

    private T objeto;

    public Contenedor() {
    }

    public void guardar(T objeto){
        this.objeto = objeto;
    }
    public T devolver(){
        return objeto;
    }
}

