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
@Table(name = "tbl_Carrera")
public class Carrera implements Serializable {

	private static final long serialVersionUID = -1101356224116692533L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Carrera;
	private String NombreCarrera;
	private Date Fecha_Creacion;
	private Date Fecha_Modificacion;
	private String Obserbacion;
	private Integer Status;
	
	
}
