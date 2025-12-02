package com.xceptionHandling;

import java.util.Scanner;

class SudheerBabuException extends RuntimeException{

	
	SudheerBabuException(){}
	SudheerBabuException(String s){
		super(s);
	}
}

public class TestException333 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		s.close();
		try{
		if(age>=18) {
			System.out.println("You are eligible for vote");
		}else {
			throw new SudheerBabuException("Future undi");
		}}catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("Vote veyaledu");
		}
	}

}
