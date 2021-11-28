package com.example.demo.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tache {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tacheId ;
	
	private String tache  ; 
	private String etat ; 
	private LocalDateTime start ; 
	private LocalDateTime end ; 
	private int technicien ;
	
	public int getTacheId() {
		return tacheId;
	}
	public void setTacheId(int tacheId) {
		this.tacheId = tacheId;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public int getTechnicien() {
		return technicien;
	}
	public void setTechnicien(int technicien) {
		this.technicien = technicien;
	}
	public Tache(int tacheId, String tache, String etat, LocalDateTime start, LocalDateTime end, int technicien) {
		super();
		this.tacheId = tacheId;
		this.tache = tache;
		this.etat = etat;
		this.start = start;
		this.end = end;
		this.technicien = technicien;
	} 
	
	

}
