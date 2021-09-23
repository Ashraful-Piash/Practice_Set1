  package com.piash;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int x = 1;
		int y =1;
		System.out.println(x>=y);
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible =(hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);
	}
	

}
