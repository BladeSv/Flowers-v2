package by.htp.flowers.run;

import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.Flower;
import by.htp.flowers.emtty.partsBouquet;

public class DaySort {
	private Bouquet bou;

	public DaySort(Bouquet bou) {
		this.bou = bou;
	}

	public void daySort() {

		partsBouquet tepm = new partsBouquet();
		for (int i = 0; i < bou.getBouquet().length; i++) {

			for (int j = 0; j < bou.getBouquet().length; j++) {
				if (bou.getBouquet()[i].getClass().getSimpleName().equals("AliveFlower")) {
					if (bou.getBouquet()[j].getClass().getSimpleName().equals("AliveFlower")) {

						if ((((AliveFlower) bou.getBouquet()[i]).getCutDay()) < (((AliveFlower) bou.getBouquet()[j])
								.getCutDay())) {

							tepm = bou.getBouquet()[j];
							bou.getBouquet()[j] = bou.getBouquet()[i];
							bou.getBouquet()[i] = tepm;
						}
					}

				}
			}
		}

		System.out.println("Сортировка завершина.");
	}

}
