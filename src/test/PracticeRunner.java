package test;
import java.util.*;

import maccess.Practice;
import maccess.*;
public class PracticeRunner {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n = Integer.parseInt(sn.nextLine());
		Practice ob[] = new Practice[n];
		System.out.println("Enter "+n+" Employee Details ");
		for(int i = 0; i <ob.length; i++) {
			System.out.println("****EmployeeDetails" +(i+1)+"*****");
			ob[i] = new Practice();
			
			System.out.println("Enter EmpID ");
			ob[i].id = sn.nextLine();
			 
			System.out.println("Enter EmpName ");
			ob[i].name = sn.nextLine();
			
			System.out.println("Enter EmpDesig ");
			ob[i].desg = sn.nextLine();
			
			System.out.println("Enter EmpSal ");
			ob[i].bSal = Integer.parseInt(sn.nextLine());
			if(ob[i].bSal < 1200) {
				System.out.println("Invalid Salary...");
				//i--;
				continue;
			}
			ob[i].totSal = ob[i].bSal+(0.93F*ob[i].bSal)+(0.63F*ob[i].bSal);
		}
		System.out.println("******EmpDetails******");
		for(Practice k: ob) {
			System.out.println(k.toString());
		}
	}

}
