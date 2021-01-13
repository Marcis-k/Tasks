package Task_24;

import java.util.Arrays;
import java.util.Scanner;

public class InputEliminate {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.print("Ievadiet 3 butus:");
//		String x = input.next().toUpperCase();
	

//		input.close();

		String x = "CDE";

		String[] list = { "ABC", "CDE", "EFG", "CDE", "ANC" };
		System.out.println("Sākotnējais saraksts:");
		System.out.println(Arrays.toString(list));

		System.out.println();
		System.out.println("Unikālais saraksts:");
		findUn(list, x);

	}

	public static void findUn(String[] a, String x) {
		for (int i = 0; i < a.length; i++) {
			boolean isUnique = true;
			if (a[i] == x) {
				isUnique = false;
			}
			if (isUnique) {
				System.out.print(a[i] + " ");
			}
		}

	}
}
