package coreJavaAssgns;

public class Search {
	 public static void main(String[] args) {
	        IntegerSearch integerSearch = new IntegerSearch();
	        StringSearch stringSearch = new StringSearch();
	 
	        Object[] integerArray = {1, 2, 3, 4, 5};
	        Object[] stringArray = {"apple", "banana", "custard apple"};
	 
	        int searchInt = 3;
	        String searchString = "watermelon";
	 
	        System.out.println("Searching for integer " + searchInt + ": " + integerSearch.search(integerArray, searchInt));
	        System.out.println("Searching for string '" + searchString + "': " + stringSearch.search(stringArray, searchString));
	    }
}
