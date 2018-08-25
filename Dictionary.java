//estructuras de datos no se ven.
//por ser arreglos 
package estructuradedatos;

import java.util.ArrayList;
import java.util.Scanner;

public class EstructuraDeDatos {
    public static void main(String[] args) {
    ArrayList listaPendientes = new ArrayList();
    String linea;
    try{
    Scanner lector = new Scanner(new FileInputStream("Datos.txt"));
    //En datos debe ir los datos que quieres sustraer
    
    while(lector.hasNext()){
        linea = lector.nextLine();
        listaPendientes.add(linea);
    }
        for (int i = 0; i < listaPendientes.size(); i++) {
            System.out.println(listaPendientes.get(i));
        }catch(Exception e){}
    }
    
            System.out.println(listaPendientes.size());

}
}
