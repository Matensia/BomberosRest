package ar.edu.ubp.das.bean;

import java.sql.Date;

public class DetalleAsistenciaBean {
	
	private int 	id;
	private int 	idAsistencia;
	private String 	tipoDato;
	private String 	dato;
	private Date 	fecha;
	
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
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}