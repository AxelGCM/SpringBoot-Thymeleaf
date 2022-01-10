
package mx.com.cm.dao;

import mx.com.cm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
 