package project_1;

import java.util.HashSet;
import java.util.Set;

public class ListvsSet {

	public static void main(String[] args) {
		// creating HashSet implementation using the Set
		Set<String> veg = new HashSet<String>();

		veg.add("Ginger");
		veg.add("Garlic");
		veg.add("Ginger");
		veg.add("Onion");
		veg.add("Ginger");

		System.out.println(veg);

		Set<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(8);
		set1.add(6);
		set1.add(2);
		set1.add(8);
		set1.add(1);

		System.out.println(set1);

	}

}
