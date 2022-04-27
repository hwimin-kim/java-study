package chapter03;

import java.util.Arrays;

public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		int[] a1 = {10, 20, 30, 40};
		double[] d1 = {10.0, 20.0, 30.0, 40.0};
		
		double[] d2 = ArrayUtils.intToDouble(a1);
		System.out.println(Arrays.toString(d2));
//		for(double item : d1) {
//		System.out.println(item);
//	    }
		
		int[] a2 = ArrayUtils.doubleToInt(d1);
		System.out.println(Arrays.toString(a2));
		
		ArrayUtils.concat(new int[] {1, 2, 3}, new int[] {4, 5, 6, 7});
	}

}
