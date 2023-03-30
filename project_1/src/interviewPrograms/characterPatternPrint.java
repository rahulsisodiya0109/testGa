package interviewPrograms;

public class characterPatternPrint {
	
	public static void main(String[] args) throws Throwable {

		String str = "a3b2c1";

		for (int i = 0; i < str.length(); i += 2) {

			char ch = str.charAt(i + 1);
			int a = Integer.parseInt(String.valueOf(ch));

			for (int j = 0; j < a; j++) {
				
				System.out.print(str.charAt(i));
			}

		}
	}

}
