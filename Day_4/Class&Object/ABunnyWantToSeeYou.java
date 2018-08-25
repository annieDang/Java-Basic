package Day_4;

import java.util.Scanner;

public class ABunny {
	  package Day_4;

import java.util.Scanner;

public class ABunnyWantToSeeYou {
	// create a scanner to obtain input from the command window
    private static Scanner input = new Scanner(System.in);
    private static int position = 1;
	   public static void main(String[] args){	  
		   System.out.println("Hi! I'm a little bunny");
		   showBunny(1);

		   int choice = 0;
		   while (choice != -1) {
			   System.out.println("*************************");
			   System.out.println("What do you want me to do?");
			   System.out.println(" 1.Move right");
			   System.out.println(" 2.Move left");
			   System.out.println("-1.Exit");
			   choice = input.nextInt();
			   switch(choice) {
			   case 1:
				   moveRight();
				   break;
			   case 2: 
				   moveLeft();
				   break;
			   case -1: 
				   System.out.println("Bye!");
				   break;
			   default:
				   System.out.println("Sorry, Not something I could do! :(");
				   break;
			   }
		   }
	   
	   }
	   
	   public static void moveRight() {
		   System.out.println("How many step?");
		   int steps = input.nextInt();
		   position += steps;
		   if(position < 0 || position > 100) {
			   System.out.println("Ah.... I cannot do that!!!");
		   } else {
			   System.out.println("OK, I will hop right "+ steps +" steps!");
			   showBunny(position);
		   }
	   }
	   public static void moveLeft() {
		   System.out.println("How many step?");
		   int steps = input.nextInt();
		   position -= steps;
		   if(position < 1 || position > 100) {
			   System.out.println("Ah.... I cannot do that!!!");
		   } else {
			   System.out.println("OK, I will hop left "+ steps + " steps!");
			   showBunny(position);
		   }
		  
	   }
	   
	   public static void showBunny(int position) {
		   System.out.printf("%" +position +"s","\\.\\ /,/\n"); 
		   System.out.printf("%" +position +"s","Y Y f\n");
		   System.out.printf("%" +position +"s","|. .|\n");
		   System.out.printf("%" +position +"s","(\"_, l\n"); 
		   System.out.printf("%" +position +"s",",- , \\\n"); 
		   System.out.printf("%" +position +"s","(_)(_) Y,.\n"); 
		   System.out.printf("%" +position +"s","_j _j |,'\n"); 
		   System.out.printf("%" +position +"s","(_,(__,'\n");
	   }
	   
}

}
