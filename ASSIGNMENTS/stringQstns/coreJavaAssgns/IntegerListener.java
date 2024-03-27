package coreJavaAssgns;
import java.util.Scanner;

//Listener interface for handling integer matches
interface NumberListener {
 void onNumberFound(int number, int index);
}

//Class to find integers in an array
class NumberFinder {
 private int[] array;
 private NumberListener listener;

 public NumberFinder(int[] array, NumberListener listener) {
     this.array = array;
     this.listener = listener;
 }

 public void findNumber(int target) {
     for (int i = 0; i < array.length; i++) {
         if (array[i] == target) {
             listener.onNumberFound(target, i);
         }
     }
 }
}

//Example usage
public class IntegerListener {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Create an array (you can modify this as needed)
     int[] myArray = { 10, 20, 30, 40, 50 };

     // Create a listener to handle number matches
     NumberListener myListener = new NumberListener() {
         @Override
         public void onNumberFound(int number, int index) {
             System.out.println("Found " + number + " at index " + index);
         }
     };

     // Create a NumberFinder instance
     NumberFinder finder = new NumberFinder(myArray, myListener);

     System.out.print("Enter an integer to search for: ");
     int targetNumber = scanner.nextInt();

     // Find the target number in the array
     finder.findNumber(targetNumber);

  

     scanner.close();
 }
}