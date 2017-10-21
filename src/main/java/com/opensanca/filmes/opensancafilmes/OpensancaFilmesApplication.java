package com.opensanca.filmes.opensancafilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class OpensancaFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpensancaFilmesApplication.class, args);
	}
}
