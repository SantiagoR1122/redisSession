package mx.gob.ssedomex.redisSession.implementacionServicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.ssedomex.redisSession.modelos.Usuario;
import mx.gob.ssedomex.redisSession.repositorios.UsuarioRepositorio;
import mx.gob.ssedomex.redisSession.servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuario> verUsuarios() {
		return usuarioRepositorio.findAll();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public Usuario ActualizaUsuario(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public Usuario buscaUsuario(Integer id) {
		return usuarioRepositorio.findByIdUsuario(id);
	}

	@Override
	public Usuario sessionUsuario(String parametroUsu, String parametroPassword) {
		return usuarioRepositorio.findByUsuarioPasssword(parametroUsu, parametroPassword);
	}

}
