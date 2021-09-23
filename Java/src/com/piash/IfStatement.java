package com.piash;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Temperature");
		int temp = scanner.nextInt();
		if (temp>25) {
			System.out.println("Its a hot day");
			System.out.println("Drink water");
		}else if (temp > 20 && temp <24) {
			System.out.println("Its a nice day");
		}else {
			System.out.println("its cold");
		}
	}

}
