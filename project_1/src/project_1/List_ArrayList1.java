package project_1;

import java.util.ArrayList;

public class List_ArrayList1 {

	public static void main(String[] args) {
		// this is for ArrayList
		
		ArrayList<String> abc = new ArrayList<String>();
		
		abc.add("cat");
		abc.add("cat");
		abc.add("dog");
		abc.add("cat");
		
		System.out.println(abc);
		
		abc.add(1, "cow");	// it will insert the value at that index and shift other towards right
		
		System.out.println(abc);

	}

}
