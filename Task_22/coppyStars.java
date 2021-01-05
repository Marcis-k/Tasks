package Task_22;

import java.util.Arrays;

public class coppyStars {

	public static void main(String[] args) {

		String[] list = { "this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer" };

		String[] result = Arrays.copyOf(list, list.length);

		for (int i = 0; i < result.length; i++) {

			if (result[i].length() == 4) {
				System.out.print("\"****\"" + "," + "\"" + result[i] + "\"" + ",");
			} else {
				System.out.print("\"" + result[i] + "\"" + ",");
			}

		}

	}

}
