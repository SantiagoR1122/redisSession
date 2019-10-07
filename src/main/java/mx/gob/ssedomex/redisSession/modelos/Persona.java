package mx.gob.ssedomex.redisSession.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAS")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_id_personas" )
	@SequenceGenerator(name="sec_id_personas", sequenceName = "sec_id_personas", allocationSize=1)
	@Column(name="ID", updatable = false)
	private Integer id;
	@Column(name="NOMBRES", updatable = false)
	private String nombres;
	@Column(name="APELLIDOS", updatable = false)
	private String apellidos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
}
