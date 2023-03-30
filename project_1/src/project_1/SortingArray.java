package project_1;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		
		
		int[] a = new int[] { 8, 2, 3 };
		Integer[] b = { 8, 2, 3, 88 };
		

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		
		
		Arrays.sort(b, Collections.reverseOrder());

		System.out.println(Arrays.toString(b));
	}

}
