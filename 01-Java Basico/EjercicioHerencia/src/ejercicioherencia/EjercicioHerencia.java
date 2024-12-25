
package ejercicioherencia;

import logica.Automovil;
import logica.Motocicleta;
import logica.Vehiculo;

public class EjercicioHerencia {

    public static void main(String[] args) {
         Automovil miAuto = new Automovil("Toyota", "Corolla", 2023, 4);
        
        Motocicleta miMoto = new Motocicleta("Honda", "CBR", 2022, 600.5);
        
        System.out.println("Información del Auto:");
        System.out.println(miAuto);
        System.out.println("\nInformación de la Moto:");
        System.out.println(miMoto);
        
        System.out.println("\nAcelerando los vehículos:");
        miAuto.acelerar();  
        miMoto.acelerar();  
        
        System.out.println("\n");
        Vehiculo vehiculo1 = miAuto;
        Vehiculo vehiculo2 = miMoto;
        
        vehiculo1.acelerar();  
        vehiculo2.acelerar();  
        
    }
    
}
