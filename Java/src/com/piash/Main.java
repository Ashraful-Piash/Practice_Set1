package com.piash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter Weight of Watermelon");
		int w = scanner.nextInt();
		
		if(w >= 4 && w% 2 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
