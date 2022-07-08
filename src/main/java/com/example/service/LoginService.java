package com.example.service;

import java.util.List;

import com.example.model.Login;

public interface LoginService {
	
	        // este metodo es para poner estatus
			public List<Login>findByStatus(int status);
					
			// este metodos es para guardar
			public Login saveLogin(Login login);
			
			// este metodos es para buscar y Actualizar 
			public Login findById(Long Id_Login);
			
			//este metodos es para mostrar todos 
			public List<Login>findAll();
			
			//este metodos es para eliminar
			public void deleteLogin(Long Id_Login);
		
}