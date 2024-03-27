package arrays;

public class GreaterValue {
	int maxValue = 0;
	public int greaterVal(Integer a[]) {

		for(int i = 0; i < a.length; i++) {
			if(a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}
}
