package avaliacao.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import aula8.model.Pedido;

public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Integer Id;
	private String nome;
	private String matricula;
	private String telefone;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="codigo da nota")
	private Chamado chamado;
	

}
