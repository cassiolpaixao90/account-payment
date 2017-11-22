package br.com.cassiopaixao.account.payment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cassiopaixao.account.payment.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
