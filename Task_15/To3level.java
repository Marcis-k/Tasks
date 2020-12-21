package Task_15;

public class To3level {

	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 6, 7 };
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] * num[i] * num[i];
			System.out.print(num[i] + ",");
		}
		System.out.print("]");
	}
}
