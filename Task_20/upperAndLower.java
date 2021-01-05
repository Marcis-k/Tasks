package Task_20;

public class upperAndLower {

	public static void main(String[] args) {

		String[] list = { "aDs", "add", "dd", "eee" };

		for (int i = 0; i < list.length; i++) {

			if (list[i].length() <= 2) {
				System.out.print(list[i] + " ");
			} else {
				System.out.print(list[i].toUpperCase() + " ");
			}
		}
	}
}
