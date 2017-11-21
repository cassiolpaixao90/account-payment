package br.com.cassiopaixao.account.payment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cassiopaixao.account.payment.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
