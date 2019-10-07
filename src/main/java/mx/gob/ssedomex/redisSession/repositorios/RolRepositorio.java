package mx.gob.ssedomex.redisSession.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.gob.ssedomex.redisSession.modelos.Rol;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Integer> {
	@Query("SELECT r FROM Rol r WHERE r.id = :id")
	Rol findByIdRol(Integer id);
	
}
