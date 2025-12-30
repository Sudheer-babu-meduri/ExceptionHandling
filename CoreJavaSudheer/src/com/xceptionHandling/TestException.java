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
		try {
            if (b == 0) {
                throw new ArithmeticException("You shouldn't divide by ZERO");
            } else {
                System.out.println("Result: " + a / b);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
		System.out.println("SUDHEER BABU MEDURI");
	}
}

