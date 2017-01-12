package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name ="PagamentoProdutos.findByDate", query ="SELECT p FROM PagamentoProdutos p WHERE p.dia = :dia")
public class PagamentoProdutos {
	@Id
	@GeneratedValue
	private Long idPagamento;
	@OneToOne
	private LocacaoProdutos Locacao;
	@Temporal(TemporalType.DATE)
	private Date dia;
	private Double valorPagamento;
	public Long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}
	public LocacaoProdutos getLocacao() {
		return Locacao;
	}
	public void setLocacao(LocacaoProdutos locacao) {
		Locacao = locacao;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public Double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	
	
	
}