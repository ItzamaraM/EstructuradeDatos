package estructuradedatos.diagnostica;

import java.util.ArrayList;

public class Palabra {
    String id;
    ArrayList<String> significados;
    
    //palabra=constructor
    public Palabra(String i){
        id = i;
        significados=new ArrayList();
    }
    //agregar=set
    public void agregar(String significado){
        significados.add(significado);
    }
    //String = get
    public ArrayList<String> getListaSignificados(){
        return significados;
    }
}
