package com.mycompany.ejerciciorestaurante;

import java.util.List;
import logica.Platillo;
import persistencia.ControladoraPersistencia;

public class EjercicioRestaurante {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        
        controlPersis.crearPlatillo(new Platillo(1,"sopa", "receta", 7.00));
        controlPersis.crearPlatillo(new Platillo(2,"tacos", "receta2", 20.00));
        controlPersis.crearPlatillo(new Platillo(3,"milanesa", "receta3", 17.00));
        
        List<Platillo>listaPlatillos = controlPersis.traerPlatillos();
        for (Platillo plat: listaPlatillos){
            System.out.println(plat.toString());
        }
        controlPersis.borrarPlatillo(2);
        
        controlPersis.modificarPlatillo(new Platillo(3,"milanesa", "receta3", 10.00));
        
        System.out.println("--------------");
        listaPlatillos = controlPersis.traerPlatillos();
        
      
        
    }
}
