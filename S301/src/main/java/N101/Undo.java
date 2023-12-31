package N101;

import java.util.List;
import java.util.ArrayList;


public class Undo {
    private static Undo instancia;    // declarem la variable "instancia"
    public List comandes;
    private Undo(){
        comandes = new ArrayList<String>();
    }                  // privatitzem el constructor, per evitar que s'instancii mitjançant "new"

    public static Undo getInstancia() {
        if(instancia==null){
            instancia = new Undo();    // ara sí, instanciem des d'aquí, SI NO HI HA INSTANCIA PREVIA
        }
        return instancia;              // retornem la instancia, la previa o la que acabem de crear
    }

    public void undo(){
        if(!comandes.isEmpty()) {
            comandes.remove(comandes.size()- 1);
        }
    }
}
