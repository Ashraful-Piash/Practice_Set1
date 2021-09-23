package com.piash;

import java.util.Scanner;

public class Practice {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter v");
		float v = sc.nextInt();	
		
		System.out.print("enter u");
		float u = sc.nextInt();
		
		System.out.print("enter a");
		float a = sc.nextInt();
		
		System.out.print("enter s");
		float s = sc.nextInt();
		
		
		float result = (v*v-u*u)/ (2*a*s);
		System.out.println("result is: "+result);
	}
	

	
	}


