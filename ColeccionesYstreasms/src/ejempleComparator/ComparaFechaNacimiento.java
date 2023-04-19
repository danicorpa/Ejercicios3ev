package ejempleComparator;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 19:43
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


public class ComparaFechaNacimiento implements Comparator {

    @Override
    public int compare(Object o1, Object o2){

        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        // si slcio1 nace antes que socio2 = negativo
        // si socio1 nace despues que socio2 = positivo
        // si son iguales = 0
        if(socio1.fechaNacimiento.isBefore(socio2.fechaNacimiento)){

            return -1;
        } else if (socio1.fechaNacimiento.isAfter(socio2.fechaNacimiento)){

            return 1;
        } else { return 0; }

    }
}
