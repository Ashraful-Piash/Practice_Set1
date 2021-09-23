package com.piash;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int age;
		System.out.print("enter your age :");
		Scanner sc = new Scanner (System.in);
		age = sc.nextInt();
		
		switch (age) {
		case 18 : 
			System.out.println("you are teenager");
			break;
		case 25 :
			System.out.println("you are ready for job");
			break;
		case 90 :
			System.out.println("you are ready to retire");
			break;
		default :
			System.out.println("Enter your valid age !");
		}

	}

}
