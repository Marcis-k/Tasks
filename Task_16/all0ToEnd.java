package Task_16;

public class all0ToEnd {

	public static void main(String[] args) {
		int[] num = { 0, 4, 0, 7, 8, 9, 0, 1 };

		int count = 0;

		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {					//Pārbīda visus kas nav 0 un prieksu
				num[count++] = num[i];
			}
		}
		while (count < num.length) {			//Saliek visas 0 uz aizmuguri
			num[count++] = 0;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.print("]");
	}
}
