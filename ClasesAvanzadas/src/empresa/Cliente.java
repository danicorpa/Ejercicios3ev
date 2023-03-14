package empresa;
/**
 * @author Daniel Martin Corpa
 * 14/3/23
 * 20:14
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


public class Cliente extends Persona{

    private boolean gold;
    private String idContrato;
    public Cliente(){}

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }
}
