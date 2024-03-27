package test;
import java.util.*;
import maccess.Books;

public class BooksRunner {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of books ");
		int n = Integer.parseInt(sn.nextLine());
		Books ob[] = new Books[n];
		System.out.println("===Enter "+n+ " Books Details====");
		for(int i = 0; i < ob.length; i++) {
			System.out.println("******BookDetails-"+(n+1)+"******");
			ob[i] = new Books();
			System.out.println("Enter the book code ");
			ob[i].bookCode = sn.nextLine();
			System.out.println("Enter the book name ");
			ob[i].bookName = sn.nextLine();
			System.out.println("Enter the book author ");
			ob[i].bookAuthor = sn.nextLine();
			System.out.println("Enter the book price");
			ob[i].bookPrice = sn.nextFloat();
			if(ob[i].bookPrice <= 0) {
				System.out.println("Invalid Price ...");
				i--;
				continue;
			}
			System.out.println("Enter book Quantity ");
			ob[i].bookQty = sn.nextInt();
			if(ob[i].bookQty < 0) {
				System.out.println("Invalid Quantity...");
				i--;
				continue;
			}
		}
		System.out.println("********BookDetails********");
		for(Books k : ob) {
			System.out.println(k.toString());
		}
	}
}
