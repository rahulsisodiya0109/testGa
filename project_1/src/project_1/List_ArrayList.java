package project_1;


import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		
		List<String> abc = new ArrayList<>();
		
		abc.add("cat");
		abc.add("dog");
		abc.add("cat");
		
		System.out.println(abc);
		System.out.println(abc.get(1));
		//List : ordered collection, duplication of data can be done, preserves the insertion order, positional access 
		
		

	}

}
