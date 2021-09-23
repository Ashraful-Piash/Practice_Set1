package com.piash;

import java.util.Scanner;

public class IfStatement1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Income");
		int income = scanner.nextInt();
		if(income >10000) {
			System.out.println("has high Income");
			
		}else {
			System.out.println("has low income");
		}
	}

}
