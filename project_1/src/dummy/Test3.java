package dummy;

public class Test3 {
	public static void main(String[] args) {
		
		
		//Input-
		String str = "Rahul"; 
				//Output- hulRa

				String tmp="";

				for(int i= 2;i<str.length();i++){

				tmp = tmp+str.charAt(i);

				}

				for(int i=0;i<2;i++){
				tmp = tmp + str.charAt(i);

				}

				System.out.println(tmp);
	}

}
