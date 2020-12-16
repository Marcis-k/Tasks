package Task_01;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int sum;

		System.out.println("Ievadiet 2 skaitļus!");
		System.out.print("Ievadiet pirmo skaitli:");
		x = input.nextInt();
		System.out.print("Ievadiet otro skaitli:");
		y = input.nextInt();

		input.close();

		sum = x + y;

		System.out.println("Summa ir " + sum);

	}

}
