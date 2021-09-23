package com.piash;

public class String3 {

	public static void main(String[] args) {
		String names = "Jerin, Bakir, Piash, Ms Shilpi";
		String allNames [] = names.split("i");
		
		for (String name : allNames) {
			System.out.println(name);
		}
	}

}
