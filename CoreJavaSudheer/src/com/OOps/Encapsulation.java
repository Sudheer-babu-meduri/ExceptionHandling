package com.OOps;

//
//public class Encapsulation {
//
//  private String name;
//  private int rollNo;
//  
//  
//  
//  
//  public void setName(String name) {
//	  this.name = name;
//  }
// //calling these all methods in another class SetAndGet
//  public String getName() {
//	return name;
//}
//  
//  public int getRollNo() { 
//	  return rollNo;
//  }
//  public void setRollNo(int rollNo) {
//	  this.rollNo = rollNo;
//  }
// 
//  public void display() {
//	  System.out.println("Displaying Details :");
//	  System.out.println("Name :"+getName());
//	  System.out.println("Name :"+ getRollNo());
//  } 
//}
//
//
//



class Encapsulation {
    // private fields
    private int id;
    private String name;

    // setter for id
    public void setId(int i) {
        id = i;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // setter for name
    public void setName(String n) {
        name = n;
    }

    // getter for name
    public String getName() {
        return name;
    }
    public void insert(Encapsulation obj, int id, String name) {
       setId(id);
         setName(name);
    }

    // method to update values
//    public void update(Encapsulation obj, int id, String name) {
//        setId(id);
//        setName(name);
//    }
    
    public void display() {
    	
    	System.out.println("Name  :"+getName());
    	System.out.println("ID  :"+getId());
    	
    }
    
    
    
}
