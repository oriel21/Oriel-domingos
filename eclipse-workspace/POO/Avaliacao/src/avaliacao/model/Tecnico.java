package avaliacao.model;

import java.io.Serializable;

public class Tecnico implements Serializable{
	
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
	private Integer Id;
	private String nome;
	private String matricula;
	

}
