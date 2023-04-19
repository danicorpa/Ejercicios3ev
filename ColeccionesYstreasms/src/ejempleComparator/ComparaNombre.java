package ejempleComparator;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 20:15
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.Comparator;

/**
 * @param
 * @see ""
 *
 */


public class ComparaNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2){

        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;

        socio1.nombre.compareToIgnoreCase(socio2.nombre);
            return 1;

    }
}
