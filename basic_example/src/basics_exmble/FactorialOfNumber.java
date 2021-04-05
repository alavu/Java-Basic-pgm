package basics_exmble;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
	
int fact=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
for(int i=1;i<n;i++) {
	fact=fact*i;
}
System.out.println("factorial of "+n+" is:"+fact);
	}
}
