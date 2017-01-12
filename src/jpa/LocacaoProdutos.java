package jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocacaoProdutos implements Serializable {
	@Id
	private Long idLocacao;
	private String CPFCliente;
	private String NomeCliente;
	private Long CodigoProduto;
	
	public Long getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(Long idLocacao) {
		this.idLocacao = idLocacao;
	}
	public String getCPFCliente() {
		return CPFCliente;
	}
	public void setCPFCliente(String cPFCliente) {
		CPFCliente = cPFCliente;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public Long getCodigoProduto() {
		return CodigoProduto;
	}
	public void setCodigoProduto(Long codigoProduto) {
		CodigoProduto = codigoProduto;
	}

	
}