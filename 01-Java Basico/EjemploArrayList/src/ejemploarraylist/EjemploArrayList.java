package ejemploarraylist;

import java.util.ArrayList;
import logica.Fruta;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<Fruta> listafrutas = new ArrayList<Fruta>();
        
        Fruta fruta = new Fruta("manzana", "rojo", "todo el año");
        listafrutas.add(fruta);
        
        listafrutas.add(new Fruta("naranja", "anaranjado", "todo el año"));
        listafrutas.add(new Fruta("banana", "amarilla", "todo el año"));
        listafrutas.add(new Fruta("sandia", "verde", "verano"));
        
        //traer elemento de un indice en particular
        Fruta frut = listafrutas.get(3);
        
        //eliminar un elemento
        listafrutas.remove(4);
        
        //obtener tamaño
        int tamanio = listafrutas.size();
        
        //recorrido mediante indices
        for (int i=0; i<listafrutas.size(); i++){
            System.out.println("Fruta: " + listafrutas.get(i).getNombre());
        }
        
        //recorrer con for each
        for (Fruta fru:listafrutas){
            System.out.println("Frutas: " + fru.getNombre());
        }

    }
    
}
