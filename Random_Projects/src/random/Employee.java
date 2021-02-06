package random;

// Code from Java Programming Book
// Date: 2-5-21
// If Else statement


public class Employee {
	
	// Declare Variables
	
	private int empNum;
	private double payRate;
	public int MAX_EMP_NUM = 9999;
	public double MAX_RATE = 60.00;
	
	//If Else Function
	
	Employee(int num, double rate)
	{
		if(num <= MAX_EMP_NUM)
			empNum = num;
		else
			empNum = MAX_EMP_NUM;
		if(payRate <= MAX_RATE)
			payRate = rate; 
		else
			payRate = 0;
		
	}
	
	// Gets the number from the employee
	public int getEmpNum()
	{
		return empNum;
	}
	
	// Gets the pay rate for the employee
	public double getPayRate()
	{
		return payRate;
	}
	
}
