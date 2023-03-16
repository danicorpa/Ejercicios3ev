package sobrecarga;
/**
 * @author Daniel Martin Corpa
 * 15/3/23
 * 18:46
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


public class SubClase extends SuperClase{

    public void metodo(){
        System.out.println("Subclase: el metodo se sobreescribe");
    }

    public void metodo(String s){
        System.out.println(s + " el metodo se sobrecarga.");

    }
}
