package mx.gob.ssedomex.redisSession.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_id_usuarios" )
	@SequenceGenerator(name="sec_id_usuarios", sequenceName = "sec_id_usuarios", allocationSize=1)
	@Column(name="ID", updatable = false)
	private Integer id;
	@Column(name="USU", updatable = false)
	private String usu;
	@Column(name="CONN", updatable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="ID_PERSONA")
	private Persona idPesona;
	
	@ManyToOne
	@JoinColumn(name="ID_ROL")
	private Rol idRol;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsu() {
		return usu;
	}
	public void setUsu(String usu) {
		this.usu = usu;
	}
	public String getPassword() {
		return password;
	}
	public Persona getIdPesona() {
		return idPesona;
	}
	public void setIdPesona(Persona idPesona) {
		this.idPesona = idPesona;
	}
	public Rol getIdRol() {
		return idRol;
	}
	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
