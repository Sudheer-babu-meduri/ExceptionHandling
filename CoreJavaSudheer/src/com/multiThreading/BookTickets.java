package com.multiThreading;

class BookMyShow{
	int total_Tickets=100;
	
	synchronized void bookseats(int seats) {
		if(seats<=total_Tickets) {
			System.out.println("Your "+seats+" Tickets Has Been Booked ");
			total_Tickets = total_Tickets-seats;
			System.out.println("Remaining Available Tickets are "+total_Tickets);
			System.out.println();
		}else {
			System.err.println("Available Tickets are only "+total_Tickets);
		}
	}
}


public class BookTickets extends Thread{
	static BookMyShow b;
	int seats;
	@Override
	public void run() {

		b.bookseats(seats);
	  }

	public static void main(String[] args) {
        b=new BookMyShow();
		
		BookTickets s1 =new BookTickets();
		BookTickets s2 =new BookTickets();
		BookTickets s3 =new BookTickets();
		BookTickets s4 =new BookTickets();
		BookTickets s5 =new BookTickets();
		BookTickets s6 =new BookTickets();
		BookTickets s7 =new BookTickets();
		BookTickets s8 =new BookTickets();

		s1.seats=8;
		s2.seats=12;
		s3.seats=14;
		s4.seats=10;
		s5.seats=15;
		s6.seats=25;
		s7.seats=35;
		s8.seats=18;
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		s7.start();
		s8.start();
 
	 }

}
