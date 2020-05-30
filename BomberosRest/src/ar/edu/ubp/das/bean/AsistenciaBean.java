package ar.edu.ubp.das.bean;

import java.sql.Date;

public class AsistenciaBean {
	
	private int 	id;
	private String 	idServicio;
	private String 	estado;
	private Date 	fecha;
	private int 	idSolicitud;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
}
