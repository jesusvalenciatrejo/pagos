package com.example.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_TipoUniversidad")
public class TipoUniversidad implements Serializable {

	private static final long serialVersionUID = -3206794434240664L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_TipoUniversidad;
	private String NombreUniversidad;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;

	public Long getId_TipoUniversidad() {
		return Id_TipoUniversidad;
	}

	public void setId_TipoUniversidad(Long id_TipoUniversidad) {
		Id_TipoUniversidad = id_TipoUniversidad;
	}

	public String getNombreUniversidad() {
		return NombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		NombreUniversidad = nombreUniversidad;
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
