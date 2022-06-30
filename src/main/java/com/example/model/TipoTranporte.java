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
@Table(name="tbl_TipoTranporte")
public class TipoTranporte implements Serializable {

	private static final long serialVersionUID = 8745830613997525200L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_TipoTranporte;
    private String TipoTranporte;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	public Long getId_TipoTranporte() {
		return Id_TipoTranporte;
	}
	public void setId_TipoTranporte(Long id_TipoTranporte) {
		Id_TipoTranporte = id_TipoTranporte;
	}
	public String getTipoTranporte() {
		return TipoTranporte;
	}
	public void setTipoTranporte(String tipoTranporte) {
		TipoTranporte = tipoTranporte;
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
