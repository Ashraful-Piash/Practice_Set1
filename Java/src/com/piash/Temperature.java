package com.piash;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double chel, far;
		
		System.out.println("celcius: ");
		chel = input.nextDouble();
		
		far = 1.8 * chel + 32;
		
		System.out.println("farenheit: "+far);
		

	}

}
