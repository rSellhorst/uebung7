package h2;

import java.util.Arrays;

public class H2_main {

	static int[] a = { 2, 3, 5 };
	static int[] b = { 2, 3, 5 };
	static int start = 7;
	static int end = 9;

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (end > start) {
			if (Arrays.compare(a, b) != 0) {

				 return Arrays.copyOf(a, a.length);
			
			} else if (Arrays.compare(a, b)==0){
				Arrays.sort(a);
				 return Arrays.copyOfRange(a, start, end);
			
			}
		}

		return new int[] {};

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(change(a, b, start, end)));

	}
}
