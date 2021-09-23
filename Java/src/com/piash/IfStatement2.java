package com.piash;

import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter role");
		String role = scanner.nextLine().toLowerCase();
		if (role.equals("admin")) 
			System.out.println("you are an admin");
		else if (role.equals("guest")) 
			System.out.println("u guest");
		else 
			System.out.println("You are moderator");
		
	}

}
