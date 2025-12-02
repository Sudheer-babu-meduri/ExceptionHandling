package com.xceptionHandling;

 class Exc0 extends Exception { 
	 
 } 
 class Exc1 extends Exc0 { 
	 
 }  
public class Student 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc0(); /* Line 9 */
        } 
        catch (Exc1 e1) /* Line 11 */
        {
            System.out.println("Ex1 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}