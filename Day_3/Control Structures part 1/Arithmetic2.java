package Day_3;

import java.util.Scanner;

/*
 * 
 */
public class Arithmetic2 {

	public static void main(String[] args) {
		// create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three spaced separated integers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		// // sum
		// printResult("Sum", ???);
		//
		// // average
		// printResult("Average", ???);
		//
		// // product
		// printResult("Product", ???);
		//
		//
		// // largest
		// // Hint Math.max
		// printResult("Largest", ???);
		//
		// // smallest
		// printResult("Smallest", ???);
	}

	// print result
	private static void printResult(String message, int x) {
		System.out.printf("%s = %d\n", message, x);
	}

}
