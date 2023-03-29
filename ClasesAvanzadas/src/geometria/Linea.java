package geometria;
/**
 * @author Daniel Martin Corpa
 * 28/3/23
 * 16:50
 * @version version of class
 */

public class Linea {

    final int DIMENSIONES =2;
    Punto a;
    Punto b;

    /**
     * Constructor parametrizado
     * @param a, es el punto origen de la línea
     * @param b, es el punto final la línea
     *
     * */
    public Linea(Punto a, Punto b) {
         this.a = a;
         this.b = b;
    }

    /**
     * Metodo calculaLongitud devuelve la longitud de le línea que unen los puntos de inicio y de final.
     * @return longitud, la distancia de la linea.
     * */
    public double calcularLongitud(){
        double x = (b.x-a.x);
        double y = (b.y-a.y);
        double sqrt = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return sqrt;
    }

    /**
     * Pinta una linea de longitud "longitud"
     * */
    public void dibujarLinea() {
        for (int i=0;i < calcularLongitud();i++){
            System.out.print("_");
        }
    }
    /**
     * Imprime los puntos x e y.
     *
     * */
    @Override
    public String toString() {
        return "Vector\n (x " + a.x +",y "+ b.x+")" +
                ", (x " + a.y +",y "+ b.y+") = " + calcularLongitud();
    }
}
