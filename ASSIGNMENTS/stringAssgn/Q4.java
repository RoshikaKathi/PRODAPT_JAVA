package stringAssgn;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a input: ");
		 String a = s.nextLine();
		 s.close();
		 String reversedString=reverseStringRecursively(a);
		 System.out.println("Original text:"+a);
		 System.out.println("Reversed text:"+reversedString);
	}
	//recursion
	public static String reverseStringRecursively(String a) {
		if(a.isEmpty()) {
			return a;
		}
		//method recursively calls itself with the substring
		//exclude the first character,append it to the end
		return reverseStringRecursively(a.substring(1))+a.charAt(0);
	}
	//iteration
//	public static void main(String[] args) {
//		String a="Happy";
//		String b="";
//		for(int i=a.length()-1;i>=0;i--) {
//			b+=(a.charAt(i));
//		}
//      System.out.println(b);
//	}
}
