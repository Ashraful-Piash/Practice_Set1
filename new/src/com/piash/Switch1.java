package com.piash;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter number of the day");
		int day = sc.nextInt();
		
		switch (day) {
		case 1 -> System.out.println("monday");
		case 2 -> System.out.println("tuesday");
		case 3 -> System.out.println("wednesday");
		case 4 -> System.out.println("thursday");
		case 5 -> System.out.println("friday");
		case 6 -> System.out.println("saturday");
		case 7 -> System.out.println("sunday");
		}
	}

}
