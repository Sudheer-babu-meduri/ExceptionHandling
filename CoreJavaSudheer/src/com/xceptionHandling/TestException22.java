package com.xceptionHandling;

import java.util.Scanner;
class SudheerException extends Exception {
	  
	  SudheerException(){}
	  
	  SudheerException(String s){
		  super(s);
	  } 
	  
}

public class TestException22 {

	public static void main(String[] args)  throws SudheerException {

		Scanner s=new Scanner(System.in);
		System.out.println("enter age ");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			throw new SudheerException("Future Undi");
		}
	}

}
