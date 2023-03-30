package OOPs;

import java.util.HashMap;

public class P8_HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Ram");
		hm.put(2, "Sita");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm);
	}

}
