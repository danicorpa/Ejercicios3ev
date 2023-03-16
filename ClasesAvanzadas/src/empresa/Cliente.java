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

    public Cliente(int añoNacimiento, String direccion, String nombre, boolean gold, String idContrato) {
        super(añoNacimiento, direccion, nombre);
        this.gold = gold;
        this.idContrato = idContrato;
    }

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

    @Override
    public String toString() {
        String cadena = "Detos del Empleado: " + "\nNombre: " + getNombre() + "\nDriección: " + getDireccion()
                + "\nAño de Nacimiento:  " + getAñoNacimiento();
        return cadena;
        }
    }

