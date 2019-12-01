package com.HMHDP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.HMHDP.constants.ApplicationProperties;

@SpringBootApplication
public class HospitalHelpDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalHelpDeskApplication.class, args);
	}
	
	@Bean
	public ApplicationProperties properties() {
		return new ApplicationProperties();
	}


}
