package com.piash;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String role = scanner.nextLine();
		
		switch (role) {
		case "admin":
			System.out.println("u are admin");
			break;
			
		case "moderator":
			System.out.println("u are moderator");
			break;
			
			default:
				System.out.println("u are guest");
	  }

	}

}
