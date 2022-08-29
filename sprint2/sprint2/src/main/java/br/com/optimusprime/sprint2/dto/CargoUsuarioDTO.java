package br.com.optimusprime.sprint2.dto;

/**
 * Objeto de transição de um cargo de usuário.
 */
public class CargoUsuarioDTO {
	private Long id;
	private String nome;
	private String descricao;
	private int nivel;
	
	public CargoUsuarioDTO(Long id, String nome, String descricao, int nivel) {
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
