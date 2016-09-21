package be.vdab.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import be.vdab.restclients.KoersenClient;

@Configuration
//@ImportResource("classpath:services.xml")
public class ServicesConfig {
	@Bean
	EuroService euroService(@Qualifier("ECB")KoersenClient koersenClient) {
		return new EuroService(koersenClient);
	}
}
