package by.htp.flowers.run;

import java.util.Scanner;

import by.htp.flowers.emtty.Accessory;
import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.Flower;
import by.htp.flowers.emtty.NonLivingFlower;
import by.htp.flowers.emtty.ParkingPaper;
import by.htp.flowers.emtty.Tape;
import by.htp.flowers.emtty.partsBouquet;

public class CreateBouquet {
	private int bouquetInd;
	Scanner sc = new Scanner(System.in);

	public Bouquet createBouquet() {
		System.out.println("���������� ������ �� � ����� ������ ���������� �����.");
		System.out.println("��� �������� ������ ������ ������:");
		Bouquet bouquet = new Bouquet();
		bouquet.setName(sc.nextLine());
		System.out.println();
		System.out.println("������� ����� ������ � ����� ������?");
		bouquet.setNumFlo(Integer.parseInt(sc.nextLine()));

		Flower[] ArrayFlo = new Flower[bouquet.getNumFlo()];
		for (int i = 0; i < bouquet.getNumFlo(); i++) {
			createFlower(ArrayFlo, i);
		}
		System.out.println();
		System.out.println("������� ����� ����������� � ����� ������?");
		bouquet.setNumAcc(Integer.parseInt(sc.nextLine()));
		Accessory ArrayAcc[] = new Accessory[bouquet.getNumAcc()];
		for (int i = 0; i < bouquet.getNumAcc(); i++) {
			createAccessory(ArrayAcc, i);
		}

		partsBouquet[] partsBouquet = new partsBouquet[bouquet.getNumAcc() + bouquet.getNumFlo()];
		bouquet.setBouquet(partsBouquet);
		// new DaySort(ArrayFlo).daySort();

		for (Flower flo : ArrayFlo) {
			partsBouquet[bouquetInd] = flo;
			bouquetInd++;

		}
		for (Accessory Acc : ArrayAcc) {
			partsBouquet[bouquetInd] = Acc;
			bouquetInd++;
		}

		return bouquet;

	}

	public void createFlower(Flower[] ArrayFlo, int index) {

		int chose;
		while (true) {
			System.out.println("��������� ����� ����� ������ �" + (index + 1) + " � ������?");
			System.out.println("1. ������");
			System.out.println("2. �������������");
			System.out.println("3. ���������");
			chose = Integer.parseInt(sc.nextLine());
			if (chose == 2 || chose == 1 || chose == 3)
				break;
		}
		if (chose == 3) {
			createRandomFlower(ArrayFlo, index);
		} else {
			if (chose == 1) {
				ArrayFlo[index] = new AliveFlower();
				System.out.println("������� �������� ������ �" + (index + 1) + " � ������");
				((AliveFlower) ArrayFlo[index]).setName(sc.nextLine());
				System.out.println();
				System.out.println("������� ��������� ������ �" + (index + 1) + " � ������");
				((AliveFlower) ArrayFlo[index]).setPrice(Double.parseDouble(sc.nextLine()));
				System.out.println("������� ���� ������ ������ �" + (index + 1) + " � ������");
				((AliveFlower) ArrayFlo[index]).setColor(sc.nextLine());
				System.out.println("�������  ����� ������ �" + (index + 1) + " � ������");
				((AliveFlower) ArrayFlo[index]).setLength(Integer.parseInt(sc.nextLine()));
				System.out.println("������� ���� ����� ������ �" + (index + 1) + " � ������ �������?");
				((AliveFlower) ArrayFlo[index]).setCutDay(Integer.parseInt(sc.nextLine()));
			} else {
				ArrayFlo[index] = new NonLivingFlower();
				System.out.println("������� �������� ������ �" + (index + 1) + " � ������");
				((NonLivingFlower) ArrayFlo[index]).setName(sc.nextLine());
				System.out.println("������� ��������� ������ �" + (index + 1) + " � ������");
				((NonLivingFlower) ArrayFlo[index]).setPrice(Double.parseDouble(sc.nextLine()));
				System.out.println("������� ���� ������ ������ �" + (index + 1) + " � ������");
				((NonLivingFlower) ArrayFlo[index]).setColor((sc.nextLine()));
				System.out.println("�������  ����� ������ �" + (index + 1) + " � ������");
				((NonLivingFlower) ArrayFlo[index]).setLength(Integer.parseInt(sc.nextLine()));
				System.out.println("������� ���� ����� ������ �" + (index + 1) + " � ������ �������?");
				((NonLivingFlower) ArrayFlo[index]).setProdactionDay(Integer.parseInt(sc.nextLine()));
				System.out.println("�� ������ ��������� ������ �" + (index + 1) + " � ������ ������?");
				((NonLivingFlower) ArrayFlo[index]).setMaterial(sc.nextLine());
			}

		}
	}

	public void createAccessory(Accessory[] ArrayAcc, int index) {
		int chose;
		while (true) {
			System.out.println("��������� ����� ����� ��������� �" + (index + 1) + " � ������?");
			System.out.println("1. ����������� ������");
			System.out.println("2. ������� �����");
			System.out.println("3. ���������");
			chose = Integer.parseInt(sc.nextLine());
			if (chose == 2 || chose == 1 || chose == 3)
				break;
		}

		if (chose == 3) {
			createRandomAccessory(ArrayAcc, index);
		} else {
			if (chose == 1) {
				ArrayAcc[index] = new ParkingPaper();
				System.out.println("������� �������� ���������� �" + (index + 1) + " � ������");
				((ParkingPaper) ArrayAcc[index]).setName(sc.nextLine());
				System.out.println("������� ��������� ���������� �" + (index + 1) + " � ������");
				((ParkingPaper) ArrayAcc[index]).setPrice(Double.parseDouble(sc.nextLine()));
				System.out.println("������� ���� ���������� �" + (index + 1) + " � ������");
				((ParkingPaper) ArrayAcc[index]).setColor(sc.nextLine());

				System.out.println("����������� ������ ��������� �" + (index + 1) + " ����� �� ������� �����:");
				((ParkingPaper) ArrayAcc[index]).setSize(Integer.parseInt(sc.nextLine()));
			} else {
				ArrayAcc[index] = new Tape();
				System.out.println("������� �������� ���������� �" + (index + 1) + " � ������");
				((Tape) ArrayAcc[index]).setName(sc.nextLine());
				System.out.println("������� ��������� ���������� �" + (index + 1) + " � ������");
				((Tape) ArrayAcc[index]).setPrice(Double.parseDouble(sc.nextLine()));
				System.out.println("������� ���� ���������� �" + (index + 1) + " � ������");
				((Tape) ArrayAcc[index]).setColor(sc.nextLine());

				System.out.println("������� ����� ��������� �" + (index + 1) + " �� ����� �����:");
				((Tape) ArrayAcc[index]).setLength(Integer.parseInt(sc.nextLine()));

			}

		}

	}

	{
	}

	public void createRandomFlower(Flower[] ArrayFlo, int index) {
		switch ((int) Math.round(Math.random())) {
		case 0:
			AliveFlower aliveFlower = new AliveFlower();
			aliveFlower.setName("AliveFlower" + (index + 1));
			aliveFlower.setPrice((Math.random() * 10));
			aliveFlower.setColor("color" + index);
			aliveFlower.setLength((int) (Math.random() * 60));
			aliveFlower.setCutDay((int) (Math.random() * 20));
			ArrayFlo[index] = aliveFlower;

			System.out.println(aliveFlower);
			break;
		case 1:
			NonLivingFlower nonLivingFlower = new NonLivingFlower();
			nonLivingFlower.setName("nonLivingFlower" + (index + 1));
			nonLivingFlower.setPrice((Math.random() * 10));
			nonLivingFlower.setColor("color" + index);
			nonLivingFlower.setLength((int) (Math.random() * 60));
			nonLivingFlower.setProdactionDay((int) (Math.random() * 20));
			nonLivingFlower.setMaterial("Carbon" + index);
			ArrayFlo[index] = nonLivingFlower;
			System.out.println(nonLivingFlower);
			break;
		}
	}

	public void createRandomAccessory(Accessory[] ArrayAcc, int index) {

		switch ((int) Math.round(Math.random())) {
		case 0:
			ParkingPaper paper = new ParkingPaper();
			paper.setName("ParkingPaper" + (index + 1));
			paper.setColor("color" + index);
			paper.setSize(5 + index);
			paper.setPrice((Math.random() * 10));
			ArrayAcc[index] = paper;
			System.out.println(paper.toString());
			break;

		case 1:
			Tape tape = new Tape();
			tape.setName("Tape" + (index + 1));
			tape.setColor("color" + index);
			tape.setPrice((Math.random() * 10));
			tape.setLength((int) (Math.random() * 10));

			ArrayAcc[index] = tape;
			System.out.println(tape.toString());
			break;

		}

	}

}
