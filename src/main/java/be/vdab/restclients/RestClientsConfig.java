package be.vdab.restclients;

import java.net.URL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {
	
	@Bean
	@Qualifier("ECB")
	ECBKoersenClient ecbKoersenClient(@Value("${ecbKoersenURL}") URL url) {
	return new ECBKoersenClient(url);
	}
	@Bean
	@Qualifier("Yahoo")
	YahooKoersenClient yahooKoersenClient(@Value("${yahooKoersenURL}") URL url) {
	return new YahooKoersenClient(url);
	}

}
