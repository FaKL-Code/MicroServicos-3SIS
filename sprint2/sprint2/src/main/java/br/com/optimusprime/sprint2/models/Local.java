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
 * Representação de um local que pode aparecer no mapa do aplicativo.
 */
@Entity
public class Local {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="localSequence")
	@SequenceGenerator(name="localSequence", sequenceName="localSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String coordenada;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "TipoLocal_id")
	private TipoLocal tipo;
	
	public Local(Long id, String coordenada, TipoLocal tipo) {
		this.id = id;
		this.coordenada = coordenada;
		this.tipo = tipo;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCoordenada() {
		return this.coordenada;
	}
	
	public void setCoordenada(String coordenada) {
		this.coordenada = coordenada;
	}
	
	public TipoLocal getTipo() {
		return this.tipo;
	}
	
	public void setTipo(TipoLocal tipo) {
		this.tipo = tipo;
	}
}
