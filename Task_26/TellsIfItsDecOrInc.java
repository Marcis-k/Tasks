package Task_26;

public class TellsIfItsDecOrInc {

	public static void main(String[] args) {
		int[] xx = { 1, 2, 3, 5, 11 }; // Increasing
		// int[] xx = {9,7,5,2,1}; //Decreasing
		// int[] xx = {1,7,3,5,11}; //Not increasing, not decreasing

		if (isIncreasing(xx)) {
			System.out.print("Increasing");

		} else if (isDec(xx)) {
			System.out.print("Decreasing");
		} else {
			System.out.print("Not increasing, not decreasing");
		}
	}
	public static boolean isIncreasing(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i])
				return false;
		}
		return true;
	}
	public static boolean isDec(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i])
				return false;
		}
		return true;
	}
}
