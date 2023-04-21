package ejempleComparator;
/**
 * @author Daniel Martin Corpa
 * 21/4/23
 * 17:49
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


public class ComparaIdSocio implements Comparator {

    @Override
    public int compare(Object o1, Object o2){
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
      /*  if(socio1.idSocio < socio2.idSocio){
            return -1;
        } else if(socio1.idSocio > socio2.idSocio){
            return 1;
        } else {
            return 0;
        }*/

        return socio1.idSocio - socio2.idSocio;
    }
}
