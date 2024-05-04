package com.cd.cd_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CdWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdWebApplication.class, args);
	}

}
