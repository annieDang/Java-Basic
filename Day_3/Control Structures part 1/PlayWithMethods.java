package Day_3;

public class PlayWithMethods {

	public static void main(String[] args) {
		sayHello();
		sayHello();

		sayHelloTo("Noah");
		sayHelloTo("Yujin");
		
		/*
		 * Standard Library Methods
		 * The standard library methods are built-in methods in Java that are readily available for use.
		 */
		System.out.println("Max of 3 and 4 is " + Math.max(3, 4));
//		System.out.println("Max of 3 and 4 is " + max(3, 4));
		System.out.print("Square root of 4 is: " + Math.sqrt(4));
		
		// Get square of a number
		int number = 4;
//		System.out.println("Square of " + number + " is "+ square(number));
//		squareOf(number);
		
		
	}

	public static int max(int number1, int number2) {
		int max = number1;
		if(max < number2) {
			max = number2;
		}
		return max;
	}
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void sayHelloTo(String name) {
		System.out.println("Hello " + name );
	}
	
	public static int square(int number) {
		int square = number * number;
		return square;
	}
	
	public static void squareOf(int number) {
		System.out.println("Square of " + number + " is "+ square(number));
	}
}
