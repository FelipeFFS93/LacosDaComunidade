package org.generation.grupo5.lacosDaComunidade.repository;

import java.util.List;

import org.generation.grupo5.lacosDaComunidade.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long> {
	public List<Postagem>findAllByNomeEventoContainingIgnoreCase(String nomeEvento);
}
