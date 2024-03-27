package test;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter rows ");
		int r = sn.nextInt();
		System.out.println("Enter columns ");
		int c = sn.nextInt();
		Integer ob[][] = new Integer[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				ob[i][j] = new Integer(sn.nextInt());
			}
		}
	}

}
