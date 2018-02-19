package com.wordpress.domineospring.exemplo.spring.cloud.feign.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.wordpress.domineospring.exemplo.spring.cloud.feign.model.Endereco;

@Component
public class ViaCEPClient {

	public Endereco buscaEnderecoPor(String cep) {
		RestTemplate template = new RestTemplate();
		return template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
	}

}
