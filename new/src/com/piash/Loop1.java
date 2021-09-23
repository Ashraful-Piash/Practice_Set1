package com.piash;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int sum = 0;
		int m,n;
		
		System.out.print("enter first number : ");
		m = scanner.nextInt();
		
		System.out.print("enter final number : ");
		n= scanner.nextInt();
		
		for (int i = m ; i<=n; i++) {
			
			if (i%2!=0) {
				sum = sum +i;
				System.out.print(" "+i);
			}
		       
				
			
				
		}
		    System.out.println();
		    System.out.print("sum is "+sum);
				
		
		

	}

}
