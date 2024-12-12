/*
 Ejercicio Nº 3: Libros
-Crear una clase llamada Libro, que tenga los siguientes atributos: codigo ISBN, 
título, autor, género, número de páginas.
-Construye un objeto de tipo Libro con datos ingresados por teclado por el usuario.
-Muestra por pantalla todos los datos del libro (puedes usar getters o toString)
-Modifica el numero de páginas del libro (usar el método set)
-Mostrar por pantalla los datos modificados del libro
Punto Extra OPCIONAL: Adaptar el código para que permita agregar hasta 5 libros 
y que CADA LIBRO se asigne a la posición de un vector. */
package logica;

public class Libro {
    String ISBN;
    String titulo;
    String autor;
    String genero;
    int num_paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, String genero, int num_paginas) {
        
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.num_paginas = num_paginas;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + " ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", num_paginas=" + num_paginas + '}';
    }
    
    
    
    
    
    
    
}
