package basics_exmble;

import java.util.Scanner;

public class AmstrongNumber {//1 5 3,(1*1*1)(5*5*5)(3*3*3)
	public static void main(String[] args) {
		int n,c=0,temp,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Given number is Amstrong Number");
		}
		else {
			System.out.println("Given number is not an Amstrong Number");
		}
	}

}
