package test;
import java.util.*;
import maccess.BookDetails;
public class BookMainClass {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of books");
		int n = Integer.parseInt(sn.nextLine());
		BookDetails ob[] = new BookDetails[n];
		System.out.println("Enter "+n+" book details");
		for(int i = 0; i < ob.length; i++) {
			System.out.println("====BookDetails "+(i+n)+"=====");
			ob[i] = new BookDetails(); //bookdetails object created
			
			System.out.println("Enter the code ");
			ob[i].code = sn.nextLine();
			System.out.println("Enter book name ");
			ob[i].name = sn.nextLine();
			System.out.println("Enter the book author ");
			ob[i].author = sn.nextLine();
			System.out.println("Book Price ");
			ob[i].price = Float.parseFloat(sn.nextLine());
			if(ob[i].price <= 0) {
				System.out.println("Invalid price...");
				i--;
				continue;
			}
			
			System.out.println("Book Qty ");
			ob[i].qty = Integer.parseInt(sn.nextLine());
			if(ob[i].qty < 0) {
				System.out.println("Invalid quantity ");
				i--;
				continue;
			}
		}
		System.out.println("========BookDetails=========");
		for(BookDetails k: ob) {
			System.out.println(k.toString());
		}
	}

}
