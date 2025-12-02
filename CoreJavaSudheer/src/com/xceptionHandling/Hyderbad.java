package com.xceptionHandling;

public class Hyderbad {
    public static void main(String [] args) 
    {
        try 
        {
           badMethod();  
            System.out.print("A"); 
        } 
       
        catch (Exception ex) 
        {
            System.err.print("B");
        } 
        catch(Error e) {
            System.err.println("Error happened");
        }
          catch(Throwable t) {
        	System.out.println("Throwable caught");
        }
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() 
    {
        throw new Error(); 
    } 
}