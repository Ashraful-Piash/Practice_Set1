package com.piash;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your grade : ");
		 char  grade = sc.next().charAt(0);
		 
		 switch (grade) {
		 case 'A' :
			 System.out.println("You are in batch 1");
			 break;
		 
		 case 'B' :
			 
			 System.out.println("You are in batch 2");
			 break;
		 }
		
	}

}
