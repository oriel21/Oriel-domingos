package avaliacao.model;

import java.io.Serializable;

public class Equipamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String modelo;
	private String marca;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
