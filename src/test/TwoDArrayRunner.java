package test;
import java.util.*;
public class TwoDArrayRunner {


	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r = sn.nextInt();
		System.out.println("Enter the number of columns ");
		int c = sn.nextInt();
		Integer ob[][] = new Integer[r][c];	
		System.out.println("======Enter the Integer elemenets=====");
		for(int i=0; i<r; i++) {
			for(int j = 0; j < c; j++) {
				ob[i][j] = new Integer(sn.nextInt());
			}
		}
		System.out.println("******Display Data******");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(ob[i][j].toString()+ " ");
			}//inner loop
			System.out.println();
		}// outer loop
		sn.close();
	}

}
