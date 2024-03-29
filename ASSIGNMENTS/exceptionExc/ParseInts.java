package exceptionExc;

// reads a line of text and prints the integers in the line.

import java.util.Scanner;

public class ParseInts {

	public static void main(String[] args) {
		int val, sum=0;
		Scanner scan = new Scanner(System.in);

		
		//reads in a line of input
		System.out.println("Enter a line of text: ");
		Scanner scanLine = new Scanner(scan.nextLine());
		
		// checks if there more tokens(words) available in the input which are to be scanned.
// this will just give result until the loop is terminated. exact results is not shown.
//		try {
//		while (scanLine.hasNext()) {
//			val = Integer.parseInt(scanLine.next());
//			// sums the integers
//			sum += val;
//		}
//		}catch(NumberFormatException e) {
//			
//		}
		
		// here, when an exception is thrown, the next sentence is the next iteration of loop
		// so correct result is produced.
		while (scanLine.hasNext()) {
			try {
				val = Integer.parseInt(scanLine.next());
				// sums the integers
				sum += val;
			}catch(NumberFormatException e) {
				
			}
		}
		// prints the sum
		System.out.println("The sum of the integers on this line is"+sum);
	}

}
