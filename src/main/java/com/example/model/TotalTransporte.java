package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_TotalTransporte")
public class TotalTransporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_TotalTranporte;
	private Long Id_Boletos;
	private Integer Cantidad_Nomal;
	private Integer Cantidad_TerseraEdad;
	private Integer Cantidad_Incapacidad;
	private Integer Cantidad_Estudientes;
	
	public Long getId_TotalTranporte() {
		return Id_TotalTranporte;
	}
	public void setId_TotalTranporte(Long id_TotalTranporte) {
		Id_TotalTranporte = id_TotalTranporte;
	}
	public Long getId_Boletos() {
		return Id_Boletos;
	}
	public void setId_Boletos(Long id_Boletos) {
		Id_Boletos = id_Boletos;
	}
	public Integer getCantidad_Nomal() {
		return Cantidad_Nomal;
	}
	public void setCantidad_Nomal(Integer cantidad_Nomal) {
		Cantidad_Nomal = cantidad_Nomal;
	}
	public Integer getCantidad_TerseraEdad() {
		return Cantidad_TerseraEdad;
	}
	public void setCantidad_TerseraEdad(Integer cantidad_TerseraEdad) {
		Cantidad_TerseraEdad = cantidad_TerseraEdad;
	}
	public Integer getCantidad_Incapacidad() {
		return Cantidad_Incapacidad;
	}
	public void setCantidad_Incapacidad(Integer cantidad_Incapacidad) {
		Cantidad_Incapacidad = cantidad_Incapacidad;
	}
	public Integer getCantidad_Estudientes() {
		return Cantidad_Estudientes;
	}
	public void setCantidad_Estudientes(Integer cantidad_Estudientes) {
		Cantidad_Estudientes = cantidad_Estudientes;
	}
	
	
	
}