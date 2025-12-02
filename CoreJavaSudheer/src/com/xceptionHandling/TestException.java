package com.xceptionHandling;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {

		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a value");
		 int a=s.nextInt();
		 System.out.println("Enter b value");
		 int b=s.nextInt();
		 s.close();
		 if(b==0) {
			 throw new  ArithmeticException(" you shouldn't Divide by ZERO");
		 }else {
		 System.out.println(a/b);
		 } 
	}
}
