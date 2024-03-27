package test;
import java.util.*;
import maccess.*;
public class StudentRunner {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n = Integer.parseInt(sn.nextLine());
		Student ob[] = new Student[n];
		
		System.out.println("========StudentDetails "+n+"=======");
		
		for(int i = 0; i < ob.length; i++) {
			System.out.println("=====Student Details "+(i+1)+"======");
			ob[i] = new Student();
			System.out.println("Enter the student name ");
			ob[i].name = sn.nextLine();
			System.out.println("Enter the rollNo");
			ob[i].rollNo = sn.nextLine();
			
		}
		
	}

}
