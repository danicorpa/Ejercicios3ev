package ejempleComparator;
/**
 * @author Daniel Martin Corpa
 * 13/4/23
 * 19:52
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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Socio s1 = new Socio(1, "Valentin", LocalDate.of(2001, 03,19));
        Socio s2 = new Socio( 2,"Victor", LocalDate.of(1984, 05,25) );
        Socio s3 = new Socio(3, "Claudia", LocalDate.of(1993,04,01));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(s1);
        socios.add(s2);
        socios.add(s3);

        System.out.println("Imrpime segun entrada en el ArrayList:");
        imprimrSocios(socios);
        ComparaFechaNacimiento comparaFechaNacimiento = new ComparaFechaNacimiento();
        socios.sort(comparaFechaNacimiento);
        System.out.println("Imprime colocado por Fecha de Nacimiento: ");
        imprimrSocios(socios);
        System.out.println("Imprime colocado por Fecha al reves: ");
        Comparator comparaFechaNacimientoDesc = comparaFechaNacimiento.reversed();
        socios.sort(comparaFechaNacimientoDesc);
        imprimrSocios(socios);
        System.out.println("Imprime colocado por Nombre: ");

        System.out.println("Compara por id de socio: ");
        ComparaIdSocio comparaSocio = new ComparaIdSocio();
        socios.sort(comparaSocio);
        imprimrSocios(socios);

        System.out.println("Compara por Nombre: ");
        ComparaNombre comparaSocioNombre = new ComparaNombre();
        socios.sort(comparaSocioNombre);
        imprimrSocios(socios);

        System.out.println("Compara por Nombre al reves: ");
        socios.sort(comparaSocioNombre.reversed());
        imprimrSocios(socios);

    }


    static void imprimrSocios(ArrayList<Socio> socios){
        for (Socio elemento: socios){
            System.out.println(elemento);
        }

    }
}
