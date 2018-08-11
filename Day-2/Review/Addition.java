package Day_2.review;

import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        // create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is " + sum);
        
        /*
         * Add some code here so this application asks the user to enter two integers, obtains them from the user and
		 * prints their sum, product, difference and quotient (division).
         */
        
        /*
         * * Hints * *
         * Addition x + y
		 * Subtraction x-y
		 * Multiplication x*y
		 * Division x/y
		 * Remainder x%y
         */


    }
}