package br.com.optimusprime.sprint2.dto;

/**
 * Objeto de transição de um estado geográfico.
 */
public class EstadoDTO {
	private Long id;
	private String nome;
	private PaisDTO pais;
	
	public EstadoDTO(Long id, String nome, PaisDTO pais) {
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
	
	public PaisDTO getPais() {
		return this.pais;
	}
	
	public void setPais(PaisDTO pais) {
		this.pais = pais;
	}
}
