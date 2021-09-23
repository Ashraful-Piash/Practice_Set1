package com.piash;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int sum = 0, number, remainder, temporaryNumber;
		
		System.out.print("Enter any number");
		number = input.nextInt();
		
		
		temporaryNumber = number;
		
		while (temporaryNumber != 0) {
			remainder = temporaryNumber % 10;
			sum = sum + remainder;
			temporaryNumber = temporaryNumber / 10;
			
		 }
		 System.out.println("Sum of the digit :"+sum);
		

	}

}
