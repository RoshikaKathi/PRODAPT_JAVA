package coreJavaExc;

public class Q7 {
	public  static int smallestValue(int[] arr,int n) {
		if (n==0) {
			return arr[n];
		}else {
			int restMin = smallestValue(arr, n - 1); // Recursive call for the rest of the array
            return Math.min(arr[n], restMin); // Compare current element with restMin
        }
	}
	public static void main(String[] args) {
		// creating new array with random inputs
		int[] myArray = new int[10];
		for(int i=0; i<myArray.length; i++) {
			myArray[i]=((int)(Math.random()*100)+1);
		}
		// To show array
		for (int num : myArray) {
			System.out.print(num + " ");
			}
		System.out.println(); // Newline for clarity
		// printing smallest value of array
		int min= smallestValue(myArray, myArray.length-1);
		System.out.println("The smallest value in array is: "+min);
	}
}
