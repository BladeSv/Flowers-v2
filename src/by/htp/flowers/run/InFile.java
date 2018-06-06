package by.htp.flowers.run;

import java.nio.file.Path;
import java.util.Scanner;

import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.NonLivingFlower;
import by.htp.flowers.emtty.ParkingPaper;
import by.htp.flowers.emtty.Tape;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InFile {
	private File file;

	private Bouquet bouquet;

	public InFile(Bouquet bouquet) {
		this.bouquet = bouquet;
	}

	public File checkFile() {
		try {
			File file = new File("BouquetFlower.txt");
			if (!file.exists()) {
				file.createNewFile();

			}

		}

		catch (Exception e) {
			System.out.println("Ошибка проверки файла" + e.getStackTrace());
		}
		return file;
	}

	public void writeFile() {
		try {
			file = checkFile();

			FileWriter fl = new FileWriter("BouquetFlower.txt");
			fl.write(bouquet.getBouquet().length + "\n");
			fl.write(bouquet.getName() + "\n");

			for (int i = 0; i < bouquet.getBouquet().length; i++) {

				if ((bouquet.getBouquet()[i]) instanceof AliveFlower) {
					fl.write(1 + "\n");
					AliveFlower A = (AliveFlower) bouquet.getBouquet()[i];
					fl.write(A.getName() + "\n");
					fl.write(A.getPrice() + "\n");
					fl.write(A.getColor() + "\n");
					fl.write(A.getLength() + "\n");
					fl.write(A.getCutDay() + "\n");

				}
				if ((bouquet.getBouquet()[i]) instanceof NonLivingFlower) {
					fl.write(2 + "\n");
					NonLivingFlower A = (NonLivingFlower) bouquet.getBouquet()[i];
					fl.write(A.getName() + "\n");
					fl.write(A.getPrice() + "\n");
					fl.write(A.getColor() + "\n");
					fl.write(A.getLength() + "\n");
					fl.write(A.getProdactionDay() + "\n");
					fl.write(A.getMaterial() + "\n");
				}

				if ((bouquet.getBouquet()[i]) instanceof ParkingPaper) {
					fl.write(3 + "\n");
					ParkingPaper A = (ParkingPaper) bouquet.getBouquet()[i];
					fl.write(A.getName() + "\n");
					fl.write(A.getPrice() + "\n");
					fl.write(A.getColor() + "\n");
					fl.write(A.getSize() + "\n");

				}
				if ((bouquet.getBouquet()[i]) instanceof Tape) {
					fl.write(4 + "\n");
					Tape A = (Tape) bouquet.getBouquet()[i];
					fl.write(A.getName() + "\n");
					fl.write(A.getPrice() + "\n");
					fl.write(A.getColor() + "\n");
					fl.write(A.getLength() + "\n");

				}

			}
			fl.flush();
			fl.close();
			System.out.println("Букет успешно сохранен в файле.");
			System.out.println();
		} catch (IOException e) {
			System.out.println(e.getStackTrace().toString() + "\nОшибка записи в файл ");
		}

	}
}
