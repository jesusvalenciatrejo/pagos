package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Login;
import com.example.model.Perfil;
import com.example.repositorydao.RepositoryDaoLogin;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private RepositoryDaoLogin repositoriodaologin;

	@Override
	public Login saveLogin(Login login) {
		return repositoriodaologin.save(login);
	}
	@Override
	public List<Login> findByStatus(int status){
		 System.out.println("si entro stratus"+status);
		 return repositoriodaologin.findByStatus(status);
	}
	
	// este es para buscar perfil
	@Override
	public Login findById(Long Id_Login) {
		return repositoriodaologin.findById(Id_Login).orElse(null);
	}

	// este metodos es para mostrar todos registros 
	@Override
	public List<Login>findAll() {
		return repositoriodaologin.findAll();
	}
	// este metodo es para Eliminar  
	@Override
	public void deleteLogin(Long Id_Login) {
		repositoriodaologin.deleteById(Id_Login);
	}	
	
}