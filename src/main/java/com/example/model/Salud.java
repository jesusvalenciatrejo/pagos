package com.example.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_Salud")
public class Salud implements Serializable {

	private static final long serialVersionUID = 7342409095182838682L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Salud;
	private String Tipo_Salud;
	private String Tipo_Sangre; 
	private String Detalles_de_salud;
	private String Alergias;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_Usuario", referencedColumnName = "id_Usuario")
	public Usuario usuario;
	
	public Long getId_Salud() {
		return Id_Salud;
	}
	public void setId_Salud(Long id_Salud) {
		Id_Salud = id_Salud;
	}
	public String getTipo_Salud() {
		return Tipo_Salud;
	}
	public void setTipo_Salud(String tipo_Salud) {
		Tipo_Salud = tipo_Salud;
	}
	public String getTipo_Sangre() {
		return Tipo_Sangre;
	}
	public void setTipo_Sangre(String tipo_Sangre) {
		Tipo_Sangre = tipo_Sangre;
	}
	public String getDetalles_de_salud() {
		return Detalles_de_salud;
	}
	public void setDetalles_de_salud(String detalles_de_salud) {
		Detalles_de_salud = detalles_de_salud;
	}
	public String getAlergias() {
		return Alergias;
	}
	public void setAlergias(String alergias) {
		Alergias = alergias;
	}
	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}
	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	public Date getFecha_Modificacion() {
		return Fecha_Modificacion;
	}
	public void setFecha_Modificacion(Date fecha_Modificacion) {
		Fecha_Modificacion = fecha_Modificacion;
	}
	public String getObserbacion() {
		return Obserbacion;
	}
	public void setObserbacion(String obserbacion) {
		Obserbacion = obserbacion;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
}
