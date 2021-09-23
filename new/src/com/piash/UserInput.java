package com.piash;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter your principal");
		int principal = sc.nextInt();
		
		System.out.print("enter rate of interest");
		float rateOfInterest = sc.nextFloat();
		
		System.out.print("enter time");
		int time = sc.nextInt();
		
		float simpleInterest = principal * rateOfInterest * time / 100;
		System.out.println("Interest is "+simpleInterest);
	}

}
