package random;

// Import Libraries
import java.util.*;
import java.io.*;

public class PriorityQueueArray {

	PriorityQueue<int[][]> heap = new PriorityQueue<int[][]>((a, b) -> {
		if (a[0][0] > b[0][0]) {
			return 1;
		}else if (a[0][0] < b[0][0]) {
			return -1;
		}else {
			return 0;
		}
	});
	
}
