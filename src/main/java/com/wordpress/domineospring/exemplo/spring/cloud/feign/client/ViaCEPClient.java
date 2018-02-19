package com.wordpress.domineospring.exemplo.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wordpress.domineospring.exemplo.spring.cloud.feign.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}
