package Task_04;

import java.util.Scanner;

public class SumNotForEqual {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ievadiet 3 skaitļus");

		System.out.print("Ievadiet pirmo skaitļi:");
		int a = input.nextInt();
		System.out.print("Ievadiet otro skaitļi:");
		int b = input.nextInt();
		System.out.print("Ievadiet trešo skaitļi:");
		int c = input.nextInt();

// Aizveru ievadi
		input.close();

		int sum = (a + b + c);

		if (a == b) {
			System.out.println(sum - a - b);

		}
//ja nebūs shis tad kāds nakamais tikai tiks izvadīts

		else if (a == c) {
			System.out.println(sum - a - c);
		}

		else if (b == c) {
			System.out.println(sum - b - c);

		} else if (a == b && b == c) {
			System.out.println(0);

		} else {
			System.out.println("Skaitļu summa: " + sum);
		}

	}
}
