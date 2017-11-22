package br.com.cassiopaixao.account.payment.api.repository.lancamento;

import java.util.List;

import br.com.cassiopaixao.account.payment.api.model.Lancamento;
import br.com.cassiopaixao.account.payment.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
