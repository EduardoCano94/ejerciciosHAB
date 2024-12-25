
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    PersonaJpaController2 persoJpa = new PersonaJpaController2();
    
    public void crearPersona (Persona perso){
        persoJpa.create(perso);
        
    }
    
    public void borrarPersona(int id){
        try {
            persoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public Persona traerPersona(int id){
        return persoJpa.findPersona(id);
    }
    
    public List <Persona> traerPersonas(){
       return persoJpa.findPersonaEntities();
    }
    
    public void modificarPersona(Persona pers){
        try {
            persoJpa.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
