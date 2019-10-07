package mx.gob.ssedomex.redisSession.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.ssedomex.redisSession.modelos.Persona;
import mx.gob.ssedomex.redisSession.modelos.Rol;
import mx.gob.ssedomex.redisSession.modelos.Usuario;
import mx.gob.ssedomex.redisSession.servicios.PersonaService;
import mx.gob.ssedomex.redisSession.servicios.RolService;
import mx.gob.ssedomex.redisSession.servicios.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PersonaService personaService;
	
	@Autowired
	RolService rolService;
	
	Usuario usuario;
	Persona persona;
	Rol rol;
	
	@GetMapping("")
	public List<Usuario> obtenUsuario(){		
        return usuarioService.verUsuarios();
    }
	
	@GetMapping("session")
	public Usuario obtenUsuarioSession(String parametroUsu, String parametroPassword){		
        return usuarioService.sessionUsuario(parametroUsu, parametroPassword);
    }
	
	@GetMapping("/obtenUsuarioId")
	public Usuario obtenUsuarioId(Integer id){
		return usuarioService.buscaUsuario(id);
    }
	
	@PostMapping("")
	public Usuario creaUsuario(Usuario objetoUsuario) {
		System.out.println("si asigna------------------------entra");
		usuario = new Usuario();
		usuario = objetoUsuario;
		return usuarioService.saveUsuario(usuario);
		
	}
	
	@PutMapping("")
	public Usuario actualizaUsuario(Integer id,String usu,String password,Integer idPesona,Integer idRol) {
		usuario = new Usuario();
		usuario = usuarioService.buscaUsuario(id);
		usuario.setUsu(usu);
		usuario.setPassword(password);
		usuario.setIdPesona(personaService.buscaPersona(idPesona));
		usuario.setIdRol(rolService.buscaRol(idRol));
		return usuarioService.saveUsuario(usuario);
		
	}
}
