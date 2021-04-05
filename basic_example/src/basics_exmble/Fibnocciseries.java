package basics_exmble;

import java.util.Scanner;

public class Fibnocciseries {
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of fibnocciseries");
		int length=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<length;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
		
	}

}
