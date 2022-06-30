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
@Table(name="tbl_TarjetaPasaje")
public class TarjetaPasaje implements Serializable {
	
	private static final long serialVersionUID = 3908715067053866349L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_TarjetaPasaje;
	private Long Id_Usuario;
	private String Creditos;
	private Integer Numero_de_Tarjeta;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	public Long getId_TarjetaPasaje() {
		return Id_TarjetaPasaje;
	}
	public void setId_TarjetaPasaje(Long id_TarjetaPasaje) {
		Id_TarjetaPasaje = id_TarjetaPasaje;
	}
	public Long getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(Long id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getCreditos() {
		return Creditos;
	}
	public void setCreditos(String creditos) {
		Creditos = creditos;
	}
	public Integer getNumero_de_Tarjeta() {
		return Numero_de_Tarjeta;
	}
	public void setNumero_de_Tarjeta(Integer numero_de_Tarjeta) {
		Numero_de_Tarjeta = numero_de_Tarjeta;
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
