package Task_18;

import java.text.DecimalFormat;


public class AverageMark {

	public static void main(String[] args) {
		double[][] students = {
				{ 68, 58, 79 }, // Student 1
				{ 79, 76, 81 },// Student 2
		};

		DecimalFormat df = new DecimalFormat("###.##");

		double[] sumArr = new double[students.length];

		for (int i = 0; i < students.length; i++) {

			double sum = 0;
			for (int j = 0; j < students[i].length; j++) {

				sum += students[i][j];

			}

			sumArr[i] += sum / students[i].length;

			System.out.print("Students " + (i + 1) + ": " + df.format(sumArr[i]) + " ");
		}

	}
}

/*
 * for (int i = 0; i < students.length; i++) { // rintas/cik katra rinda
 * elementu System.out.print("Students " + (i + 1) + ": "); //katra studenta
 * kartas numurs jo katrs is sava rinda
 * 
 * for (int j = 0; j < students[i].length; j++) { // kolonnas
 * System.out.print(students[i][j] + " "); } System.out.println(); //ieks i lai
 * katru reiz ejot caurs loop katrs students jauna rinda }
 * 
 */
