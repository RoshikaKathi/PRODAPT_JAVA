package stringAssgn;

public class Q1 {
	public static void main(String[] args) {
		 String str = "1234";
	            if (containsOnlyDigits(str)) {
	                System.out.println("It contains digit only");
	            } else if (containsOnlyLetters(str)) {
	                System.out.println("It contains string only");
	            } else {
	                System.out.println("It contains string as well digits");
	            }
	        }
	    
	
	    public static boolean containsOnlyDigits(String str) {
	        return str.matches("[0-9]+");
	    }
	
	    public static boolean containsOnlyLetters(String str) {
	        return str.matches("[a-zA-Z]+");
	    }
}
