package com.xceptionHandling;

public class Exceptionhandling4 {

	public static void main(String[] args) {
	 try {
		 System.out.println("In try 1");
		 
	      System.out.println(10/5);
		try {
			System.out.println("In try 2");
			System.out.println(10/0);
		}catch(Exception e1) {
			System.out.println("In catch 2");
			System.err.println(e1.getMessage());
			System.out.println(10/0);
		}
	      
	 }catch(Exception e) {
		 System.out.println("In catch 1");
		 System.err.println(e.getMessage());
	 }
	  	 System.out.println("MS DHONI");
	 System.out.println("Hardik");}
	

}
