package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReportePagamento {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Double SomatoriaPagamento;
	
	@Temporal(TemporalType.DATE)
	private Date DataExtracao;

	public Double getSomatoriaPagamento() {
		return SomatoriaPagamento;
	}

	public void setSomatoriaPagamento(Double somatoriaPagamento) {
		SomatoriaPagamento = somatoriaPagamento;
	}

	public Date getDataExtracao() {
		return DataExtracao;
	}

	public void setDataExtracao(Date dataExtracao) {
		DataExtracao = dataExtracao;
	}
		
}