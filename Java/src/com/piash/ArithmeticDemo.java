package com.piash;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double base, height , area;
		
		System.out.print("enter base: ");
		base = scanner.nextDouble();
		
		System.out.println("enter height: ");
		height = scanner.nextDouble();
		
		area = base * height;
		
		System.out.println("Area: "+area);
	}

}
