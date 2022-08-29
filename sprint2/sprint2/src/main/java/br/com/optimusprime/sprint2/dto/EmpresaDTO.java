package br.com.optimusprime.sprint2.dto;

/**
 * Objeto de transição de uma empresa que usa o aplicativo.
 */
public class EmpresaDTO {
	private Long id;
	private String nome;
	private double desconto;
	private int estadoId;
	
	public EmpresaDTO(Long id, String nome, double desconto, int estadoId) {
		this.id = id;
		this.nome = nome;
		this.desconto = desconto;
		this.estadoId = estadoId;
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
	
	public int getEstadoId() {
		return this.estadoId;
	}
	
	public void setEstado(int estadoId) {
		this.estadoId = estadoId;
	}
}
