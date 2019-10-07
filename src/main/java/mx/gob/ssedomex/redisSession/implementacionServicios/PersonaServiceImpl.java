package mx.gob.ssedomex.redisSession.implementacionServicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.ssedomex.redisSession.modelos.Persona;
import mx.gob.ssedomex.redisSession.repositorios.PersonaRepositorio;
import mx.gob.ssedomex.redisSession.servicios.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	@Autowired
	private PersonaRepositorio personaRepositorio;

	@Override
	public List<Persona> verPersonas() {
		return personaRepositorio.findAll();
	}

	@Override
	public Persona savePersona(Persona persona) {
		return personaRepositorio.save(persona);
	}

	@Override
	public Persona ActualizaPersona(Persona persona) {
		return personaRepositorio.save(persona);
	}

	@Override
	public Persona buscaPersona(Integer id) {
		return personaRepositorio.findByIdPersona(id);
	}

}
