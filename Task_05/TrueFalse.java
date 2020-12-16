package Task_05;

import java.util.Scanner;

public class TrueFalse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ievadiet jebkuru skaitli:");
		int x = input.nextInt();

		input.close();

		// Pēc piemēra 100 neietilpst

		if ((x >= 50 && x <= 99)) {
			System.out.println("Skaitlis ir robežas 50 - 99");
		} else {
			System.out.println("Skaitlis nav robežās 50 - 99");
		}
	}
}
