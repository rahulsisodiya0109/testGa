package project_1;

public class ReplacingVowels {

	public static void main(String[] args) {
		
		

		String str = "Rahul Sisodiya";
		String newStr = "";
		      
	
		for(int i=0; i< str.length(); i++) {
			
			if( str.charAt(i) == 'a' || str.charAt(i) == 'e'  || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') {
				
				newStr = newStr + "_";
			}else {
				
				newStr = newStr + str.charAt(i) ;
			}
		}
		
		
		System.out.println(newStr);

	}

}
