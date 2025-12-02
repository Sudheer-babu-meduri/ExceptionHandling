package com.xceptionHandling;
class A {
    void show() { System.out.println("A"); }
    void display() {System.out.println("Display A");}
}

class B extends A {
    void display() { System.out.println("Display B"); }
}

public class Test {
	
    public static void main(String[] args) {
//        A a = new B();     // upcasting
//        B b = (B) a;       // downcasting

//        b.display();       // child-specific method
    	
    	 A a = new A();   // Parent object
         B b = (B) a;  // causes ClassCastException
    	 a.display();
    }
}
