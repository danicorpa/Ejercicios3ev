package Streams;
/**
 * @author Daniel Martin Corpa
 * 20/4/23
 * 19:11
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import javax.lang.model.type.ArrayType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @param
 * @see ""
 *
 */


public class Main {

    public static void main(String[] args) {
        Transaccion t1 = new Transaccion(1, 1000.5, "A.Alvarez", "Madrid", LocalDate.now());
        Transaccion t2 = new Transaccion(2, 20000.4, "J.J.Benitez", "Sebastopol", LocalDate.now());
        Transaccion t3 = new Transaccion(3, 400101.5, "A. Ntolin", "LondonBeat", LocalDate.now());
        Transaccion t4 = new Transaccion(4, 3098603.4, "Tolin", "USAF", LocalDate.now());

        List<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(t1);
        transacciones.add(t2);
        transacciones.add(t3);
        transacciones.add(t4);

        double totalLondres = transacciones.stream()
                .filter((transaccion) -> transaccion.getCiudad().equals("Madrid"))
                .mapToDouble(transaccion -> transaccion.getPrecio()).sum();
        System.out.println(totalLondres);

        System.out.println("Stream a partir de un array");
        String[] frutas = {"mora", "naranja", "pera", "melon", "fresa", "estafilococo", "mosca", "jamonjabugo"};
        //Stream<String> frutasStream =
        Arrays.stream(frutas).
                filter((fruta) -> fruta.length() > 5) // filtra frutas con nombre con mas de cinco letras
                .forEach(fruta -> System.out.println(fruta));
        Arrays.stream(frutas)
                .forEach(fruta -> System.out.println("* " + fruta));
        AtomicInteger cont = new AtomicInteger();
        Arrays.stream(frutas)
                // .map(fruta -> cont.getAndIncrement() + " " +fruta);
                .forEach(fruta -> System.out.println(cont.getAndIncrement() + " " + fruta));
        long numeroDeFrutas = Stream.of(frutas).count();
        System.out.println("Numero de frutas: " + numeroDeFrutas);

        // filtrar
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 200 - 100));
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero tamaño: " + numeros.get(i) + " ");

        }
        //long multiplosDeTres = Stream.of(numeros).count();

        //for(int i=0; i < numeros.size();i++){
        //if(multiplosDeTres % 3 == 0){
        //      System.out.println("Numeros : "+multiplosDeTres);
        //  }
        numeros.stream().filter(n -> n % 3 == 0)
                .forEach(n -> System.out.println("multiplos de tres "+n + " "));
        long multiplosDe3=numeros.stream()
                .filter(n -> n % 3 == 0)
                .count();
        System.out.println("\nMultiplos de 3: "+multiplosDe3);

        }

    }
