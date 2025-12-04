package h2;

import java.util.Arrays;

public class H2_main {

	static int[] a = { 2, 3, 4 };
	static int[] b = { 7, 8 };
	static int start = 7;
	static int end = 9;

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (end > start) {
			if (Arrays.compare(a, b) != 0) {

				return Arrays.copyOf(a, a.length);
			} else {
				Arrays.sort(a);
				return Arrays.copyOfRange(a, start, end);
            
			}}
		
		
		return new int[] {};
			
		
	}
    public static void main(String[]args) {

  
    System.out.println(Arrays.toString(change(a, b, start, end)));
    	    
 }
}
