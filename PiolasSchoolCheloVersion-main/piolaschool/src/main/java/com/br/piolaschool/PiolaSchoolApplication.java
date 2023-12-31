package com.br.piolaschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }, scanBasePackages = {
		"com.br.piolaschool.entidade" })
@ComponentScan
public class PiolaSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiolaSchoolApplication.class, args);

		System.out.println("Iniciado");
	}

}
