package maccess;
import java.util.*;
import test.*;
//WAP to display user defined employee details.
public class DemoArray3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = Integer.parseInt(sn.nextLine());
		Employee ob[] = new Employee[n];
		System.out.println("Enter "+n+" employee details ");
		for(int i = 0; i < ob.length; i++) {
			System.out.println("****EmployeeDetails - "+(i+1)+"****");
			ob[i] = new Employee();
			System.out.println("Enter the employee id ");
			ob[i].id = sn.nextLine();
			System.out.println("Enter employee name ");
			ob[i].name = sn.nextLine();
			System.out.println("Enter employee Desgination ");
			ob[i].desg = sn.nextLine();
			System.out.println("Enter employee basic Salary ");
			ob[i].bSal = Integer.parseInt(sn.nextLine());
			if(ob[i].bSal < 12000) {
				System.out.println("Invalid bSal....");
				i--;
				continue; //skip the below line
			}
			ob[i].totSal = ob[i].bSal+(0.93F*ob[i].bSal)+(0.63F*ob[i].bSal);
		}
		System.out.println("======Employee Details======");
		for(Employee k: ob) {
			System.out.println(k.toString());
		}
		sn.close();
	}

}
