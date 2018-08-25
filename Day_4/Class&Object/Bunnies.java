package Day_4;

import java.util.Scanner;

public class Bunnies {
	public static void main(String[] args){	 
		Scanner input = new Scanner(System.in);
		System.out.println("Hi! We are a rabit family and we are living in the forest!");
		System.out.println("How many our members do you want to meet?");
		int numberOfMembers = input.nextInt();
		
		if(numberOfMembers < 0 || numberOfMembers > 10) {
			System.out.println("Ah... We dont have that much people!");
		}
		
		for(int count = 0; count< numberOfMembers ; count ++) {
				Bunny bunny = new Bunny();
			    
				System.out.println("Hi! How do you want me to be called?");
			    String name = input.next();
			    bunny.setName(name);
			    System.out.println("Thanks! Lovely name... (drumming)");
			    
			    System.out.println("And how old do you think I'm?");
			    int age = input.nextInt();
			    bunny.setAge(age);
			    if(age < 0) {
			    	System.out.println("Do you mean I died?");
			    } else if(age < 5) {
			    	System.out.println("Cool! That means I look young");
			    } else {
			    	System.out.println(":( Do I look that old!");
			    }
			    
			    bunny.introduce();
			    
		}
		System.out.println("Thank you for comming here and help naming us!");
	}
}
