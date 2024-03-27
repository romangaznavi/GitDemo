package test;

public class ArrayObject {

	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer(444);
		o[1] = new String("Roman");
		o[2] = new User("Ali", 9898988988L);
		
		System.out.println("****Displaying ObjectArray*****");
		for(Object a :o) {
			System.out.println(a.toString());
		}
	}

}
