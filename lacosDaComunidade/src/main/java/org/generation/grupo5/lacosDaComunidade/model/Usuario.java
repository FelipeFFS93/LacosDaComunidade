package org.generation.grupo5.lacosDaComunidade.model;

import java.time.LocalDate;
//import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size (min = 5, max = 255)
	private String nome;
	
	@NotBlank
	@Size (min = 5, max = 255)
	@Email(message = "O atributo usuÃ¡rio deve ser um email")
	private String usuario;
	
	@NotBlank
	@Size (min = 5)
	private String senha;

	@NotBlank
	@Size (min = 5, max = 255)
	private String ongs;
	
	@NotBlank
	@Size (min = 5, max = 55)
	private String genero;
	
	@NotBlank
	@Size (min = 5, max = 55)
	private String CPF;
	
	@NotBlank
	@Size (min = 5, max = 95)
	private String CNPJ;
	
	private String foto;
	
	private String tipo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate dataNascimento;

	@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagens;
	
	public Usuario(long id, String nome, String usuario, String senha, String ongs, String genero, String CPF, String CNPJ ,String foto, String tipo) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.ongs = ongs;
		this.genero = genero;
		this.CPF = CPF;
		this.CNPJ = CNPJ;
		this.foto = foto;
		this.tipo = tipo;
	}
	
	
 
	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void getUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getOngs() {
		return ongs;
	}

	public void setOngs(String ongs) {
		this.ongs = ongs;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
