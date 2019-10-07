package mx.gob.ssedomex.redisSession.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.gob.ssedomex.redisSession.modelos.Persona;
import mx.gob.ssedomex.redisSession.servicios.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	Persona persona;
	
	@GetMapping("")
	public List<Persona> obtenPersona(){
        return personaService.verPersonas();
    }
	
	@GetMapping("Id")
	public Persona obtenPersonaId(Integer id){
		return personaService.buscaPersona(id);
    }
	
	@PostMapping("")
    public Persona createRol(Persona objetoPersona) {
		System.out.println("si asigna");
		System.out.println(":::::::::::::::::::-------------"+objetoPersona.getId());
		System.out.println(":::::::::::::::::::-------------"+objetoPersona.getNombres());
		System.out.println(":::::::::::::::::::-------------"+objetoPersona.getApellidos());
		
		
		persona = new Persona();
		persona = objetoPersona;
        return personaService.savePersona(persona);
    }
	
	@PutMapping("")
    public Persona updateEmisor(Integer id,String nombres1, String apellidos1) {
		persona = new Persona();
		persona = personaService.buscaPersona(id);
		persona.setNombres(nombres1);
		persona.setApellidos(apellidos1);
        return personaService.savePersona(persona);
    }

}
