package by.htp.flowers.run;

import java.util.Scanner;

import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.Flower;
import by.htp.flowers.emtty.NonLivingFlower;

public class FlowerFind {
	Scanner sc = new Scanner(System.in);

	private int min;
	private int max;
	private Bouquet bou;

	public FlowerFind(Bouquet bou) {
		this.bou = bou;
	}

	public void flowerfind() {
		System.out.println("От какой длины искать цветы?:");
		min = sc.nextInt();
		System.out.println("До какой длины искать цветы?:");
		max = sc.nextInt();
		System.out.println("Результаты поиска:");

		for (int i = 0; i < bou.getBouquet().length; i++) {
			if ((bou.getBouquet()[i].getClass().getSimpleName()).equals("AliveFlower")) {

				if ((((AliveFlower) (bou.getBouquet()[i])).getLength() >= min)
						&& ((AliveFlower) (bou.getBouquet()[i])).getLength() <= max) {
					System.out.println(bou.getBouquet()[i]);
				}
			}

			if ((bou.getBouquet()[i].getClass().getSimpleName().equals("NonLivingFlower"))) {

				if ((((NonLivingFlower) (bou.getBouquet()[i])).getLength() >= min)
						&& (((NonLivingFlower) (bou.getBouquet()[i])).getLength() <= max)) {
					System.out.println(bou.getBouquet()[i]);
				}
			}
		}
	}
}