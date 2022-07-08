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
@Table(name="tbl_reparacion")
public class Reparacion implements Serializable {
	
	private static final long serialVersionUID = 1270583768299147096L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Reparacion;
	private String Mantenimiento;
	private String Chofer;
	private String MantenimientoStatus;
	private Date Fecha_Entrada;
	private Date Fecha_Salida;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Observacion;
	private Integer Status;

	

	public Long getId_Reparacion() {
		return Id_Reparacion;
	}
	public void setId_Reparacion(Long id_Reparacion) {
		Id_Reparacion = id_Reparacion;
	}
	public String getMantenimiento() {
		return Mantenimiento;
	}
	public void setMantenimiento(String mantenimiento) {
		Mantenimiento = mantenimiento;
	}
	public String getChofer() {
		return Chofer;
	}
	public void setChofer(String chofer) {
		Chofer = chofer;
	}
	public String getMantenimientoStatus() {
		return MantenimientoStatus;
	}
	public void setMantenimientoStatus(String mantenimientoStatus) {
		MantenimientoStatus = mantenimientoStatus;
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
