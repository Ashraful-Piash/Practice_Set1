package com.piash;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int sub1, sub2, sub3;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Marks of physics :");
		sub1 = sc.nextInt();
		System.out.print("marks of chem :");
		sub2 = sc.nextInt();
		System.out.print("marks of bio :");
		sub3 = sc.nextInt();
		
	    float result = (sub1+sub2+sub3)/3.0f;
	    System.out.println("your result is :"+result);
		if (result >= 40 && sub1 >= 33 && sub2 >=33 && sub3 >= 33) {
			System.out.println("You have passed");
			
		}else {
			System.out.println("Study hard");
		}
		
	}

}
