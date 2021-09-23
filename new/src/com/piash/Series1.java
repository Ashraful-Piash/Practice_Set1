package com.piash;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, sum = 0;
		System.out.print("enter last number: ");
		n = scanner.nextInt();
		
		for (int i = 2; i <=n; i=i+2) {
			if (n%2==0) {
				System.out.print(i +" ");
				sum = sum +i;
			}
			
			
			
		}
		System.out.println();
		System.out.print("sum is :"+sum);
	}

}
