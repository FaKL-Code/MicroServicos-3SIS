package br.com.optimusprime.sprint1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Representação de um tipo de usuário.
 */
@Entity
public class TipoUsuario {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tipoUsuarioSequence")
	@SequenceGenerator(name="tipoUsuarioSequence", sequenceName="tipoUsuarioSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	public TipoUsuario(Long id, String nome) {
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
