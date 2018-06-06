package by.htp.flowers.run;

import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.ParkingPaper;

public class Output {

	private Bouquet bou;

	public Output(Bouquet bou) {
		this.bou = bou;
	}

	public void output() {

		System.out.println();
		System.out.println("����� " + bou.getName() + " ������� ��:");
		for (int i = 0; i < (bou.getBouquet().length); i++) {
			System.out.print("" + (i + 1) + ". ");
			System.out.println(bou.getBouquet()[i]);
		}
		System.out.println();
		System.out.println("����� ��������� ������=" + String.format("%.3f", bou.getPrice()));
	}
}
