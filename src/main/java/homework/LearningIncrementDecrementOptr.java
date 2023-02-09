package homework;

import java.util.Scanner;

public class LearningIncrementDecrementOptr {

	public static void increment() {
	System.out.println("Enter 1st number:");
	Scanner s = new Scanner(System.in);
	int input1 = s.nextInt();
	System.out.println("Enter 2nd number:");
	Scanner s1 = new Scanner(System.in);
	int input2 = s1.nextInt();
	if(input1>input2)
	{
		System.out.println(--input1);
	}
	else if(input2>input1)
	{
		System.out.println(input2--);
	}
		else
			System.out.println(input1--);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		increment();
	}

}
