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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_Camion")
public class Camion implements Serializable {

	private static final long serialVersionUID = -5345815139838407394L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Camion;
	private String Modelo;
	private String Placas;
	private String Marcas;
    private String Serie;
    private String Rutas;
    private String Precio;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_Boletos", referencedColumnName = "id_Boletos")
	public Boletos boletos;
	
	@OneToMany(targetEntity = Reparacion.class, cascade={CascadeType.REMOVE, CascadeType.PERSIST })
	@JoinColumn(name="id_Camion")
	public List<Reparacion>Reparacion;

	@OneToMany(targetEntity = Tiempo.class, cascade={CascadeType.REMOVE, CascadeType.PERSIST })
	@JoinColumn(name="id_camion")
	public List<Tiempo>tiempo;
	public Long getId_Camion() {
		return Id_Camion;
	}
	public void setId_Camion(Long id_Camion) {
		Id_Camion = id_Camion;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getPlacas() {
		return Placas;
	}
	public void setPlacas(String placas) {
		Placas = placas;
	}
	public String getMarcas() {
		return Marcas;
	}
	public void setMarcas(String marcas) {
		Marcas = marcas;
	}
	public String getSerie() {
		return Serie;
	}
	public void setSerie(String serie) {
		Serie = serie;
	}
	public String getRutas() {
		return Rutas;
	}
	public void setRutas(String rutas) {
		Rutas = rutas;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
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
