package logica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Cambiado de Id a id
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad) {  // Cambiado de Id a id
        this.id = id;  // Cambiado de Id a id
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;  // Cambiado de Id a id
    }

    public void setId(int id) {  // Cambiado de Id a id
        this.id = id;  // Cambiado de Id a id
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}