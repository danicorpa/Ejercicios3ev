package HashMap;
/**
 * @author Daniel Martin Corpa
 * 17/4/23
 * 20:09
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.HashMap;

/**
 * @param
 * @see ""
 *
 */


public class Ejemplo01 {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1,"Juanito");
        mapa.put(2,"Ollarzabal");
        mapa.put(3,"Edurne");
        mapa.put(4,"Pasaban");

        System.out.println(mapa.get(4));
    }
}
