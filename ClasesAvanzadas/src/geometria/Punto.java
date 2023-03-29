package geometria;
/**
 * @author Daniel Martin Corpa
 * 28/3/23
 * 16:39
 * @version v 1.0
 *
 * Recibe dos puntos x e y
 *
 * */
public class Punto {


   double x;
   double y;

    /**
     * Constructor parameterizado:
     * Recibe dos puntos
     * @param x, primer punto
     * @param y, segundo punto
     *
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que imprime los puntos dados
     *
     * */
    @Override
    public String toString() {
        return "x=" + x + ","+ "y=" + y ;
    }
}
