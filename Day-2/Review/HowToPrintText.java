package Day_2.Review;

public class HowToPrintText {

	public static void main(String[] args) {
		
		System.out.println("-----------------------Printing a line of text with multiple statements----------------------------------------");
		System.out.print("Welcome to");
		System.out.println("Java Programming!");

	
		
		System.out.println("-----------------------Printing multiple lines of text with a single statement----------------------------------------");
		System.out.println( "Welcome\nto\nJava\nProgramming!" );
		
		System.out.println("-----------------------Displaying Text with printf----------------------------------------");
		/*
		 * This is equal (Welcome to \n Java Programming!\n)
		 */
		System.out.printf( "%s\n%s\n","Welcome to", "Java Programming!" );
		/*
		 * Format specifiers begin with a percent sign (%) and are followed by a character that represents the data type. 
		 * For example, the format specifier %s is a placeholder for a string, %d is a placeholder for an integer.
		 */
		int year = 10;
		String pet = "cat";
		
		// 1
		System.out.print( "I have a lovely "+ pet +" for " + year + " years\n");
		// 2
		System.out.println( "I have a lovely "+ pet +" for " + year + " years");
		// 3
		System.out.printf( "I have a lovely %s for %d years", pet, year );
	}

}
