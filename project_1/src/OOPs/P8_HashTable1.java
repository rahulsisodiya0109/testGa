package OOPs;

import java.util.Hashtable;

public class P8_HashTable1 {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(1, "Ram");
		hm.put(2, "Sita");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm);
	}

}
