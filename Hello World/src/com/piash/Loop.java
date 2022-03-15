package com.piash;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
//        System.out.print("Enter your salary:");
//        Scanner input = new Scanner(System.in);
//        int salary = input.nextInt();
//        if(salary > 20000){
//            salary = salary+20000;
//        }else{
//            salary = salary +1000;
//        }
//        System.out.println("Your salary is: " +salary);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//
//        for (int num = 0; num<= n; num ++){
//            System.out.print(num +" ");
//        }
        int num = 1;
        while(num<n){
            System.out.println(num);
            num +=1;

        }

    }
}
