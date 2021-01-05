
package Task_21;

import java.util.Arrays;

public class togetherAndIn3rdGrade {

	public static void main(String[] args) {

		int[] list1 = { 1, 5, 6, 4 };
		int[] list2 = { 2, 3 };

		int list11 = list1.length;
		int list22 = list2.length;

		int[] result = new int[list11 + list22];

		System.arraycopy(list1, 0, result, 0, list11); // panem list1 in sak no result 0 pozicijas
		System.arraycopy(list2, 0, result, list11, list22); // panem list2 un sak no result kur beidzas list1
		System.out.println("Apvienoti saraksti: " + Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			result[i] = result[i] * result[i] * result[i];

			System.out.print(result[i] + ", ");
		}

	}

}
