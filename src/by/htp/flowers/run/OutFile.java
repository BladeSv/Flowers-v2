package by.htp.flowers.run;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.NonLivingFlower;
import by.htp.flowers.emtty.ParkingPaper;
import by.htp.flowers.emtty.Tape;
import by.htp.flowers.emtty.partsBouquet;

public class OutFile {

	public void checkFile() {
		try {
			File file = new File("BouquetFlower.txt");
			if (!file.exists()) {
				file.createNewFile();

			}

		}

		catch (Exception e) {
			System.out.println("Ошибка проверки файла" + e.getStackTrace());
		}

	}

	public Bouquet outFile() {
		Bouquet bouquet = new Bouquet();
		try {
			checkFile();
			int index = 0;
			String line;
			FileReader fr = new FileReader("BouquetFlower.txt");
			Scanner sc = new Scanner(fr);

			if (!sc.hasNext()) {
				System.out.println("В файле нет сохраненного букета");
				return null;
			}
			String lol = sc.nextLine();
			System.out.println(lol);
			index = Integer.parseInt(lol);
			partsBouquet[] ArrayPB = new partsBouquet[index];
			bouquet.setBouquet(ArrayPB);
			bouquet.setName(sc.nextLine());

			for (int i = 0; i < index; i++) {

				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					ArrayPB[i] = new AliveFlower();
					((AliveFlower) ArrayPB[i]).setName(sc.nextLine());
					((AliveFlower) ArrayPB[i]).setPrice(Double.parseDouble(sc.nextLine()));
					((AliveFlower) ArrayPB[i]).setColor(sc.nextLine());
					((AliveFlower) ArrayPB[i]).setLength(Integer.parseInt(sc.nextLine()));
					((AliveFlower) ArrayPB[i]).setCutDay(Integer.parseInt(sc.nextLine()));
					break;
				case 2:
					ArrayPB[i] = new NonLivingFlower();

					((NonLivingFlower) ArrayPB[i]).setName(sc.nextLine());

					((NonLivingFlower) ArrayPB[i]).setPrice(Double.parseDouble(sc.nextLine()));

					((NonLivingFlower) ArrayPB[i]).setColor((sc.nextLine()));

					((NonLivingFlower) ArrayPB[i]).setLength(Integer.parseInt(sc.nextLine()));

					((NonLivingFlower) ArrayPB[i]).setProdactionDay(Integer.parseInt(sc.nextLine()));

					((NonLivingFlower) ArrayPB[i]).setMaterial(sc.nextLine());
					break;

				case 3:
					ArrayPB[i] = new ParkingPaper();

					((ParkingPaper) ArrayPB[i]).setName(sc.nextLine());

					((ParkingPaper) ArrayPB[i]).setPrice(Double.parseDouble(sc.nextLine()));

					((ParkingPaper) ArrayPB[i]).setColor(sc.nextLine());

					((ParkingPaper) ArrayPB[i]).setSize(Integer.parseInt(sc.nextLine()));
					break;
				case 4:
					ArrayPB[i] = new Tape();

					((Tape) ArrayPB[i]).setName(sc.nextLine());

					((Tape) ArrayPB[i]).setPrice(Double.parseDouble(sc.nextLine()));

					((Tape) ArrayPB[i]).setColor(sc.nextLine());

					((Tape) ArrayPB[i]).setLength(Integer.parseInt(sc.nextLine()));

				}

			}
		} catch (IOException e) {
			System.out.println(e.getMessage() + "Ошибка считывания букета из файла");
		}
		System.out.println("Загрузка букета из файла завершина.");
		return bouquet;

	}

}
