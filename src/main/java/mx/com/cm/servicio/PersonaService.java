
package mx.com.cm.servicio;

import java.util.List;
import mx.com.cm.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listaPersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);
    
}
