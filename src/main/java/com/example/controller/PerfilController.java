package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Perfil;
import com.example.model.Usuario;
import com.example.service.PerfilService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping(path = "/api")
public class PerfilController {

	@Autowired
	private PerfilService perfilservices;
	
	@GetMapping("/perfil/{status}")
	public Object MostrarPorStatusP(@PathVariable(name="status") int Status){
		return perfilservices.findByStatus(Status);
	}
	
	@PostMapping("/crearperfil")
	public ResponseEntity<Perfil>GuardarPerfil(@RequestBody Perfil perfil){
		System.out.println(perfil.getNombre_Perfil() +perfil.getId_Perfil());
		
		if (perfil.getId_Perfil() == 0){
			// etsa opc es para insertar
				return new ResponseEntity<>(perfilservices.savePerfil(perfil),HttpStatus.CREATED);
		//	}
		 } else if(perfil.getId_Perfil() != 0) {
			// este es para Actuañizar
			   Perfil perfilUpdate = perfilservices.findById(perfil.getId_Perfil());
		       
	      	   perfilUpdate.setNombre_Perfil(perfil.getNombre_Perfil());
			   perfilUpdate.setPrecio_Perfil(perfil.getPrecio_Perfil());
			   perfilUpdate.setFecha_Creacion(perfil.getFecha_Creacion());
			   perfilUpdate.setFecha_Modificacion(perfil.getFecha_Modificacion());
			   perfilUpdate.setObserbacion(perfil.getObserbacion());
			   perfilUpdate.setStatus(perfil.getStatus());  
	    	   return new ResponseEntity<>(perfilservices.savePerfil(perfilUpdate),HttpStatus.CREATED);	
		  } else {
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
          }
	}	
}
