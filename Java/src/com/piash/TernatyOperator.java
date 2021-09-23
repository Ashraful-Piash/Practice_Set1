package com.piash;

import java.util.Scanner;

public class TernatyOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter income");
		int Income = scanner.nextInt();
		String className = Income>10000?"first" : "economy";
		System.out.println(className);

	}

}
