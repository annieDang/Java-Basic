package Day_3;

import java.util.Scanner;

/*
 * Addition x + y
 * Subtraction x-y
 * Multiplication x*y
 * Division x/y
 * Remainder x%y
 */

public class Arithmetic1{
    public static void main(String[] args){
        // create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        
        int quotient = quotient(number1, number2);
        int remainder = remainder (number1, number2);
        int sum = sum (number1, number2);
        
        System.out.printf("Quotient is " + quotient + " ,Remainder is " + remainder + " ,Sum is " + sum +
        		" ,Difference is " + difference(number1, number2) + " ,Product is" + product(number1, number2));
        
        
    }
    
    public static int sum (int firstNumber, int secondNumber){
    	int sum = firstNumber + secondNumber;
    	return sum;
    }
    
    public static int difference (int firstNumber, int secondNumber){
    	int difference = firstNumber - secondNumber;
    	return difference;
    }
    
    public static int product (int firstNumber, int secondNumber){
    	return firstNumber * secondNumber;
    }
    
    public static int quotient (int firstNumber, int secondNumber){
    	return firstNumber / secondNumber;
    }
    
    public static int remainder (int firstNumber, int secondNumber){
    	return firstNumber % secondNumber;
    }
}