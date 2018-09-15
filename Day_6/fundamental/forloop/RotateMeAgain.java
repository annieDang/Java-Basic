package Day_6.fundamental.forloop;

import java.util.Scanner;

public class RotateMeAgain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "You must be really hate me right? Fine, How many time do you want me to rotate?" );
		int howManyTime = scanner.nextInt();
		for(int count = 1; count < howManyTime +1 ; count ++) {
			System.out.println("I'm rolling " + count);
			if(count >= 3) {
				System.out.println("Sorry... I cannot rotate any more");
				break;
			}
		}
	}
}
