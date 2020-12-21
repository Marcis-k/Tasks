package Task_14;

public class Division3ToFizz {

	public static void main(String[] args) {

		// int[] numbers = { 1,2, 3, 5, 8, 30, 15, 12, 7 };

		String[] number = { "1", "2", "3", "5", "8", "30", "15", "12", "7" };

		int[] numbers = new int[number.length]; // sagatavo parveidei

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(number[i]); // parveido no string to int
		}
		System.out.print("[");
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 5 == 0 && numbers[i] % 3 == 0) {
				System.out.print("\"FizzBuzz\"" + ",");
			} else if (numbers[i] % 5 == 0) {
				System.out.print("\"buzz\"" + ",");
			} else if (numbers[i] % 3 == 0) {
				System.out.print("\"fizz\"" + ",");
			} else {
				System.out.print("\"" + number[i] + "\","); // Nosledzoso komatu tā ari nezninu ka nonemt :(
			}

		}
		System.out.print("]");
	}
}
