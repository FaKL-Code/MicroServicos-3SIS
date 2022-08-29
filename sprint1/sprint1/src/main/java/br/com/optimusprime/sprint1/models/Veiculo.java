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
 * Representação de um veículo que um trabalhador da Scania dirige.
 */
@Entity
public class Veiculo {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="veiculoSequence")
	@SequenceGenerator(name="veiculoSequence", sequenceName="veiculoSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private String descricao;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "TipoVeiculo_id")
	private TipoVeiculo tipo;
	
	public Veiculo(Long id, String modelo, String descricao, TipoVeiculo tipo) {
		this.id = id;
		this.modelo = modelo;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public TipoVeiculo getTipo() {
		return this.tipo;
	}
	
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
}
