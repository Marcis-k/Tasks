package Task_19;

import java.util.Arrays;

public class isItAMagicSquare {

	public static void main(String[] args) {

		int[][] numbers = { // True
				{ 17, 10, 15 }, { 12, 14, 16 }, { 13, 18, 11 } };
//		int[][] numbers = {		//False
//				{5,4,1},
//				{1,9,7},
//				{5,2,8}
//		};

		int row = numbers.length;
		int col = numbers[0].length;
		
		int[] numberDio = new int[numbers.length];
	
		int[] rowSum = new int[3];
		int[] colSum = new int[3];

		
			//Viss kopējais  Lai izvadas uz consoles
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();


		//Rindas un kollonas  izvada summu katrai rindai uz konsoles
		for (int i = 0; i < row; i++) {
			int sumCol = 0; // Lai izdalitu rindas
			int sumRow = 0;
			for (int j = 0; j < col; j++) {
				sumRow += numbers[i][j];
				sumCol += numbers[j][i];		
			}
			System.out.println("Rinda " + (i + 1) + ".: Summa - " + sumRow + " ---------- "
					+ ("Kolonna " + (i + 1) + ".: Summa - " + sumCol));		
			rowSum[i]=sumRow;
			colSum[i]=sumCol;
		}
		
		//Diognles izvada katru locekli un summuw

		System.out.println();
		System.out.print("Diognāle -> ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i][i] + " ");
			numberDio[i] = numbers[i][i];
			
		}
		System.out.println();
		
		int sumOfDiagonal1=0;
        for (int i = 0, j =0; i< row && j < col; i++, j++) {
               sumOfDiagonal1+= numbers[i][j];
               
        }
        System.out.print("Diognāle -> summa: "+sumOfDiagonal1);
		
		
		System.out.println();
		System.out.print("Diognāle <- ");
		for (int j = 0; j< numbers.length; j++) {
			
				System.out.print(numbers[j][numbers.length - j - 1] + " ");
	
		}
		System.out.println();
		int sumOfDiagonal2=0;
         for (int i=0,j=col-1 ; i<row && j>=0 ; i++, j--) {
                sumOfDiagonal2= sumOfDiagonal2 + numbers[i][j];           
         }
		System.out.print("Diognāle -> summa: "+sumOfDiagonal2);
		System.out.println();
		
		
		//Pārbaude vai viss sakrit
		if(Arrays.equals(rowSum, colSum)) {
			if(sumOfDiagonal1==sumOfDiagonal2) {
				System.out.println();
				System.out.print("Masīvs ir maģiskais kvadrāts");
			}		
		}else {
			System.out.println();
			System.out.print("Masīvs nav maģiskais kvadrāts");
		}
	
	}
	
} 
