package practiceMaccess;

import java.util.*;

public class SingleDArray {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter +n+" + "integer elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=  new Integer(s.nextInt()); // Adding object to array
		} // end of loop
		System.out.println("=====Displaying using old for loop======");
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i].toString()+" ");
		}
		System.out.println("\n========Display using extended for loop=======");
		for(Integer k: a) {
			System.out.print(k.toString()+" ");
		}
		s.close();
	}

}
