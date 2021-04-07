package edu.ifmt.PF;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.PF.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	
	

}
