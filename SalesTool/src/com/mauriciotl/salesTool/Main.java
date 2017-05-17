package com.mauriciotl.salesTool;

public class Main {

	public static void main(String[] args) {

		SalesData salesData = new SalesData();
		
		displayGreeting();
		
		salesData.display();
		
	}
	
	
	public static void displayGreeting(){
		
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA.");
		
	}

}
