package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Perfil;
import com.example.model.Usuario;
import com.example.service.PerfilService;
import com.example.service.UsuarioService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping(path = "/api")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioservices;

	@Autowired
	private PerfilService perfilservices;
	
	/*este es para mostrar todo el contenido */
	/*@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>>ListadoUsuario(){
		return new ResponseEntity<>(usuarioservices.findAll(),HttpStatus.OK);
	}*/
	
	@GetMapping("/uperfil")
	public ResponseEntity<List<Perfil>>ListadoPerfil(){
		return new ResponseEntity<>(perfilservices.findAll(),HttpStatus.OK);
	}
	
		
	@PostMapping("/crearusuario")
	public ResponseEntity<Usuario>GuardarUsuario(@RequestBody Usuario usuario){
		System.out.println(usuario.getNombre() +usuario.getId_Usuario());	
		if (usuario.getId_Usuario() == 0){
			return new ResponseEntity<>(usuarioservices.saveUsuario(usuario),HttpStatus.CREATED);
		} else if(usuario.getId_Usuario() != 0) {
			   Usuario usuarioUpdate = usuarioservices.findById(usuario.getId_Usuario());
		       
		 	   usuarioUpdate.setNombre(usuario.getNombre());
	    	   usuarioUpdate.setApellido(usuario.getApellido());
	    	   usuarioUpdate.setTelefono(usuario.getTelefono());
	    	   usuarioUpdate.setFecha_Nacimineto(usuario.getFecha_Nacimineto());
	    	   usuarioUpdate.setDomicilio(usuario.getDomicilio());
	    	   usuarioUpdate.setCodigo_Postal(usuario.getCodigo_Postal());
	    	   usuarioUpdate.setNo_Interno(usuario.getNo_Interno());
	    	   usuarioUpdate.setNo_Exterior(usuario.getNo_Exterior());
	    	   usuarioUpdate.setFecha_Creacion(usuario.getFecha_Creacion());
	    	   usuarioUpdate.setFecha_Modificacion(usuario.getFecha_Modificacion());
	    	   usuarioUpdate.setObserbacion(usuario.getObserbacion());
	    	   usuarioUpdate.setStatus(usuario.getStatus());
	   
	    	   return new ResponseEntity<>(usuarioservices.saveUsuario(usuarioUpdate),HttpStatus.CREATED);	
		  } else {
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
          }
	}
	
/*  
    @PutMapping("/usuario/{Id_Usuario}")
	public ResponseEntity<Usuario>ActualizarUsuario(@PathVariable Long Id_Usuario, @RequestBody Usuario usuario){
       Usuario usuarioUpdate = usuarioservices.findById(Id_Usuario);
       if (usuarioUpdate == null){
    	   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       } try {
    	   usuarioUpdate.setNombre(usuario.getNombre());
    	   usuarioUpdate.setApellido(usuario.getApellido());
    	   usuarioUpdate.setTelefono(usuario.getTelefono());
    	   usuarioUpdate.setFecha_Nacimineto(usuario.getFecha_Nacimineto());
    	   usuarioUpdate.setDomicilio(usuario.getDomicilio());
    	   usuarioUpdate.setCodigo_Postal(usuario.getCodigo_Postal());
    	   usuarioUpdate.setNo_Interno(usuario.getNo_Interno());
    	   usuarioUpdate.setNo_Exterior(usuario.getNo_Exterior());
    	   usuarioUpdate.setFecha_Creacion(usuario.getFecha_Creacion());
    	   usuarioUpdate.setFecha_Modificacion(usuario.getFecha_Modificacion());
    	   usuarioUpdate.setObserbacion(usuario.getObserbacion());
    	   usuarioUpdate.setStatus(usuario.getStatus());
   
    	   return new ResponseEntity<>(usuarioservices.saveUsuario(usuarioUpdate),HttpStatus.CREATED);
    	   
       }catch(DataAccessException ex) {
    	   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }	
    }
    
    @DeleteMapping("/eliminarusuario/{Id_Usuario}")
    public ResponseEntity<?>EliminarUsuario(@PathVariable Long Id_Usuario){
    	usuarioservices.deleteUsuario(Id_Usuario);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
  */  
}