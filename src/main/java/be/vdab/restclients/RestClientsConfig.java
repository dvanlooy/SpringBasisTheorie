package be.vdab.restclients;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {
	@Bean
	KoersenClient koersenClient(@Value("${yahooKoersenURL}") URL yahooURL,@Value("${ecbKoersenURL}") URL ecbURL) {
		try (InputStream stream = yahooURL.openStream()) {
			return new YahooKoersenClient(yahooURL);
		}catch (IOException ex) {
			return new ECBKoersenClient(ecbURL);
		}
	}
}
