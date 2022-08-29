package br.com.optimusprime.sprint1.models;

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
 * Representação de uma empresa que usa o aplicativo.
 */
@Entity
public class Empresa {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="empresaSequence")
	@SequenceGenerator(name="empresaSequence", sequenceName="empresaSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private double desconto;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Estado_id")
	private Estado estado;
	
	public Empresa(Long id, String nome, double desconto, Estado estado) {
		this.id = id;
		this.nome = nome;
		this.desconto = desconto;
		this.estado = estado;
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
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
