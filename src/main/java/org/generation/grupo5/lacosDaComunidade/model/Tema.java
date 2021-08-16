package org.generation.grupo5.lacosDaComunidade.model;

//import java.time.LocalDate;
//import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size (min = 5, max = 255)
	private String temaEvento;
	
	@NotBlank
	@Size (min = 5, max = 255)
	private String localEvento;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//@DateTimeFormat(pattern = "dd/mm/yyyy HH:mm")
	@NotBlank
	@Size (min = 5, max = 255)
	private String dataHorario;
	
	//@Column(name = "quant_pessoas")
	//@NotBlank
	@Min(1)
	private long quantPessoas;
	
	@OneToMany (mappedBy = "tema", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagens;			 

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

	public String getTemaEvento() {
		return temaEvento;
	}

	public void setTemaEvento(String temaEvento) {
		this.temaEvento = temaEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(String dataHorario) {
		this.dataHorario = dataHorario;
	}

	public long getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(long quantPessoas) {
		this.quantPessoas = quantPessoas;
	}
	
}
