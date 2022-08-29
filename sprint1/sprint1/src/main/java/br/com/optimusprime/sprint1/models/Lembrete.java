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
 * Representação de um lembrete criado por um usuário.
 */
@Entity
public class Lembrete {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="lembreteSequence")
	@SequenceGenerator(name="lembreteSequence", sequenceName="lembreteSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private int dataAbertura;
	
	@Column(nullable = false)
	private int dataExibicao;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Usuario_id")
	private Usuario autor;
	
	public Lembrete(Long id, String titulo, String descricao, int dataAbertura, int dataExibicao, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataExibicao = dataExibicao;
		this.autor = autor;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(int dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getDataExibicao() {
		return dataExibicao;
	}

	public void setDataExibicao(int dataExibicao) {
		this.dataExibicao = dataExibicao;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
}
