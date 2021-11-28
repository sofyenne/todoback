package com.example.demo.Respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Tache;

public interface  TacheRepository extends JpaRepository<Tache, Integer> {
	
	List<Tache> findByTechnicien(int technicien) ;

}
