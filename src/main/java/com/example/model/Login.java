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
@Table(name="tbl_Login")
public class Login implements Serializable {
	
	private static final long serialVersionUID = -4520473374269286456L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Login;
	private Long Id_Usuario;
	private String Usuario;
	private String Contrasena;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion; 
	private String Observacion;
	private Integer Status;
	
	public Long getId_Login() {
		return Id_Login;
	}
	public void setId_Login(Long id_Login) {
		Id_Login = id_Login;
	}
	public Long getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(Long id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
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
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
}