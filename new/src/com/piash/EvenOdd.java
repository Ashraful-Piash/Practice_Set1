package com.piash;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number%2 ==0) {
			System.out.println("even");
			
			
		}else {
			System.out.println("odd");
		}

	}

}
