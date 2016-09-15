package be.vdab.sandbox;

class Teller {
	private int teller;

	public Teller() {
		System.out.println("Teller constructor, teller is " + teller);
	}

	public void verhoog() {
		++teller;
		System.out.println("teller is verhoogd tot " + teller);
	}
}