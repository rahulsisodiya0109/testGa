package project_1;

public class LoopSwap {

	public static void main(String[] args) {
		String a="garima",b="rahul";
		System.out.println(a+b);
		a=a+b;	//garimarahul
		
		b=a.substring(0, 6);  // end index is exclusive as per method definition check in its description
		a=a.substring(6);
		
		/*
		 * // // store initial string a in string b // b =
		 * a.substring(0,a.length()-b.length()); // // // store initial string b in
		 * string a // a = a.substring(b.length());
		 */		
		System.out.println(a+b);
		
	}

}
