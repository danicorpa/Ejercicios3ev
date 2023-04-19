package HashMap;
/**
 * @author Daniel Martin Corpa
 * 17/4/23
 * 20:12
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import javax.print.attribute.HashAttributeSet;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @param
 * @see ""
 *
 */


public class Ejemplo02 {

    public static void main(String[] args) {
        //recorrer un hasmap
        HashMap<Integer,String> map = generaMapa();
        // 1 recorriendo el conjunto de claves: keyset();
        System.out.println("\n Con keyset() \n" );
        for (Integer clave:map.keySet()){
            System.out.println("Clave:  "+clave+
                    "\n"+
                    "Valor: " + map.get(clave));

        }
        // 2 Con un iterador sobre el conjunto de claves (keyset())
        System.out.println("\n Con Iterator \n");
        Iterator<Integer> integerIterator = map.keySet().iterator();

        while(integerIterator.hasNext()){

            Integer clave = integerIterator.next();

            System.out.println("Clave: " + clave +
                    "\n"+
                    "Valor: "+ map.get(clave));
        }
        // 3 Con la entrada completa: Map.entry
        System.out.println("\n Con for: \n");
        for(Map.Entry entrada : map.entrySet()){
            System.out.println("Clave: "+entrada.getKey()+
                    "\n"+
                    "Valor: "+entrada.getValue());

        }

        // 4 Con Map.Entry, entrySet() e Integer sobre el conjunto de entradas
        System.out.println("\n Con Map.Entry: \n");
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet() .iterator();
        while(entryIterator.hasNext()){

            Map.Entry entrada = entryIterator.next();
            System.out.println("Clave; " +entrada.getKey()+
                                "\n" +
                                "Valor: " + entrada.getValue());
        }
        //5 Si quiero recorrer solo las claves:
        System.out.println("\n Solo con las claves \n");
        System.out.println("Claves: " + map.keySet());

        // 6 Solo los valores
        System.out.println("\n Solo los valores \n");
        System.out.println("Valores: " + map.values());
    }

    public static HashMap<Integer,String> generaMapa(){

        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Juanito");
        mapa.put(2,"Ollarzabal");
        mapa.put(3,"Edurne");
        mapa.put(4,"Pasaban");


        return mapa;

    }
}
