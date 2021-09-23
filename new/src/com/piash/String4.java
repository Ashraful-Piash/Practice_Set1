package com.piash;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your website name: ");
		
		String website = sc.nextLine();
		
		if(website.endsWith("com")) {
			System.out.println("this is a commercial website");
		}else if (website.endsWith("org")) {
			System.out.println("this is an organizational website");
		}else if(website.endsWith("bd")){
			System.out.println("government website");
			
		}else {
			System.out.println("enter valid name");
		}
	}

}
