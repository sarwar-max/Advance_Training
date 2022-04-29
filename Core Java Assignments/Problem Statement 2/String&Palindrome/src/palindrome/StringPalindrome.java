package palindrome;

import java.util.Scanner;

public class StringPalindrome {

	 public static void main(String args[])
	   {
	      String str;
	      int r,sum=0,temp;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	      System.out.println(length);
	      System.out.println(str.toUpperCase());
	      
	 temp=length;
	      while(length !=0) {
	    	  r = length % 10;
	    	  sum = sum * 10 + r;
	    	  length = length /10;
	      }
	      length=temp;
	      if (length==sum)
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }

}
