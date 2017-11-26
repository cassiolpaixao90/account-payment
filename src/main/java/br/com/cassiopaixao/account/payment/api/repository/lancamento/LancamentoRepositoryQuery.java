package br.com.cassiopaixao.account.payment.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.cassiopaixao.account.payment.api.model.Lancamento;
import br.com.cassiopaixao.account.payment.api.repository.filter.LancamentoFilter;
import br.com.cassiopaixao.account.payment.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
