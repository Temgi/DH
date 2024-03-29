package br.com.digitalhouse.thebookclub.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_Usuario;
	
	@NotNull
	@Size(min=2,max=100)
	private String nome;
	
	@NotNull
	@Size(min=2,max=100)
	private String sobreNome;
	
	@NotNull
	@Size(min=11,max=14)
	private String cpf;
	
	@NotNull
	@Size(min=5,max=20)
	private String username;
	
	@NotNull
	@Size(min=10,max=40)
	private String email;
	
	@NotNull
	@Size(min=1,max=3)
	private Integer idade;
	
	private String preferencias;
	
	@NotNull
	@Size(min=10,max=100)
	private String endereco;
	
	@NotNull
	@Size(min=1,max=6)
	private Integer numero;
	
	@NotNull
	@Size(min=10,max=100)
	private String bairro;
	
	@NotNull
	@Size(min=11,max=14)
	private String cep;
	
	@Size(min=10,max=100)
	private String complemento;
	
	
	
	public Long getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(Long id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
