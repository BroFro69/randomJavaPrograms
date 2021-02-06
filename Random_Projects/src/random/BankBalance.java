package random;

// Code from Java Programming 8th editon
// Date: 2-5-21
// Coded by Julius 
// Program takes bank balance and computes the yearly interest rate.

// Import Libraries
import java.util.Scanner;

// Main Class
public class BankBalance {
	
	public static void main(String[]args)
	{
		// Declare variabkes
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		
		// Ask user for bank balance
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter initial bank balance: ");
		balance = keyboard.nextDouble();
		
		// Ask user about next year's balance
		System.out.print("\nDo you want to see next year's balance?");
		System.out.print("(Enter 1 for yes, others for no.)");
		response = keyboard.nextInt();
		
		// Main While Loop
		while(response == 1)
		{
			//Math for the bank balance interest
			balance = balance + balance * INT_RATE;
			System.out.print("\nAfter year " + year + " at " + 
					INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			
			// Ask the user if they want to computer another year
			System.out.print("\nDo you want to see the balance " +
					"at the end of another year?");
			System.out.print("\n1 for yes other numbers for no: ");
			response = keyboard.nextInt();
			
		}
		
		System.out.print("\nProgram complete!");
		
	}

}
