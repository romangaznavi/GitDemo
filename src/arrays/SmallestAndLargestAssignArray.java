package arrays;

import java.util.Scanner;

public class SmallestAndLargestAssignArray {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row = sn.nextInt();
		System.out.println("Enter the number of columns ");
		int col = sn.nextInt();
		Integer[][] ob = new Integer[row][col];
		System.out.println("Enter the numbers for row and column ");

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				ob[i][j] = new Integer(sn.nextInt());
			}
		}
		System.out.println("\n======DisplayingData======");
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ob[i][j]+"  ");
			}
			System.out.println();
		}
		int smallest = ob[0][0];
		System.out.println("\n======Finding Smallest Value======");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < i; j++) {
				if(ob[i][j] < smallest) {
					smallest = ob[i][j];
				}
			}
		}
		System.out.println("\nSmallest Value is : "+ smallest);
		System.out.println("\n======LargestValue======");
		int largest = ob[0][0];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < ob[i].length; j++) {
				if(ob[i][j] > largest) {
					largest = ob[i][j];
				}
			}
		}
		System.out.println("\nLargest values is : "+ largest);
	}

}
