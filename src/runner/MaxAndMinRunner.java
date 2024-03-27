package runner;

import java.util.Scanner;

import arrays.GreaterValue;
import arrays.SmallestValue;

public class MaxAndMinRunner {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n = sn.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("========Enter "+n+" Integer elements=========");
		for(int i = 0; i < a.length; i++) {
			a[i] = new Integer(sn.nextInt());
			
		}
		System.out.println("===Greater Value===");
		GreaterValue gv = new GreaterValue();
		int gVal = gv.greaterVal(a);
		System.out.println("Greater Value = "+ gVal);
		
		System.out.println("===Smallest Value====");
		SmallestValue sv = new SmallestValue();
		int sVal = sv.smallValue(a);
		System.out.println("Smallest Value = "+ sVal);
		
		
		sn.close();
	}
}
