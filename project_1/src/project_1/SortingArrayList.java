package project_1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(5);
		arr.add(2);
		arr.add(1);
		arr.add(8);

		System.out.println(arr);

		Collections.sort(arr);

		System.out.println(arr);
	}

}
