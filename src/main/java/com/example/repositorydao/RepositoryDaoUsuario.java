package com.example.repositorydao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.model.Usuario;

@Repository
public interface RepositoryDaoUsuario extends JpaRepository<Usuario , Long> {
	@Query(value = "Select * from tbl_usuario where Status=?",nativeQuery=true)	
	List<Usuario> findByStatus(int Status);
}