package br.com.optimusprime.sprint1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Representação de um tipo de local (posto, hotel, restaurante...).
 */
@Entity
public class TipoLocal {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tipoLocalSequence")
	@SequenceGenerator(name="tipoLocalSequence", sequenceName="tipoLocalSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	public TipoLocal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
