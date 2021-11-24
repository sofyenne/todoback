package com.example.demo.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private  int userId  ;
	    @Column(unique = true , nullable = false)
	    private String email ;
	    private String roles;
	    @Column(nullable = false )
	    private String firstname ;
	    @Column(nullable = false)
	    private String lastname ;
	    @Column(nullable = false)
	    private String password ;
	    @Column(nullable = true)
	    @JsonFormat(pattern="yyyy-MM-dd" ,shape=JsonFormat.Shape.STRING)
	    private LocalDateTime date  = LocalDateTime.now();

	    
	    public User() {} ; 

	    public User(int userId, String email, String roles, String firstname, String lastname, LocalDateTime date , String password) {
	      
	        this.userId = userId;
	        this.email = email;
	        this.roles = roles;
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.date = date;
	        this.password = password ;
	    }



	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getRoles() {
	        return roles;
	    }

	    public void setRoles(String roles) {
	        this.roles = roles;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    public LocalDateTime getDate() {
	        return date;
	    }

	    public void setDate(LocalDateTime date) {
	        this.date = date;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }


}
