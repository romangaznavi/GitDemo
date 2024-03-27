package arrays;
import java.util.*;
public class ArrayDiagonalSum {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r = sn.nextInt();
		System.out.println("Enter the number of columns ");
		int c = sn.nextInt();
		Integer [][] ob = new Integer[r][c];
		System.out.println("Enter the number elements ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				ob[i][j] = new Integer(sn.nextInt());
			}
		}
		int sum = 0;
		System.out.println("\n======DisplayingData======");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(ob[i][j]+ " ");
				if(i == j) {
					sum += ob[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("\n======Diagonal Sum of Elements=======");
		System.out.println("sum of diagonal elements " +sum);
	}

}
