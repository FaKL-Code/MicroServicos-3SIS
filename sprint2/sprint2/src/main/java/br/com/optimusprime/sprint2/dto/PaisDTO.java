package br.com.optimusprime.sprint2.dto;

/**
 * Objeto de transição de um país geográfico.
 */
public class PaisDTO {
	private Long id;
	private String nome;
	
	public PaisDTO(Long id, String nome) {
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
