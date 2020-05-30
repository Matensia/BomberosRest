package ar.edu.ubp.das.bean;

import java.sql.Date;

public class ChatBean {
	
	private int 	id;
	private int 	idAsistencia;
	private String 	mensaje;
	private Date 	fecha;
	private String 	estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAsistencia() {
		return idAsistencia;
	}
	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
