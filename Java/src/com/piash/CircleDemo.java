package com.piash;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double radius, area;
		System.out.print("Enter radius");
		
		radius = scanner.nextDouble();
		
		area = 3.1416 * radius *radius;
		
		System.out.println("area of circle :"+area);
		

	}

}
