package Task_28;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		int[] list = { 1, 3, 5, 2 };
		 //String[] list = {"AB","CDE","FEG"};
		
		System.out.println("Neapgriests masīvs: "+Arrays.toString(list));

		reversee(list);

	}

	static void reversee(int a[]) {
		int n = a.length;
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.print("Pretējs masīvs: ");
		for (k = 0; k < n; k++) {
			System.out.print(a[k] + ",");
		}
	}

	static void reversee(String myArray[]) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Pretējs masīvs: " + Arrays.toString(myArray));
	}
}
