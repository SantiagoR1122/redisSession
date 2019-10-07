package mx.gob.ssedomex.redisSession.servicios;

import java.util.List;

import mx.gob.ssedomex.redisSession.modelos.Rol;


public interface RolService {

	public List<Rol> verRoles();
	public Rol saveRoles(Rol rol);
	public Rol updateRoles(Rol rol);
	public Rol buscaRol(Integer id);
}
