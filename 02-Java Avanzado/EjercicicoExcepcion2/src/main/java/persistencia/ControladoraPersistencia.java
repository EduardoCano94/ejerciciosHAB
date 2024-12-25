package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
ProductoJpaController productoJpa = new ProductoJpaController();
    
    public void agregarProducto(Producto producto) {
        productoJpa.create(producto);
    }
    
    public void borrarProducto(int id) {
        try {
            productoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Producto> obtenerProductos() {
        return productoJpa.findProductoEntities();
    }
    
    public Producto obtenerProducto(int id) {
        return productoJpa.findProducto(id);
    }

}
