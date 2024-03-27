package test;
import java.util.Scanner;
import maccess.StudentDetails;

public class StudentMainClass {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n = Integer.parseInt(sn.nextLine());
		StudentDetails ob[] = new StudentDetails[n];
		System.out.println("****Details of "+n+" students*****");
		for(int i = 0; i < ob.length; i++) {
			System.out.println("****StudentDetails "+(i+1)+"*****");
			ob[i] = new StudentDetails();
			System.out.println("Enter student name ");
			ob[i].name = sn.nextLine();
			
			System.out.println("Enter student branch ");
			ob[i].branch = sn.nextLine();
			
			System.out.println("Enter student rollNo ");
			ob[i].rollNo = sn.nextLine();
			
			System.out.println("Enter First subject mark ");
			ob[i].s1 = Integer.parseInt(sn.nextLine());
			if(ob[i].s1 < 0 || ob[i].s1 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			System.out.println("Enter Second subject mark ");
			ob[i].s2 = Integer.parseInt(sn.nextLine());
			if(ob[i].s2 < 0 || ob[i].s2 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			System.out.println("Enter Third subject mark ");
			ob[i].s3 = Integer.parseInt(sn.nextLine());
			if(ob[i].s3 < 0 || ob[i].s3 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			System.out.println("Enter Fourth subject mark ");
			ob[i].s4 = Integer.parseInt(sn.nextLine());
			if(ob[i].s4 < 0 || ob[i].s4 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			System.out.println("Enter Fifth subject mark ");
			ob[i].s5 = Integer.parseInt(sn.nextLine());
			if(ob[i].s5 < 0 || ob[i].s5 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			System.out.println("Enter Sixth subject mark ");
			ob[i].s6 = Integer.parseInt(sn.nextLine());
			if(ob[i].s6 < 0 || ob[i].s6 >100) {
				System.out.println("Invalid Mark...");
				i--;
				continue;
			}
			
			ob[i].totalMarks = ob[i].s1+ob[i].s2+ob[i].s3+ob[i].s4+ob[i].s5+ob[i].s6;
			ob[i].per = ob[i].totalMarks/6;
			ob[i].result = ob[i].per;
			
			if(ob[i].result >= 70 && ob[i].result <= 100) {
				System.out.println("Distinction "+ob[i].result);
			} else if(ob[i].result >= 60 && ob[i].result < 70) {
				System.out.println("First Class ");
			} else if(ob[i].result >= 50 && ob[i].result < 60) {
				System.out.println("Second class ");
			} else if(ob[i].result >= 40 && ob[i].result < 50) {
				System.out.println("Pass class ");
			} else {
				System.out.println("Faild...");
			}
		}
		System.out.println("************StudentDetails************\n");
		for(StudentDetails sd : ob) {
			System.out.println(sd.toString());
		}
	}

}
