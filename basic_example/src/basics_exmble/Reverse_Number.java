package basics_exmble;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=scan.nextInt();
		}
		for(int i=array.length;i>=0;i--) {
			System.out.print(array[i]);
		}
		}

	

}
