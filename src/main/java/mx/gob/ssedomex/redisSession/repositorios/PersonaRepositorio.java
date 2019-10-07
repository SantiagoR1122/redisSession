package mx.gob.ssedomex.redisSession.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import mx.gob.ssedomex.redisSession.modelos.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer>{
	@Query("SELECT p FROM Persona p WHERE p.id = :id")
	Persona findByIdPersona(Integer id);

}
