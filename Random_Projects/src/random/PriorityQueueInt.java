package random;

// Code from Geeks for Geeks

// Import Libraries
import java.util.*;
import java.io.*;

public class PriorityQueueInt {
	
	public static void main (String[]args) {
		
		// Creating an empty PriorityQueue
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// Use add() method to add elements into the Queue
		queue.add(10);
		queue.add(15);
		queue.add(30);
		queue.add(20);
		queue.add(5);
		queue.add(25);
		
		// Displaying the PriorityQueue
		System.out.print("\nThe PriorityQueue: " + queue);
		
		// Creating the array and using toArray()
		Object[] arr = queue.toArray();
		
		System.out.println("\nThe array is: ");
		for (int j =0; j < arr.length; j++)
			System.out.println(arr[j]);
		
	}

}
