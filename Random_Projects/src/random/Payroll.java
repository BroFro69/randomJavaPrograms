package random;

// Code from Java Programming 8th Edition
// Date: 2-5-21
// Coded by Julius 
// This program takes input from a user and displays thier wage for the week

// Import Libraries
import java.util.Scanner;

public class Payroll {
	
	// Declare main function
	public static void main(String[]args){
		
		// Declare Variables
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;
		
		// Ask user for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hours did you work this week? ");
		hoursWorked = keyboard.nextDouble();
		
		// Ask User for the Pay Rate
		System.out.print("\nWhat is your regular pay rate? ");
		rate = keyboard.nextDouble();
		
		// If Statement to check for overtime
		if(hoursWorked > FULL_WEEK)
		{
			// Math for pay and over time pay
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK)* OT_RATE * rate;
		}
		else
		{
			// Math for Regular pay (No OT)
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
		}
		System.out.print("\nRegular pay is " +
				regularPay + "\nOvertime pay is "+ overtimePay);

	}

}

