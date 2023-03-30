package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

	// Print characters and their frequencies in order of occurrence

	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char[] strArray = name.toCharArray();

		for (char c : strArray) {
//isBlank is supported in higher JavaSE environment, change it 1.11 or so,..
//following line to remove the blank spaces			
//			if (!String.valueOf(c).isBlank()) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
//			}
		}

		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {
		getCharCount("rahul");
		getCharCount("rahul sisodiya");
		getCharCount("       ");
	}

}
