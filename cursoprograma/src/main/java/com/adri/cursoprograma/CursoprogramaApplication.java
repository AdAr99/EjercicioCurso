package com.adri.cursoprograma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.adri.controller", "com.adri.service"})
public class CursoprogramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoprogramaApplication.class, args);
	}

}
