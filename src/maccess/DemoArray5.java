package maccess;

import test.User;

public class DemoArray5 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer(121);
		o[1] = new String("NIT");
		o[2] = new User("NIT.V",989898765L);
		System.out.println("====Display from ObjectArray====");
		for(Object k : o) {
			System.out.println(k.toString());
		}
	}

}
