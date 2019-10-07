package mx.gob.ssedomex.redisSession.implementacionServicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.gob.ssedomex.redisSession.modelos.Rol;
import mx.gob.ssedomex.redisSession.repositorios.RolRepositorio;
import mx.gob.ssedomex.redisSession.servicios.RolService;

@Service
public class RolServiceImpl implements RolService{
	@Autowired
	private RolRepositorio rolRepositorio;
	
	@Override
	public List<Rol> verRoles() {
		return rolRepositorio.findAll();
	}

	@Override
	public Rol saveRoles(Rol rol) {
		return rolRepositorio.save(rol);		
	}
	
	@Override
	public Rol updateRoles(Rol rol) {
		return rolRepositorio.save(rol);		
	}
	
	@Override
	public Rol buscaRol(Integer id) {
		return rolRepositorio.findByIdRol(id);
	}
}
