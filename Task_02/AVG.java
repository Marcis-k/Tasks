
package Task_02;

import java.util.Scanner;

public class AVG {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.println("Ievadiet 3 skaitļus!");
		System.out.print("Ievadiet pirmo skaitļi:");
		x = input.nextInt();
		System.out.print("Ievadiet otro skaitļi:");
		y = input.nextInt();
		System.out.print("Ievadiet trešo skaitļi:");
		z = input.nextInt();

		input.close();

		double avg = (x + y + z) / 3f; // f bija jaieliek aiz dalitaja lai nrebutu rezultats .0 bet ja reali piemeram
										// jabuut .666;

		System.out.println("Skaitļu vidējā vērtība ir " + avg);

	}

}
