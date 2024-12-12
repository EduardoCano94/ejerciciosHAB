/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1clasediatres;

import java.time.LocalDate;
import java.time.Month;
import logica.Persona;

/**
 *
 * @author edu_c
 */
public class Ejemplo1ClaseDiaTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona();
        Persona perso2 = new Persona(1, "eduardo","cano", 
        LocalDate.of(2024, 12, 11),"hola 123");
        
        
        System.out.println("El nombre es: " + perso2.getNombre() + "la direccion es: " 
                + perso2.getDireccion() + "la fecha de nacimiento es: " + perso2.getFecha_nac() );
    }
    
}
