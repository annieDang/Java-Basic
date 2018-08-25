package Day_4;

import java.util.Scanner;

public class ABunnyWantToSeeYou {
	   // create a scanner to obtain input from the command window
       private static Scanner input = new Scanner(System.in);
       private static int position = 0;
       private static String BUNNY = 
    		"           \\.\\ /,/\n" + 
       		"            Y Y f\n" + 
       		"            |. .|\n" + 
       		"           (\"_, l\n" + 
       		"            ,- , \\\n" + 
       		"           (_)(_) Y,.\n" + 
       		"            _j _j |,'\n" + 
       		"           (_,(__,'\\n";
       
	   public static void main(String[] args){	  
		   System.out.println("Hi! I'm a little bunny");
		   System.out.println(BUNNY);

	   
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
		   if(position < 0 || position > 30) {
			   System.out.println("Ah.... I cannot do that!!!");
		   } else {
			   System.out.println("OK, I will move right "+ steps +" steps!");
			   for(int move = 0; move< position ; move ++) {
				   System.out.print("- hop ");
			   }
			   System.out.println("BUNNY");
		   }
	   }
	   public static void moveLeft() {
		   System.out.println("How many step?");
		   int steps = input.nextInt();
		   position -= steps;
		   System.out.println("OK, I will move left "+ steps + " steps!");
	   }
	   
}
