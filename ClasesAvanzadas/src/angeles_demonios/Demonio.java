package angeles_demonios;
/**
 * @author Daniel Martin Corpa
 * 29/3/23
 * 16:55
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


public class Demonio extends Incorporeo{

    private int bondad;
    private int maldad;

    public Demonio(int bondad, int maldad) {
        //this.bondad = bondad;
        this.maldad = maldad;
    }
    public void mostrar(){
        System.out.println("Maldad: " + getMaldad());
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }
}
