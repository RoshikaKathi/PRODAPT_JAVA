package exceptionExc;

import java.util.Scanner;

//reads integers from the user and prints the factorials of each.

public class Factorials {
	public static void main(String[] args) {
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		
		while (keepGoing.equals("y")||keepGoing.equals("Y")) {
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			System.out.println("Factorial(" + val + ")=" + MathUtils.factorial(val));
			System.out.println("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}
}
