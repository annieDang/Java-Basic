package Day_2.Review;

import java.util.Scanner;

public class HowToGetInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf( "Give me a number: " );
		int aNumber = scanner.nextInt();
		System.out.printf( "I got number %d\n", aNumber );
		
		System.out.printf( "Type anything you like\n " );
		String anything = scanner.next();
		System.out.printf("You typed : %s\n",  anything);
	}
}
