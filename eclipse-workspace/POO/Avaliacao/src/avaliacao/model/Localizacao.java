package avaliacao.model;

import java.io.Serializable;

public class Localizacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Integer numeroSala;
	private String Descricao;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	

}
