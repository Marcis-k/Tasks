
package Task_23;

import java.util.Arrays;

public class CopyUnique {

	public static void main(String[] args) {

		int[] list = { 1, 5, 4, 2, 3, 1, 5, 2, 3, 1 };
		System.out.println("Sākotnējais saraksts:");
		System.out.println(Arrays.toString(list));

		System.out.println();

		System.out.println("Unikālais saraksts:");
		findUn(list);

	}

	public static void findUn(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean isUnique = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
