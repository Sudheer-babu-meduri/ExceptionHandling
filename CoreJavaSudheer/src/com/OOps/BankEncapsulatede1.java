package com.OOps;

import java.util.Scanner;

public class BankEncapsulatede1 {

	
		public static void main(String[] args) {
			 
			Scanner s=new Scanner(System.in);
			System.out.println("Enter account holder name :");
			String name=s.nextLine();
			System.out.println("Enter account number :");
			String number=s.next();
			System.out.println("Enter initial balance");
			double balance=s.nextDouble();
			
			
			BankEncapsulated be=new BankEncapsulated();
			be.setDetails(name, number, balance);
//			be.getdetails();
			boolean flag=true;
			while(flag) {
				System.out.println("*****Enter Your Choice******");
				System.out.println("1.Show Account Details");
				System.out.println("2.Balance Checking");
				System.out.println("3.Withdraw Amount");
				System.out.println("4.Deposit Amount");
				System.out.println("5.Exit");
				
				  
				 int choice=s.nextInt();
				 
				 
				 switch(choice) {
				 
				 case 1:
					 be.getdetails();
				 break;
				 
				 case 2:
					 System.out.println("Your Account Balance :"+be.getBalance());
				  break;
					
				 case 3:
					 System.out.println("Enter withdraw amount");
					 double withdraw=s.nextDouble();
					 be.withdraw(withdraw);
				  break;
					 
				 case 4:
					 System.out.println("Enter  deposit amount");
					 double deposit=s.nextDouble();
					 be.deposit(deposit);
				  break;
				 
				 case 5:
				    System.out.println("thank you for interacting us");
				    s.close();
//				    return;
				    flag=false;
				    default:
				    	System.out.println("Please choose only the above options!!");
				    
				 } 
			}	
		}
	}

