package by.htp.flowers.run;

import java.util.Scanner;



import by.htp.flowers.emtty.Bouquet;


public class MainMenu {
	Scanner sc = new Scanner(System.in);
	private int index;
	private Bouquet bouquet;

	public void mainMenu() {
		do {
			System.out.println();
			System.out.println("���� ������������ ��������� ������� �������-�������");
			System.out.println("������ ���� �������:");
			System.out.println("____________________________________________________");
			System.out.println("1. ������� ����� ����� �����");
			if (bouquet != null) {
				System.out.println("2. ������������� ����� �� ��������");
				System.out.println("3. ������� ������ ������ ������� �� � ��");
				System.out.println("4. ������� ������ ������ �� �����");
				System.out.println("5. ��������� ����� � �����");
			}
			System.out.println("6. ��������� ����� �� �����");
			System.out.println("7. �����");
			index = Integer.parseInt(sc.nextLine());
			switch (index) {
			case 1:
				bouquet = new CreateBouquet().createBouquet();
				break;
			case 2:
				new DaySort(bouquet).daySort();
				break;
			case 3:
				new FlowerFind(bouquet).flowerfind();
				break;
			case 4:
				new Output(bouquet).output();
				break;

			case 5:
				new InFile(bouquet).writeFile();
				break;
			case 6:

				bouquet = new OutFile().outFile();
				System.out.println();
				break;

			case 7:

				System.out.println("�� ����� ������ �����?(y)");
				if ("y".equals(sc.nextLine())) {
					System.exit(0);
				}
			}

		} while (true);
	}

}
