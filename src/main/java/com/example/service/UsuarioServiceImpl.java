package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Usuario;
import com.example.repositorydao.RepositoryDaoUsuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private RepositoryDaoUsuario repositoriodaousuario;
	
	@Override
	 public List<Usuario> findByStatus(int status){
		 System.out.println("si entro stratus"+status);
		 return repositoriodaousuario.findByStatus(status);
	 }
	
	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return repositoriodaousuario.save(usuario);
	}	
	// este es para buscar usuario
	@Override
	public Usuario findById(Long Id_Usuario) {
		return repositoriodaousuario.findById(Id_Usuario).orElse(null);
	}
    
	// este metodos es para mostrar todos registros 
	@Override
	public List<Usuario>findAll() {
		return repositoriodaousuario.findAll();
	}
    
	// este metodo es para Eliminar  
	@Override
	public void deleteUsuario(Long Id_Usuario) {
		repositoriodaousuario.deleteById(Id_Usuario);
	}
}