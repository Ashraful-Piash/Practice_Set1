package com.piash;
import java.util.Scanner;
public class Addition {

	
		public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter your marks: ");
		    
		    System.out.println("Enter mark of sub 1");
		    int mark1 =sc.nextInt();
		   
		    System.out.println("enter mark of sub 2");
		    int mark2=sc.nextInt();
		   
		    System.out.println("Enter mark of sub 3");
		    int mark3=sc.nextInt();
		    
		    System.out.println("enter mark of sub 4");
		    int mark4=sc.nextInt();
		    
		    System.out.println("enter mark of sub 5");
		    int mark5=sc.nextInt();
		    
		    int totalMarks = mark1+mark2+mark3+mark4+mark5;
		    float perchent =(totalMarks/500.0f)*100;
		    System.out.println("total  mark  is: " +totalMarks);
		    
		    System.out.println("perchantage of number is "+perchent);

		
	}

}
