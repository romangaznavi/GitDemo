package practiceMaccess;
import java.util.*;
public class MultipleDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = Integer.parseInt(s.nextLine());
		String a[] = new String[n];
		System.out.println("Enter "+n+" string elements");
		for(int i = 0; i <a.length; i++) {
			a[i] = new String(s.nextLine());
		}//end of loop
		System.out.println("====Display using old for loop=====");
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i].toString()+" ");
		}// end of loop
		System.out.println("\n======Display using extende for loop=======");
		for(String k:a) {
			System.out.print(k.toString() +" ");
		}
		s.close();
	}

}
