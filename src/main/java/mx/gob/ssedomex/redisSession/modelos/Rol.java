package mx.gob.ssedomex.redisSession.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Rol {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_id_roles" )
	@SequenceGenerator(name="sec_id_roles", sequenceName = "sec_id_roles", allocationSize=1)
	@Column(name="ID", updatable = false)
	private Integer id;
	@Column(name="ROL", updatable = false)
	private String rol1;
	@Column(name="DESCRIPCION", updatable = false)
	private String descripcion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getRol1() {
		return rol1;
	}
	public void setRol1(String rol1) {
		this.rol1 = rol1;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
