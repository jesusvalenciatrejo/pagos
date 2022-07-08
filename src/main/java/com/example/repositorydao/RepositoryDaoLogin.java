package com.example.repositorydao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Login;
import com.example.model.Perfil;

public interface RepositoryDaoLogin  extends JpaRepository<Login , Long> {
	@Query(value = "Select * from tbl_Login where Status=?",nativeQuery=true)
	List<Login> findByStatus(int Status);
}
