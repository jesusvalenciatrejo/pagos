package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Perfil;
import com.example.repositorydao.RepositoryDaoPerfil;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	private RepositoryDaoPerfil repositoridaoperfil;
	
	@Override
	public List<Perfil> findByStatus(int status){
		 System.out.println("si entro stratus"+status);
		 return repositoridaoperfil.findByStatus(status);
	}
	
	@Override
	public Perfil savePerfil(Perfil usuario) {
		return repositoridaoperfil.save(usuario);
	}	
	
	// este es para buscar perfil
	@Override
	public Perfil findById(Long Id_Perfil) {
		return repositoridaoperfil.findById(Id_Perfil).orElse(null);
	}
   
	// este metodos es para mostrar todos registros 
	@Override
	public List<Perfil>findAll() {
		return repositoridaoperfil.findAll();
	}
	// este metodo es para Eliminar  
	@Override
	public void deletePerfil(Long Id_Perfil) {
		repositoridaoperfil.deleteById(Id_Perfil);
	}	
}