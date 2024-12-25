/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojpa;

import java.util.ArrayList;
import java.util.List;
import logica.Persona;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author edu_c
 */
public class EjemploJPA {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        // creo 3 personas en bd
        controlPersis.crearPersona(new Persona(1,"Luisina", 33));
        controlPersis.crearPersona(new Persona(2,"Lalo", 30));
        controlPersis.crearPersona(new Persona(3,"Joel", 32));
        //obtengo todas las personas
        List<Persona> listaPersonas = controlPersis.traerPersonas();
        for(Persona per: listaPersonas ){
            System.out.println("Persona: " + per.getNombre());
        }
        
        //borrar persona
        controlPersis.borrarPersona(2);
        
        controlPersis.modificarPersona(new Persona(3, "ale", 45));
 
    }
}
