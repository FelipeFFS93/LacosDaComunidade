package org.generation.grupo5.lacosDaComunidade.controller;

import java.util.List;
import java.util.Optional;

import org.generation.grupo5.lacosDaComunidade.model.Usuario;
import org.generation.grupo5.lacosDaComunidade.model.UsuarioLogin;
import org.generation.grupo5.lacosDaComunidade.repository.UsuarioRepository;
import org.generation.grupo5.lacosDaComunidade.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById (@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/usuario/{usuario}")
	public ResponseEntity<List<Usuario>> getByUsuario(@PathVariable String usuario){
		return ResponseEntity.ok(repository.findByUsuarioContainingIgnoreCase(usuario));
	}
	
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> Autentication (@RequestBody Optional<UsuarioLogin> user){
		
		return UsuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> CadastrarUsuario (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(UsuarioService.CadastrarUsuario(usuario));
	}
	
	
	@PutMapping 
	public ResponseEntity<Usuario> put (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(usuario));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}
