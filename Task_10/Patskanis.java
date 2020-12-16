package Task_10;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Patskanis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Ievadiet burtu:");
		String x = input.next();

		input.close();

		String[] patskani = { "a", "ā", "e", "ē", "i", "ī", "u", "ū", "o" };
		String[] divskani = { "ai", "au", "ie", "ei", "eu", "ui", "iu", "o", "oi", "ou" };
		String[] lidzskani = { "b", "c", "č", "d", "f", "g", "ģ", "h", "j", "k", "ķ", "l", "ļ", "m", "n", "ņ", "p", "r",
				"s", "š", "t", "v", "z", "ž" };

		List<String> patListList = Arrays.asList(patskani);
		List<String> divskaniList = Arrays.asList(divskani);
		List<String> lidzskaniList = Arrays.asList(lidzskani);

		while (patListList.contains(x)) {
			System.out.println(x + " ir patskanis");
			break;
		}
		while (divskaniList.contains(x)) {
			System.out.println(x + " ir divskanis");
			break;
		}
		while (lidzskaniList.contains(x)) {
			System.out.println(x + " ir līdzskanis");
			break;
		}
	}
}
