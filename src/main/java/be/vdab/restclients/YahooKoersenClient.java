package be.vdab.restclients;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("Yahoo")
class YahooKoersenClient implements KoersenClient {
	private final URL url;

	// public YahooKoersenClient(URL url) {
	// this.url = url;
	// }

	YahooKoersenClient(
//			@Value("${yahooKoersenURL}") 
			URL url) { 
		this.url = url;
		}

	@Override
	public BigDecimal getDollarKoers() {
		try (Scanner scanner = new Scanner(url.openStream())) {
			return new BigDecimal(scanner.nextLine());
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
