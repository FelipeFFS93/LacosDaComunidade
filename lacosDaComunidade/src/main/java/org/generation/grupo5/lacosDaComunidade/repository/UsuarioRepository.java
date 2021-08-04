package org.generation.grupo5.lacosDaComunidade.repository;

import java.util.List;

import org.generation.grupo5.lacosDaComunidade.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List <Usuario>findAllByNomeContainingIgnoreCase(String nome);
}
