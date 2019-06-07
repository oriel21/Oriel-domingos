package avaliacao.model;

import java.io.Serializable;
import java.util.Date;

public class Chamado implements Serializable {
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Date getDatechamado() {
		return datechamado;
	}
	public void setDatechamado(Date datechamado) {
		this.datechamado = datechamado;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Date datechamado; 
	private String observacao;
	private boolean aberto;
	

}
