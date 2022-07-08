package com.example.model;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_Boletos")
public class Boletos implements Serializable {
	
	private static final long serialVersionUID = 1270583768299147096L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Boletos;
	private String Precio_Pasaje;
	private String Rutas;
	private Date CaducidadBoletoInicial;
	private Date CaducidadBoletoFinal;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;

	
	public Long getId_Boletos() {
		return Id_Boletos;
	}
	public void setId_Boletos(Long id_Boletos) {
		Id_Boletos = id_Boletos;
	}
	public String getPrecio_Pasaje() {
		return Precio_Pasaje;
	}
	public void setPrecio_Pasaje(String precio_Pasaje) {
		Precio_Pasaje = precio_Pasaje;
	}
	public String getRutas() {
		return Rutas;
	}
	public void setRutas(String rutas) {
		Rutas = rutas;
	}
	public Date getCaducidadBoletoInicial() {
		return CaducidadBoletoInicial;
	}
	public void setCaducidadBoletoInicial(Date caducidadBoletoInicial) {
		CaducidadBoletoInicial = caducidadBoletoInicial;
	}
	public Date getCaducidadBoletoFinal() {
		return CaducidadBoletoFinal;
	}
	public void setCaducidadBoletoFinal(Date caducidadBoletoFinal) {
		CaducidadBoletoFinal = caducidadBoletoFinal;
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
