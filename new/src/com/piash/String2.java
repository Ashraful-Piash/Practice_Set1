package com.piash;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentence :");
		String input = sc.nextLine();
		
		System.out.println(input.replace(" ", "_"));
		
		
		String message  = "Hello  <name> , thanks a lot";
		message = message.replace("<name>", "Piash");
	
		System.out.println(message);
		
		String myString = "This is   mykingdom";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		String myMessage = "Hello Piash , \n\tThis is myself. \n\tThanks";
		System.out.println(myMessage);
	}

}
