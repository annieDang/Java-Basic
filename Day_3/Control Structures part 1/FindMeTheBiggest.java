package Day_3;
/*
 * Write an application that reads five integers, determines and prints the largest and smallest integers in the group
 */
import java.util.Scanner;

public class FindMeTheBiggest{
    public static void main(String[] args){
        // create a scanner to obtain input from the command window
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int max = 0;
        while(counter < 6) {
            System.out.println( "Give me a number: " );
            int enterNumber = scanner.nextInt();
            if(max < enterNumber) {
                max = enterNumber;
            }
            counter ++;
        }

        System.out.printf("The biggest number is %d", max);
    }
}