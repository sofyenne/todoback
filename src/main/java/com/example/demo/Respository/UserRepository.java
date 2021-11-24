package com.example.demo.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;



@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

	Optional<User> findByFirstname(String name);

	Optional<User> findByEmail(String email);
}