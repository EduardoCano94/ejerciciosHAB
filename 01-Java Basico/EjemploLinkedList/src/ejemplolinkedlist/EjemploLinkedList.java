
package ejemplolinkedlist;

import java.util.LinkedList;

public class EjemploLinkedList {

    public static void main(String[] args) {
        LinkedList<String> listaFrutas = new LinkedList<String>();
        
        listaFrutas.add("Naranja");
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Fresa");
        
        listaFrutas.add(0, "Melon");
    //para ver el tamaño de lista
        int tamanio= listaFrutas.size();
        System.out.println("El tamaño es: " + tamanio);
        //para recorrer mi linkedlist
        for (String fruta: listaFrutas){
            
            System.out.println("La fruta guardada es: " + fruta);
        }
        //borrar elementos
        listaFrutas.remove(0);
        
    }
    
}
