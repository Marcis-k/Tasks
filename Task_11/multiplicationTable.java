
package Task_11;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ievadiet skaitli: ");
		int x = input.nextInt();

		input.close();

		for (int i = 0; i <= x; i++) {
			if (x >= 0) {
				System.out.println(x + " x " + i + " = " + (x * i));
			}
		}
		if (x <= -1) {
			System.out.println("Reizinot ar negatīvu skaitli, rezultēts vienmēr būss 0");
		}
	}
}
