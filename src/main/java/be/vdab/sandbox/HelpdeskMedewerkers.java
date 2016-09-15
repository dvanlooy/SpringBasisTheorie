package be.vdab.sandbox;

import java.util.Map;

class HelpdeskMedewerkers {
	private final Map<String, Integer> medewerkers;
	// key = naam medewerker, value=intern telefoonnummer
	
	public HelpdeskMedewerkers(Map<String, Integer> medewerkers) {
		this.medewerkers = medewerkers;
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}
}