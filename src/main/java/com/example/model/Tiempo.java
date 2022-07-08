package com.example.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_tiempo")
public class Tiempo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Tiempo;
	private Date TiempoInicial;
	private Date TiempoFinal;
	private String longitud;
	private String Latitud;
	private Date FechaCreacion;
	private Date FechaModificacion;
    private Integer Status;
	
    

    
    public Long getId_Tiempo() {
		return Id_Tiempo;
	}
	public void setId_Tiempo(Long id_Tiempo) {
		Id_Tiempo = id_Tiempo;
	}
	public Date getTiempoInicial() {
		return TiempoInicial;
	}
	public void setTiempoInicial(Date tiempoInicial) {
		TiempoInicial = tiempoInicial;
	}
	public Date getTiempoFinal() {
		return TiempoFinal;
	}
	public void setTiempoFinal(Date tiempoFinal) {
		TiempoFinal = tiempoFinal;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getLatitud() {
		return Latitud;
	}
	public void setLatitud(String latitud) {
		Latitud = latitud;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return FechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	} 	
}
