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
	
//	 @Bean
//	    public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurerAdapter() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/**").allowedOrigins("GET", "POST", "PUT", "DELETE")
//	                        .allowedOrigins("http://localhost:4200");
//	            }
//	        };				
//	    }
}
