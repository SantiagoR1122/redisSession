package mx.gob.ssedomex.redisSession.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.gob.ssedomex.redisSession.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	@Query("SELECT u FROM Usuario u WHERE u.id = :id")
	Usuario findByIdUsuario(Integer id);
	
	@Query("SELECT u FROM Usuario u WHERE u.usu = :parametroUsu and u.password = :parametroPassword")
	Usuario findByUsuarioPasssword(String parametroUsu,String parametroPassword);

}
