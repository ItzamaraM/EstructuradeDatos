package estructuradedatos.diagnostica;

import java.util.ArrayList;


public class ListaPalabras {
    ArrayList<Palabra>ele;

    public ListaPalabras(){
         this.ele=new ArrayList();
    }
    
    public void agregarPalabra(Palabra x){
        ele.add(x);
    }
    
    public Palabra buscar(String id){
        for (int i = 0; i < ele.size(); i++) {
            if(ele.get(i).id.equals(id))
                return ele.get(i);
            return new Palabra("Lo siento,"+id+"no está en mi lista");
            
        }
    
    }
    
}
