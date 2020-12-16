
package Task_13;

public class TwoAndPositiveSum {

	public static void main(String[] args) {

		for (int i = 10; i <= 99; i++) {

			int b = i % 10;
			int a = (i - b) / 10;

			System.out.println(i + ", " + a + "+" + b + "=" + (a + b));
		}
	}
}
