package ejercicio3libros;

import java.util.Scanner;
import logica.Libro;

public class Ejercicio3Libros {

    public static void main(String[] args) {
        System.out.println("===Bienvenido al sistema");
       
        Scanner scanner = new Scanner (System.in);
        Libro libro[] = new Libro[5];
             
       for(int i =0; i<libro.length; i++){
       System.out.println("Ingrese los datos del libro " + (i + 1) + ":");
       System.out.print("Ingrese el ISBN del libro ");
       String isbn = scanner.nextLine();
     
       System.out.println("Ingrese el titulo del libro ");
       String titulo = scanner.nextLine();
       
       System.out.println("Ingrese el autor del libro ");
       String autor = scanner.nextLine();    
       
       System.out.println("Ingrese el genero del libro ");
       String genero = scanner.nextLine();
       
       System.out.println("Ingrese el numero de paginas del libro ");
       scanner = new Scanner(System.in);
       int num_paginas = scanner.nextInt();
       
       libro[i] = new Libro(isbn, titulo, autor, genero, num_paginas);

       }
        System.out.println("\nDatos del libro:");
       for(int i=0; i<5; i++){
            System.out.println("Libro " + (i + 1) + ":");
            System.out.println(libro[i]);
            System.out.println();
       }
       
       
        
        
        /*System.out.println("Ingrese el nuevo numero de paginas: ");
        int nuevaPagina = scanner.nextInt();
        lib.setNum_paginas(nuevaPagina);
        System.out.println("==Datos del libro actualizados ");
        System.out.println(lib);*/
       
    }
    
}
