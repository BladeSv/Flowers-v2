package by.htp.flowers.emtty;

public class Bouquet {
	private String name;
	private double price;
	private int numFlo;
	private int numAcc;

	partsBouquet[] bouquet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public double getPrice() {
		this.price = 0;
		for (partsBouquet bor : bouquet) {
			this.price = this.price + bor.getPrice();
		}
		return this.price;
	}

	public partsBouquet[] getBouquet() {
		return bouquet;
	}

	public void setBouquet(partsBouquet[] bouquet) {
		this.bouquet = bouquet;
	}

	public void setNumFlo(int numFlo) {
		this.numFlo = numFlo;
	}

	public int getNumFlo() {
		return numFlo;
	}

	public void setNumAcc(int numAcc) {
		this.numAcc = numAcc;
	}

	public int getNumAcc() {
		return numAcc;
	}
}
