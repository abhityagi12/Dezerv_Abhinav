package com.fluxkart.fluxkartbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fluxkart.fluxkartbackend")
public class FluxkartBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxkartBackendApplication.class, args);
	}

}
