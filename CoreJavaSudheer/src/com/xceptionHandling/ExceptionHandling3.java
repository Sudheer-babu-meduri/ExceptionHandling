package com.xceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] ar) {
		String s1="sudheer";
		String s2="";
		String s3=null;
		try {
			System.out.println(s1.length());
			System.out.println(s2.length());
			System.out.println(s3.length()); 
		}
		catch(Exception e) {
		   System.err.println(e);
		   System.out.println("MSD");
		   System.out.println(10/0);
		}
		System.out.println("Sudheer Babu");
		System.out.println("Meduri");
	}
}
