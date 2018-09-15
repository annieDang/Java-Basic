package Day_6.fundamental.whileloop;

import java.util.Scanner;

public class RotateMe {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "How many time do you want me to rotate?" );
		int howManyTime = scanner.nextInt();
		int count = 1;
		while(count < howManyTime + 1) {
			System.out.println("I'm rolling " + count);
			if(count > 5) {
				System.out.println("I'm dying... ah....");
			}
			//increase count
			count = count +1;
		}
	}
}
