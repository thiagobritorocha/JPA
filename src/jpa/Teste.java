package jpa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

public class Teste {
	public static void main(String[] args) throws ParseException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("locadora-pu");
		EntityManager manager = factory.createEntityManager ();
		manager.getTransaction().begin();
		
		Double somatoria = 0D;
		
		/*PagamentoProdutos pp = new PagamentoProdutos();
		pp.setDia(new Date());
		
		LocacaoProdutos lp = manager.find(LocacaoProdutos.class, 1001L);
		
		pp.setLocacao(lp);
		pp.setValorPagamento(100D);*/
		
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = (Date)formatter.parse("2017/01/11");
		
		Query query = manager.createNamedQuery ("PagamentoProdutos.findByDate");
		
		query.setParameter("dia",date, TemporalType.DATE);
		
		List<PagamentoProdutos> pagamentosProdutosByDate = query.getResultList();
		for (PagamentoProdutos pagamentoProdutos : pagamentosProdutosByDate) {
			LocacaoProdutos lp = manager.find(LocacaoProdutos.class,pagamentoProdutos.getLocacao().getIdLocacao());
			
			RegraExtracaoProduto rep = new RegraExtracaoProduto();
			rep.setCodigoProduto(lp.getCodigoProduto());
			somatoria += pagamentoProdutos.getValorPagamento();
			manager.persist(rep);
		}
		
		ReportePagamento rp = new ReportePagamento();
		rp.setDataExtracao(date);
		rp.setSomatoriaPagamento(somatoria);
		
		manager.persist(rp);
		
		manager.getTransaction().commit ();
		manager.close ();
		
		factory.close();
	}
}