package com.prueba.tecnica.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.prueba.tecnica.demo")
@EnableJpaRepositories("com.prueba.tecnica.demo.persistencia")
@EntityScan("com.prueba.tecnica.demo.persistencia.entidades")
public class PruebaTecnicaApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}
}
