package com.wordpress.domineospring.exemplo.spring.cloud.feign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.wordpress.domineospring.exemplo.spring.cloud.feign.client.ViaCEPClient;
import com.wordpress.domineospring.exemplo.spring.cloud.feign.model.Endereco;

@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(ViaCEPClient client) {

		return args -> {
			if (args.length > 0) {
				String cep = args[0];

				Endereco endereco = client.buscaEnderecoPor(cep);

				System.out.println(endereco);
			}
		};

	}
}
