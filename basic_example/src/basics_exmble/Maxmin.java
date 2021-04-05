package basics_exmble;

import java.util.Scanner;

public class Maxmin {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();	
			
			
	}
		int max=a[0];
		int min =a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}else if(min>a[i]){
			min=a[i];
			
		}
		}
		
		System.out.println("Maximum number = " 
		         + max + " Minimum number = " + min);
	}
	}
		


