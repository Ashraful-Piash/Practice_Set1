package com.piash;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 0 for Rock, 1 for paper, 2 for scissors");
		int userInput = sc.nextInt();
		
		Random random = new Random();
		int computerInput = random.nextInt(3);
		
		if (userInput == computerInput ) {
			System.out.println("Draw!");
		}
		else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || 
				userInput == 2 && computerInput ==1){
			System.out.println("User wins");
		} else {
			System.out.println("computer wins");
		}
		System.out.println("computer choice "+computerInput);
	}

}
