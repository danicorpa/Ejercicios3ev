package angeles_demonios;
/**
 * @author Daniel Martin Corpa
 * 29/3/23
 * 16:58
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.Random;

/**
 * @param
 * @see ""
 *
 */


public class Angel extends Incorporeo{

    protected int bondad;
    // int maldad;

    public Angel() {
        Random random = new Random();

        this.bondad = random.nextInt(101);
        //this.maldad = maldad;
    }
    public void mostrar(){
        System.out.println("Bondad: " + getBondad());
    }
    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }
}
