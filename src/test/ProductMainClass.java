package test;

import java.util.Scanner;

import maccess.ProductDetails;

public class ProductMainClass {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of products ");
		int n = Integer.parseInt(sn.nextLine());
		ProductDetails ob[] = new ProductDetails[n];
		System.out.println("Enter "+n+" product details");
		for(int i = 0; i < ob.length; i++) {
			System.out.println("Details of "+(i+1)+" product");
			ob[i] = new ProductDetails();
			
			System.out.println("Enter the product code ");
			ob[i].pCode = sn.nextLine();
			
			System.out.println("Enter the product name ");
			ob[i].pName = sn.nextLine();
			
			System.out.println("Enter the product price ");
			ob[i].pPrice = Float.parseFloat(sn.nextLine());
			
			if(ob[i].pPrice < 0) {
				System.out.println("Invalid price...");
				i--;
				continue;
			}
			
			System.out.println("Enter the product Quantity ");
			ob[i].pQty = Integer.parseInt(sn.nextLine());
			
			if(ob[i].pQty < 0) {
				System.out.println("Invalid quantity...");
				i--;
				continue;
			}
		}
		System.out.println("******ProductDetails******");
		for(ProductDetails p : ob) {
			System.out.println(p.toString());
		}
	}
}
