package arrays;

public class SmallestValue {
	
	
	public int smallValue(Integer a[]) {
		int minVal = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < minVal) {
				minVal = a[i];
			}
		}
		return minVal;
	}

}
