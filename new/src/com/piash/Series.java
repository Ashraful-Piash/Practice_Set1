package com.piash;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n, sum = 0;
		
		System.out.print("enter last number :");
		n = scanner.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.print(i+" ");
			sum = sum +i;
			
		}
		System.out.println();
		System.out.println("sum is: "+sum);
		

	}

}
