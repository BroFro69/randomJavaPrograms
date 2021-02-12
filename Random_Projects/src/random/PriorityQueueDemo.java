package random;

// Exmaple from Geeks For Geeks 

// Import Libraries
import java.util.*;

public class PriorityQueueDemo {
	
	public static void main(String[]args) {
		
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		
		// Printing the top element of PriorityQueue
		System.out.print(pQueue.peek());
		
		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.print(pQueue.poll());
		
		// Printing the top element again
		System.out.print(pQueue.peek());
		
	}

}
