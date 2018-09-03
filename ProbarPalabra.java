package estructuradedatos.diagnostica;

public class ProbarPalabra {
    public static void main(String[]args){
        Pantalla d = new Pantalla();
        Palabra x;
        ListaPalabras l = new ListaPalabras();
        
        //Palabra[]x=new Palabra[2];
        
        x = new Palabra("Fabricio");//se agrega arreglo...
        //x[0]= new Palabra("Fabricio");
        
        x.agregar("S. nombre propio latino");
        x.agregar("marca registrada");
        
        x=new Palabra("Luisito");
        x.agregar("Escritor, director, presentador, camarógrafo");
        x.agregar("También productor");
        
        
        //System.out.println(x.getListaSignificados().size());
        l.agregarPalabra(x);
        String nombre = new java.util.Scanner(System.in).nextLine();
        Palabra b = l.buscar(nombre);
        System.out.println(b.id+","+b.significados);
        d.mostrar(b);
    }
    
}
