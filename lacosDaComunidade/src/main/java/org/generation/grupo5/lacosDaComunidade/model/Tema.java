package org.generation.grupo5.lacosDaComunidade.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size (min = 5, max = 255)
	private String temaEvento;
	
	@NotNull
	@Size (min = 5, max = 255)
	private String localEvento;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date dataHorario = new java.sql.Date(System.currentTimeMillis());
	
	//@Column(name = "quant_pessoas")
	@NotNull
	@Size (min = 5, max = 500)
	private long quantPessoas;

	
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

	public Date getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(Date dataHorario) {
		this.dataHorario = dataHorario;
	}

	public long getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(long quantPessoas) {
		this.quantPessoas = quantPessoas;
	}
	
}
