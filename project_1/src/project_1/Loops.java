package project_1;

public class Loops {

	public static void main(String[] args) {
		
		String str="rahul" , reverse="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println(reverse);
		
//		for(int i=str.length()-1;i>=0;i--) {
//			ch= str.charAt(i);
//			System.out.print(ch);
//		}
		
		
//		if(str.equalsIgnoreCase(reverse)) {
//			System.out.println("pallendrom");
//		}else {
//			System.out.println("not so");
//		}
		
		
	}

}
