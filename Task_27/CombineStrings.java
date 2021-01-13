package Task_27;

public class CombineStrings {

	public static void main(String[] args) {
		String[] list = { "A", "B" };
		// String[] list = {"C","D","E"};
		// String[] list = {"C","D","E","A"};

		System.out.print(combine(list));

	}

	public static char combine(String[] a) {
		int i = 0;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		return (char) i;

	}

}
