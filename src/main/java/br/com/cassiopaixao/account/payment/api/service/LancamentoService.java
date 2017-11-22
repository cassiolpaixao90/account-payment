package br.com.cassiopaixao.account.payment.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cassiopaixao.account.payment.api.model.Lancamento;
import br.com.cassiopaixao.account.payment.api.model.Pessoa;
import br.com.cassiopaixao.account.payment.api.repository.LancamentoRepository;
import br.com.cassiopaixao.account.payment.api.repository.PessoaRepository;
import br.com.cassiopaixao.account.payment.api.service.exception.PessoaInexistenteOuInativoException;

@Service
public class LancamentoService {

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativoException();
		}
		return lancamentoRepository.save(pessoa);
	}

	
	
	
}
