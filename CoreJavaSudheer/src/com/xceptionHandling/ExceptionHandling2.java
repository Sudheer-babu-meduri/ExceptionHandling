package com.xceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter a String :");
		 String name=s.nextLine();
		 
		  try {
			  System.out.println("enter a value :");
			  int a=s.nextInt();
			  System.out.println("enter b value :");
				 int b=s.nextInt();
				 int c=a/b; 
			  System.out.println(name.charAt(c));
		  }
		catch(Exception e) {
			System.err.println(e);
//			System.out.println(e.toString());
//		 	System.err.println(e.getMessage());
		}
		System.out.println("Mahendra Singh Dhoni");
		System.out.println("Hardik Pandya");
		s.close();
		}

}
