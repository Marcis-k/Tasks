package Task_08;

import java.util.Scanner;

public class Division23Not5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ievadiet divus skaitļus!");
		System.out.print("Ievadiet pirmo skaitli:");
		int x = input.nextInt();
		System.out.print("Ievadiet otro skaitli:");
		int y = input.nextInt();

		input.close();

		System.out.print("Skaitļi kas atrodas starp " + x + " un " + y + " vienlaikus dalas ar 2 un 3, bet ne ar 5: ");
		for (int i = x; i <= y; i++)

			if (i % 2 == 0 && i % 3 == 0 && i % 5 > 0) {

				System.out.print(i + ", ");

			}
	}

}
