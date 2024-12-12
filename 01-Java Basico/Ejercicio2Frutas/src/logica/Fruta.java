/*Crear una clase llamada Fruta, que tenga los siguientes atributos:
nombre, color, calorías, tipoCascara, esComestible (tener en cuenta todos sus atributos,
constructores, métodos getters y setters).
- Pedirle al usuario por teclado que ingrese los datos de la fruta que quiera guardar.
- Mostrar por pantalla los datos de la fruta creada
- Cambiar un dato de la fruta
- Volver mostrar la fruta con los datos cambiados*/
package logica;

public class Fruta {
    String nombre;
    String color;
    double calorias;
    String tipoCascara;
    boolean esComeestible;

    public Fruta() {
    }

    public Fruta(String nombre, String color, double calorias, String tipoCascara, boolean esComeestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.esComeestible = esComeestible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isEsComeestible() {
        return esComeestible;
    }

    public void setEsComeestible(boolean esComeestible) {
        this.esComeestible = esComeestible;
    }

    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", color=" + color + ", calorias=" + calorias + ", tipoCascara=" + tipoCascara + ", esComeestible=" + esComeestible + '}';
    }
    
    
    
    
    
    
}
