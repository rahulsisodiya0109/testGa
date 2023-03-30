package project_1;

public class ReverseWordsInString {

	public static void main(String[] args) {

//	    Scanner input = new Scanner(System.in);
//	    System.out.print("Enter a sentence: ");
//	    String sentence = input.nextLine();

		String sentence = "my name is rahul";

		String[] words = sentence.split(" ");

		System.out.print("Reversed sentence: ");

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
//		for(int i = 0; i<words.length; i++) {
//			
//			for (int j = words[i].length() - 1; j >= 0; j--) {
//				System.out.print(words[i].charAt(j));
//			}
//			System.out.print(" ");
//		}
		

	}

}
