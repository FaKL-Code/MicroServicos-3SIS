package br.com.optimusprime.sprint2.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * Representação de um estado geográfico.
 */
@Entity
public class Estado {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estadoSequence")
	@SequenceGenerator(name="estadoSequence", sequenceName="estadoSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Pais_id")
	private Pais pais;
	
	public Estado(Long id, String nome, Pais pais) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
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
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
