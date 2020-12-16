package Task_06;

import java.util.Scanner;

public class TextLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ievadiet 2 teksta fragmentus!");
		System.out.print("Pirmais teksta fragments:");
		String x = input.next();

		System.out.print("Otrais teksta fragments:");
		String z = input.next();
		
		input.close();

		if (x.length() > z.length()) {
			System.out.println(z + x + z);

		}
		if (x.length() < z.length()) {
			System.out.println(x + z + x);
		}
		if (x.length() == z.length()) {
			System.out.println(x + z + x);
		}

	}

}
