package org.generation.grupo5.lacosDaComunidade.repository;

import java.util.List;

import org.generation.grupo5.lacosDaComunidade.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByLocalEventoContainingIgnoreCase(String localEvento);
}
