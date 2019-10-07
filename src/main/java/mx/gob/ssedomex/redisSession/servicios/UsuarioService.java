package mx.gob.ssedomex.redisSession.servicios;

import java.util.List;
import mx.gob.ssedomex.redisSession.modelos.Usuario;

public interface UsuarioService {
	public List<Usuario> verUsuarios();
	public Usuario saveUsuario(Usuario usuario);
	public Usuario ActualizaUsuario(Usuario usuario);
	public Usuario sessionUsuario(String parametroUsu, String parametroPassword);
	public Usuario buscaUsuario(Integer id);
}
