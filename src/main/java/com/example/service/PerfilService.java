package com.example.service;

import java.util.List;
import com.example.model.Perfil;

public interface PerfilService {

   	    // este metodo es para poner estatus
		public List<Perfil>findByStatus(int status);
				
		// este metodos es para guardar
		public Perfil savePerfil(Perfil perfil);
		
		// este metodos es para buscar y Actualizar 
		public Perfil findById(Long Id_Perfil);
		
		//este metodos es para mostrar todos 
		public List<Perfil>findAll();
		
		//este metodos es para eliminar
		public void deletePerfil(Long Id_Perfil);

}
