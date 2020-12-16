package Task_07;

import java.util.Scanner;

public class AllTheNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ievadiet skaitli X:");
		int x = input.nextInt();
		
		input.close();

		System.out.print(x + " -> ");

		if (x > 0) {
			for (int i = 0; i <= x; i++) {
				System.out.print(i + ", ");
			}
		} else {
			for (int i = 0; i >= x; i--) {
				System.out.print(i + ", ");
			}
		}
	}

}
