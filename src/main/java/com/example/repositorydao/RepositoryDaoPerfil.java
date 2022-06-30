package com.example.repositorydao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.model.Perfil;

@Repository
public interface RepositoryDaoPerfil extends JpaRepository<Perfil , Long> {
	@Query(value = "Select * from tbl_perfil where Status=?",nativeQuery=true)
	List<Perfil> findByStatus(int Status);	
}
