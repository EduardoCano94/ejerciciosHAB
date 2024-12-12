/*
Ejercicio Nº 1:
Crear una clase que represente a un animal con los atributos nombre, especie y color
Crear un objeto vacio y un objeto con atributos de ese animal */
package ejercicioclases1diatres.logica;

/**
 *
 * @author edu_c
 */
public class Animal {
    int id_animal;
    String nombre;
    String especie;
    int edad;
    String color;

    public Animal() {
    }

    public Animal(int id_animal, String nombre, String especie, int edad, String color) {
        this.id_animal = id_animal;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }
    
}
