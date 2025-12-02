package com.xceptionHandling;
public class MSDHONI {
    public static void main(String[] args) {
        System.out.println("main method start");
        System.out.println("Testmethod() : "+testMethod());
    }

    public static int testMethod() {
        try {
            System.out.println("Inside try block");
            return 10; // return from try
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
