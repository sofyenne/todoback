package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Tache;
import com.example.demo.Respository.TacheRepository;

@RestController
@RequestMapping("/api/task")
public class TacheController {
	
	
	
	@Autowired
	private TacheRepository tacheRepository ;
	
	@PostMapping("/create")
	public Tache create(Tache tache ){
		return tacheRepository.save(tache) ;
	}
	
	@GetMapping("/all")
	public List<Tache>getall(){
		return tacheRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public List<Tache>getbytechId(@PathVariable int id){
		return tacheRepository.findByTechnicien(id);
	}
	@DeleteMapping("/{id}")
	public void deleteone(@PathVariable int id ) {
		 Optional<Tache> t = tacheRepository.findById(id) ; 
		 if (t.isPresent()) { tacheRepository.delete(t.get());}
		 
	}
	@PutMapping("/{id}")
	public Tache updtate(@PathVariable int id  , @RequestBody Tache tache) {
		Tache t = tacheRepository.getOne(id) ;
		if(t!=null) {
			t.setStart(tache.getStart()) ; 
			t.setEnd(tache.getEnd()) ; 
			t.setEtat(tache.getEtat());
			t.setTache(tache.getTache()) ;
			t.setTechnicien(tache.getTechnicien());
			return tacheRepository.save(t);
		}
		throw new ResourceNotFoundException("tache inixist");
	}

}
