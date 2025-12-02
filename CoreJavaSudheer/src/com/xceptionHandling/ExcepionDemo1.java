package com.xceptionHandling;
 

import java.util.InputMismatchException;
 
import java.util.Scanner;

public class ExcepionDemo1 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try {
			System.out.println("enter a value");
			int a=s.nextInt();
            System.out.println("enter b value");
            int b=s.nextInt();
            int c=a/b;
            System.out.println("enter a name");
            s.nextLine();
            String name=s.nextLine();
            System.out.println("c value :"+c);
            System.out.println(name.charAt(c));
			
		} 
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} 
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} 
		catch(InputMismatchException i) {
			i.printStackTrace();
			System.err.println(i.getMessage());
		} 
		System.out.println("Meduri Sudheer Babu");
		 System.out.println("main method ended");
		s.close();
	}
    // Name of Exception :Exception in thread "main" java.lang.ArithmeticException:
    //Description of Exception :/ by zero
	//Location : com.xceptionHandling.ExcepionDemo1.main
}   //Line: (ExcepionDemo1.java:18)

