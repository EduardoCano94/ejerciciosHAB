/*
Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo,
titulo, consola, cantidadJugadores, categoría (tener en cuenta todos sus atributos,
constructores, métodos getters y setters).
- Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos
y guardarlos en el vector.
- Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores 
de los videojuegos almacenados.
- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos
de todos los videojuegos luego del cambio.
- Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola 
“Nintendo 64”. En caso que no encuentre ninguno, informarlo también por pantalla. */
package ejerciciovideojuegos;

import java.util.Scanner;
import logica.VideoJuego;

public class EjercicioVideoJuegos {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      VideoJuego[] videojuego = new VideoJuego[5];
      

      for(int i =0; i<videojuego.length; i++){
       System.out.println("Ingrese los datos del videojuego " + (i + 1) + ":");
       System.out.println("Ingrese el codigo del juego ");
       String codigo = scanner.nextLine();
     
       System.out.println("Ingrese el titulo del juego ");
       String titulo = scanner.nextLine();
       
       System.out.println("Ingrese la consola: ");
       String consola = scanner.nextLine();    
       
       System.out.println("Ingrese la categoria del videojuego: ");
       String categoria = scanner.nextLine();
       
       System.out.println("Ingrese el numero de jugadores del videojuego ");
       scanner = new Scanner(System.in);
       int cantidadJugadores = scanner.nextInt();
       
       videojuego[i] = new VideoJuego(codigo, titulo, consola, cantidadJugadores, categoria);
       
       System.out.println("Ingrese el nuevo nombre del videojuego: ");
       String nuevoNombre = scanner.nextLine();
       videojuego[0].setTitulo(nuevoNombre);
      }
       System.out.println("Ingrese el nuevo numero de jugaodres: ");
       int nuevaCantidadJugadores = scanner.nextInt();
       videojuego[0].setCantidadJugadores(nuevaCantidadJugadores);
       
       System.out.println("Ingrese le nuevo nombre del videojuego: ");
       String nuevoNombre1 = scanner.nextLine();
       
       videojuego[1].setTitulo(nuevoNombre1);
       System.out.println("Ingrese le nuevo numero de juagodres: ");
       
       int nuevaCantidadJugadores1 = scanner.nextInt();
       videojuego[1].setCantidadJugadores(nuevaCantidadJugadores1);
       
        System.out.println("\nDatos del video juego:");
       for(int i=0; i<5; i++){
            System.out.println("VideoJuego: " + (i + 1) + ":");
            System.out.println(videojuego[i]);
            System.out.println();
         
        System.out.println("==Datos del videojuego actualizados ");
        System.out.println(videojuego);
       }
       
       
      
      
      
      
      
      
      
      
    }
    
}
