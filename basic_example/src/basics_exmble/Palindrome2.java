package basics_exmble;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
	  String original,reverse="";
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the string/number here:");
	  original=sc.nextLine();
	  int length=original.length();
	  for(int i=length-1;i>=0;i--) {
		  reverse=reverse+original.charAt(i);
	  }
		  if(original.equals(reverse)) 
		  {
			  System.out.println("String/number is palindrome");
		  } else 
				  System.out.println("String/number is not palindrome");
			  
		  
	  
	}}
	
	
	
