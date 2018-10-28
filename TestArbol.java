package Árboles;

public class TestArbol {

    public static void main(String[] args) {
        Arbol   test= new Arbol();
        test.agregar(9);
        test.agregar(3);
        test.agregar(12);
        test.agregar(1);
        test.agregar(5);
        test.agregar(10);
//        test.inorder(test.raiz);
//        System.out.println();
//        test.preorder(test.raiz);
//        System.out.println();
//        test.posorder(test.raiz);
//        System.out.println();
        System.out.println(test.tieneDosSubarboles(test.buscar(9))); //o test.esHoja en lugar de test.tieneDosSubarboles
    }
    
}
