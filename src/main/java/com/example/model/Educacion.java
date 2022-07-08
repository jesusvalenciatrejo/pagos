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
@Table(name = "tbl_Educacion")
public class Educacion implements Serializable {

	private static final long serialVersionUID = 1340348447141644600L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Educacion;
    private String Semestre;
	private Date Fecha_Entrada;
	private Date Fecha_Salida;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_TipoUniversidad", referencedColumnName = "id_TipoUniversidad")
	public TipoUniversidad tipouniversidad;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_Carrera", referencedColumnName = "id_Carrera")
	public Carrera carrera;

	
	public Long getId_Educacion() {
		return Id_Educacion;
	}

	public void setId_Educacion(Long id_Educacion) {
		Id_Educacion = id_Educacion;
	}
	public String getSemestre() {
		return Semestre;
	}

	public void setSemestre(String semestre) {
		Semestre = semestre;
	}

	public Date getFecha_Entrada() {
		return Fecha_Entrada;
	}

	public void setFecha_Entrada(Date fecha_Entrada) {
		Fecha_Entrada = fecha_Entrada;
	}

	public Date getFecha_Salida() {
		return Fecha_Salida;
	}

	public void setFecha_Salida(Date fecha_Salida) {
		Fecha_Salida = fecha_Salida;
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
