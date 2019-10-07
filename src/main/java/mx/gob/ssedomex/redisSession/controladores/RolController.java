package mx.gob.ssedomex.redisSession.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.ssedomex.redisSession.modelos.Rol;
import mx.gob.ssedomex.redisSession.servicios.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	RolService rolService;
	Rol rol;
	List<Rol> roles;

	@GetMapping("")
	public List<Rol> obtenRol(){
		return rolService.verRoles();
    }
	
	@GetMapping("/Id")
	public Rol obtenRolId(Integer id){
		return rolService.buscaRol(id);
    }
	
	@PostMapping("")
    public Rol createRol(Rol rolParametro) {	
		rol = new Rol();
		rol = rolParametro;
		return rolService.saveRoles(rol);
    }
	
	@PutMapping("")
    public Rol updateEmisor(Rol parametroRol) {
		rol = new Rol();
		rol = rolService.buscaRol(parametroRol.getId());
		rol.setRol1(parametroRol.getRol1());
		rol.setDescripcion(parametroRol.getDescripcion());
		
        return rolService.saveRoles(rol);
    }	

}
