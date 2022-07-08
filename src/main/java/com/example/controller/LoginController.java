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

import com.example.model.Login;
import com.example.model.Perfil;
import com.example.model.Usuario;
import com.example.service.LoginService;
import com.example.service.PerfilService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping(path = "/api")
public class LoginController {
	
	@Autowired
	private LoginService loginservices;
	
	@GetMapping("/loginusuaruio")
	public ResponseEntity<List<Login>>ListadoLogin(){
		return new ResponseEntity<>(loginservices.findAll(),HttpStatus.OK);
	}	
	
}