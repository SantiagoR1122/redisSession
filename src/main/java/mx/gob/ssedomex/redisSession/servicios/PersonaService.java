package mx.gob.ssedomex.redisSession.servicios;

import java.util.List;
import mx.gob.ssedomex.redisSession.modelos.Persona;

public interface PersonaService {
	public List<Persona> verPersonas();
	public Persona savePersona(Persona persona);
	public Persona ActualizaPersona(Persona persona);
	public Persona buscaPersona(Integer id);

}
