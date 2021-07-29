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
	private String tema_evento;
	
	@NotNull
	@Size (min = 5, max = 255)
	private String local_evento;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date data_horario = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@Size (min = 5, max = 500)
	private long quant_pessoas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTema_evento() {
		return tema_evento;
	}

	public void setTema_evento(String tema_evento) {
		this.tema_evento = tema_evento;
	}

	public String getLocal_evento() {
		return local_evento;
	}

	public void setLocal_evento(String local_evento) {
		this.local_evento = local_evento;
	}

	public Date getData_horario() {
		return data_horario;
	}

	public void setData_horario(Date data_horario) {
		this.data_horario = data_horario;
	}

	public long getQuant_pessoas() {
		return quant_pessoas;
	}

	public void setQuant_pessoas(long quant_pessoas) {
		this.quant_pessoas = quant_pessoas;
	}
	
	
	
	
	
	
	
	
}
