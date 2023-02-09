package homework;

import java.util.Scanner;

public class MyTryUsingArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = new int[10];
		System.out.println("Enter 10 numbers");
		int res=0;
		for(int i=0;i<input.length;i++) 
		
		{
			Scanner scan = new Scanner(System.in);
		
			input[i] = scan.nextInt();
 res= res+input[i];	
 }
		
		System.out.println("sum:"+res);
	
			
		}
	

}
