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

@Entity
public class Usuario {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usuarioSequence")
	@SequenceGenerator(name="usuarioSequence", sequenceName="usuarioSequence")
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sobrenome;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private int nascimento;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private int dataContratacao;
	
	@Column(nullable = true)
	private int dataDemissao;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Estado_id")
	private Estado estado;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Superior_id")
	private Usuario superior;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "CargoUsuario_id")
	private CargoUsuario cargo;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Veiculo_id")
	private Veiculo veiculo;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "TipoUsuario_id")
	private TipoUsuario tipo;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Empresa_id")
	private Empresa empresa;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "Local_id")
	private Local local;
	
	public Usuario(
		Long id,
		String nome,
		String sobrenome,
		String cpf,
		String username,
		String senha,
		String email,
		int nascimento,
		String telefone,
		int dataContratacao,
		int dataDemissao,
		Estado estado,
		Usuario superior,
		CargoUsuario cargo,
		Veiculo veiculo,
		TipoUsuario tipo,
		Empresa empresa,
		Local local
	) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.username = username;
		this.senha = senha;
		this.email = email;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.dataContratacao = dataContratacao;
		this.dataDemissao = dataDemissao;
		this.estado = estado;
		this.superior = superior;
		this.cargo = cargo;
		this.veiculo = veiculo;
		this.tipo = tipo;
		this.empresa = empresa;
		this.local = local;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(int dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public int getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(int dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Usuario getSuperior() {
		return superior;
	}

	public void setSuperior(Usuario superior) {
		this.superior = superior;
	}

	public CargoUsuario getCargo() {
		return cargo;
	}

	public void setCargo(CargoUsuario cargo) {
		this.cargo = cargo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
}




