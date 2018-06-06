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
			System.out.println("Тебя приветствует цветочный магазин Налетай-Покупай");
			System.out.println("Выбери один пунктов:");
			System.out.println("____________________________________________________");
			System.out.println("1. Создать букет новый букет");
			if (bouquet != null) {
				System.out.println("2. Отсортировать букет по свежести");
				System.out.println("3. Вывести список цветов длинной от и до");
				System.out.println("4. Вывести состав букета на экран");
				System.out.println("5. Сохранить букет в файле");
			}
			System.out.println("6. Загрузить букет из файла");
			System.out.println("7. Выйти");
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

				System.out.println("Вы точно хотите выйти?(y)");
				if ("y".equals(sc.nextLine())) {
					System.exit(0);
				}
			}

		} while (true);
	}

}
