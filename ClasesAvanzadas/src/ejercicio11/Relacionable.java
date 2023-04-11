package ejercicio11;
/**
 * @author Daniel Martin Corpa
 * 11/4/23
 * 18:25
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


public class Relacionable implements Relaciones{

    int a;
    @Override
    public boolean esMayor(int b) {
        if (a > b) {
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean esMenor(int b) {
        if(a<b){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esIgual(int b) {
        if(a==b){
            return true;
        } else {
        return false;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
