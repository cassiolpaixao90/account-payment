package br.com.cassiopaixao.account.payment.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.cassiopaixao.account.payment.api.config.property.AccountPaymentApiApplication;

@SpringBootApplication
@EnableConfigurationProperties(AccountPaymentApiApplication.class)
public class AccountPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountPaymentApplication.class, args);
	}
}
