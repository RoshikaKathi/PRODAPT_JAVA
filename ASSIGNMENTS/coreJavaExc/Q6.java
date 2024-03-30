package coreJavaExc;

public class Q6 {
	
	// recursive way
	
	public static int sumOfArray(int[] arr, int n) { //n: The current index being processed
		//base case
        if (n == 0) {
            return arr[n];
        } else {
            return arr[n] + sumOfArray(arr, n - 1);
            // We recursively call sumOfArray with the same array arr and the previous index n - 1.
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
		int sum = sumOfArray(myArray, myArray.length - 1);
		System.out.println("Sum of array elements: " + sum);
		}
}

		// non-recursive way
		
//		int sum = 0;
//		// creating new array with random inputs
//		int[] myArr = new int[10];
//		for(int i=0; i<myArr.length; i++) {
//			myArr[i]=((int)(Math.random()*100)+1);
//		}
//		// to show array
//		 for (int num : myArr) {
//	            System.out.print(num + " ");
//	        }
//		 System.out.println(); // Newline for clarity
//		 //sum of elements in array
//		for(int i=0; i<myArr.length; i++) {
//			sum=sum+myArr[i];
//		}
//		System.out.println("Sum of elements in array: "+sum);

