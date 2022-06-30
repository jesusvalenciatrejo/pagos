package com.example.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_Perfil")
public class Perfil implements Serializable {
	
	private static final long serialVersionUID = 1117958981967634718L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Perfil;
	private String Nombre_Perfil;
	private String Precio_Perfil;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="id_perfil", cascade=CascadeType.ALL)
	private List<Usuario> usuario;

	public Perfil() {
		this.usuario =new ArrayList<>();
	}
		
	@Column(name="id_perfil")
	public Long getId_Perfil(){
		return Id_Perfil;
	}
	
	public void setId_Perfil(Long id_Perfil) {
		Id_Perfil = id_Perfil;
	}
	
	@Column(name="nombre_perfil")
	public String getNombre_Perfil() {
		return Nombre_Perfil;
	}
	public void setNombre_Perfil(String nombre_Perfil) {
		Nombre_Perfil = nombre_Perfil;
	}
	@Column(name="precio_perfil")
	public String getPrecio_Perfil() {
		return Precio_Perfil;
	}
	public void setPrecio_Perfil(String precio_Perfil) {
		Precio_Perfil = precio_Perfil;
	}
	@Column(name="fecha_creacion")
	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}
	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	@Column(name="fecha_modificacion")
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
	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

}