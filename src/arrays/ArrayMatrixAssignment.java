package arrays;

public class ArrayMatrixAssignment {

	public static void main(String[] args) {
		int [][] o = new int[3][3];
		o[0][0] = 1;
		o[0][1] = 2;
		o[0][2] = 3;
		
		o[1][0] = 4;
		o[1][1] = 5;
		o[1][2] = 6;
		
		o[2][0] = 7;
		o[2][1] = 8;
		o[2][2] = 9;
		
		int sum = 0;
		for(int i = 0; i < o.length; i++) {
			for(int j = 0; j < o.length; j++) {
				System.out.print(o[i][j] + "  ");
				if(i == j) {
					 sum = sum + o[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("\nSum of diagonal elements : "+ sum);
	}

}
