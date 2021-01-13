
package Task_25;

import java.util.Scanner;

public class SafePasword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ievadiet paroli: ");
		String x = input.next();

		input.close();
		
		// String x = "Abcdefgs";
		// String x = "abfFsaf123";
		System.out.print(valPass(x));

	}

	public static boolean valPass(String x) {
		if (x.length() >= 10) {
			if (isSafe(x)) {
				return true;
			} else {
				return false;
			}
		} else {
			
			return false;
		}

	}

	public static boolean isSafe(String x) {
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean number = false;

		char c;

		for (int i = 0; i < x.length(); i++) {
			c = x.charAt(i);
			if (Character.isUpperCase(c)) {
				hasUpper = true;
			} else if (Character.isLowerCase(c)) {
				hasLower = true;

			} else if (Character.isDigit(c)) {
				number = true;
			}
			if (hasLower && hasUpper && number) {
				return true;
			}

		}

		return false;

	}

}
