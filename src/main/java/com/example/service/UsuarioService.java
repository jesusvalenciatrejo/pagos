package com.example.service;

import java.util.List;
import com.example.model.Usuario;

public interface UsuarioService {
	// este metodo es para poner estatus
	public List<Usuario>findByStatus(int status);
	
	// este metodos es para guardar
	public Usuario saveUsuario(Usuario usuario);
	
	// este metodos es para buscar 
	public Usuario findById(Long Id_Usuario);
	
	//este metodos es para mostrar todos 
	public List<Usuario> findAll();
	
	//este metodos es para eliminar
	public void deleteUsuario(Long Id_Usuario);
}
