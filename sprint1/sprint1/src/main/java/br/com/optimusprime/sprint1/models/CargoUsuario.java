package br.com.optimusprime.sprint1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Representação do cargo do usuário na empresa (presidente, gerente, caminhoneiro, TI...)
 */
@Entity
public class CargoUsuario {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tipoVeiculoSequence")
	@SequenceGenerator(name="tipoVeiculoSequence", sequenceName="tipoVeiculoSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private int nivel;
	
	public CargoUsuario(Long id, String nome, String descricao, int nivel) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.nivel = nivel;
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
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
