package com.OOps;

//Create a base class named Employee with the following:
//Private fields:
//name (String),id (int),salary (double)
//Public getter and setter methods for all the fields to ensure encapsulation.
//A method displayInfo() that prints the employee's name, ID, and salary.
//2. Create a derived class named Manager that:
//Inherits from Employee 
//3. In the main() method:
//Create an object of the Employee class and set its values using the setter methods.

 class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    void display() {
		System.out.println("Employee Name :"+name);
		System.out.println("Employee ID   :"+id);
	  System.out.println("Employee Salary :"+salary);
    }
}
	
public class Manager{
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
 		e.setId(6);
		e.setName("sudheer");
		e.setSalary( 29000);
    	e.display();
    	
    	Employee e1=new Employee();

    	e1.setId(7);
    	e1.setName("Dhoni");

		e1.display();
	}
}
	
	

