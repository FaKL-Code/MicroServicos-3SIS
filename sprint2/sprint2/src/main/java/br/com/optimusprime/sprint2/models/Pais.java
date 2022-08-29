package br.com.optimusprime.sprint2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Representação de um país geográfico.
 */
@Entity
public class Pais {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="paisSequence")
	@SequenceGenerator(name="paisSequence", sequenceName="paisSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	public Pais(Long id, String nome) {
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
