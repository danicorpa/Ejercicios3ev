package angeles_demonios;
/**
 * @author Daniel Martin Corpa
 * 29/3/23
 * 17:00
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

import java.util.ArrayList;

/**
 * @param
 * @see ""
 *
 */


public class Humano extends Ser implements Espiritual{

    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Angel> angeles;

    public Humano(double fe) {
        this.fe = fe;
    }

    public void rezar(){}
    public void pecar(){}
    public void mostrar(){}
    public void añadirDemonio(){
        demonios.add(new Demonio(0,5));
    }
    public void añadirAngel(){
        angeles.add(new Angel());

    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }
}
