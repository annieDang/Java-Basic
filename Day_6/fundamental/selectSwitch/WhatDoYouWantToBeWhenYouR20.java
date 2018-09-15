package Day_6.fundamental.selectSwitch;

import java.util.Scanner;

public class WhatDoYouWantToBeWhenYouR20 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "What do you wanna be when you are 20? Pick one!" );
		System.out.println( "1.I want to rich." );
		System.out.println( "2.I want to be poor.");
		System.out.println( "3.I want a bunny.");
		System.out.println( "4.My name is jeff.");
		int pick = scanner.nextInt();
		switch (pick) {
		case 1: 
			System.out.println( "Read How to be rich books :)!" );
			break;
		case 2: 
			System.out.println( "... be lazy!" );
			break;
		case 3: 
			System.out.println( "Buy one!" );
			break;
		case 4: 
			System.out.println( "Hi jeff! Are you nut?" );
			break;
		default: System.out.println( "Only pick from the above list!" );
		}
	}
}
