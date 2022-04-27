package chapter03;

import java.util.Arrays;

public class ArrayUtils {

	public static double[] intToDouble(int[] a1) {
		double[] result = new double[a1.length];
		
		for(int i = 0; i<a1.length; i++) {
			result[i] = a1[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] d1) {
		int[] result = new int[d1.length];
		
		for(int i = 0; i<d1.length; i++) {
			result[i] = (int) d1[i];
		}
		return result;
	}

	public static void concat(int[] is, int[] is2) {
		int result[] = new int[is.length + is2.length];
		for(int i = 0; i< result.length; i++) {
			if(i<is.length)
			result[i] = is[i];
			else
			result[i] = is2[i-is.length];
		}
		System.out.println(Arrays.toString(result));
		
	}

}
