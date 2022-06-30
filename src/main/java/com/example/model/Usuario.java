package com.example.model;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -59705556868385807L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Usuario;
	@ManyToOne(fetch=FetchType.LAZY)
    private Perfil id_perfil;
	private String Nombre;
	private String Apellido;
	private Integer Telefono;
	private Date Fecha_Nacimineto;
	private String Domicilio;
	private Integer Codigo_Postal;
	private Integer No_Interno;
	private Integer No_Exterior;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	public Long getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(Long id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Integer getTelefono() {
		return Telefono;
	}
	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}
	public Date getFecha_Nacimineto() {
		return Fecha_Nacimineto;
	}
	public void setFecha_Nacimineto(Date fecha_Nacimineto) {
		Fecha_Nacimineto = fecha_Nacimineto;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public Integer getCodigo_Postal() {
		return Codigo_Postal;
	}
	public void setCodigo_Postal(Integer codigo_Postal) {
		Codigo_Postal = codigo_Postal;
	}
	public Integer getNo_Interno() {
		return No_Interno;
	}
	public void setNo_Interno(Integer no_Interno) {
		No_Interno = no_Interno;
	}
	public Integer getNo_Exterior() {
		return No_Exterior;
	}
	public void setNo_Exterior(Integer no_Exterior) {
		No_Exterior = no_Exterior;
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