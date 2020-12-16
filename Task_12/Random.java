package Task_12;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("I have chosen number between 1 and 10, try to guess it.");

		System.out.println("What's your number?");
		int x;

		int randonNum = (int) (Math.random() * 11);

		do {
			x = input.nextInt();

			// System.out.print(randonNum); //Lai redzetu kas par skaitli tur slēpjas
			if (x == randonNum)
				System.out.println("Correct, the number was " + x);
			else
				System.out.println("Nop, try again.");
		} while (x != randonNum);

		input.close();
	}
}
