package project_1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input string");

		// String input
		String str = sc.nextLine();

		// Numerical input
	    int age = sc.nextInt();
	    double salary = sc.nextDouble();
	    
		System.out.println("output string is : " + str);

	}
}
