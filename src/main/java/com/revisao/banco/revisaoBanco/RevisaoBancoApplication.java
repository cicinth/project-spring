package com.revisao.banco.revisaoBanco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RevisaoBancoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RevisaoBancoApplication.class, args);
	}
}
