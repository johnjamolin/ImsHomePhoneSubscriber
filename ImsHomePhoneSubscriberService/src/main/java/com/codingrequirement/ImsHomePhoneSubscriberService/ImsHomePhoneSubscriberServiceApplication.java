package com.codingrequirement.ImsHomePhoneSubscriberService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ImsHomePhoneSubscriberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsHomePhoneSubscriberServiceApplication.class, args);
	}
	

}
