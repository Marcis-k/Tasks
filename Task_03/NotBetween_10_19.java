package Task_03;

import java.util.Scanner;

public class NotBetween_10_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ievadiet 2 skaitļus!");
		System.out.print("Ievadiet pirmo skaitli:");
		int a = input.nextInt();
		System.out.print("Ievadiet otru skaitli:");
		int b = input.nextInt();

		input.close();
		
		int sum = a + b;

		if (sum >= 10 && sum <= 19) {
			System.out.println(20);

		} else {
			System.out.println("Skaitļu summa ir " + sum);

		}

	}

}
