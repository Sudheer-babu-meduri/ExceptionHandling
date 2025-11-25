package com.OOps;

import java.util.Scanner;

class Student {
    // private variables (data hiding)
    private String name;
    private int age;

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive! "+age+" is not convinience");
        }
    }
}
public class TestEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();    // runtime input
        s.setName(name);

        System.out.print("Enter student age: ");
        int age = sc.nextInt();         // runtime input
        s.setAge(age);

        // Getting values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        sc.close();
    }
}
