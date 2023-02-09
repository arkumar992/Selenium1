package day3;

import java.util.Scanner;

public class ArithmeticOperators {

	private static Scanner s;
	private static Scanner s1;

	public static void printAddition()
	{
		
	System.out.println("Enter 1st number:");
	Scanner s = new Scanner(System.in);
	int input1 = s.nextInt();
	System.out.println("Enter 2nd number:");
	Scanner s1 = new Scanner(System.in);
	int input2 = s1.nextInt();
	int res= input1+input2;
	System.out.println("Output of adding two numbers :"+res);

	}
	
	public static void printSubtraction()
	{
	
	System.out.println("Enter 1st number:");
	Scanner s = new Scanner(System.in);
	int input1 = s.nextInt();
	System.out.println("Enter 2nd number:");
	Scanner s1 = new Scanner(System.in);
	int input2 = s1.nextInt();
	
	int res= input1-input2;
	System.out.println("Output of subtracting two numbers :"+res);
	
	}
	
	public static void printMultiplication() {
		
		
	System.out.println("Enter 1st number:");
	Scanner s = new Scanner(System.in);
	int input1 = s.nextInt();
	System.out.println("Enter 2nd number:");
	Scanner s1 = new Scanner(System.in);
	int input2 = s1.nextInt();
	
	int res= input1*input2;
	System.out.println("Output of multiplying two numbers :"+res);
	
	
	}
	
	
	public static void printQuotient() {
		
		
	System.out.println("Enter 1st number:");
	Scanner s = new Scanner(System.in);
	int input1 = s.nextInt();
	System.out.println("Enter 2nd number:");
	Scanner s1 = new Scanner(System.in);
	int input2 = s1.nextInt();
	
	int res= input1/input2;
	System.out.println("Output of dividing two numbers :"+res);
	
	
	}
	
	
	
	public static void printReminder()
		{
		
		
		System.out.println("Enter 1st number:");
		s = new Scanner(System.in);
		int input1 = s.nextInt();
		System.out.println("Enter 2nd number:");
		s1 = new Scanner(System.in);
		int input2 = s1.nextInt();
		int res= input1%input2;
		System.out.println("Reminder for two numbers :"+res);
		
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	printAddition();
	printSubtraction();
	printMultiplication();
	printQuotient();
	printReminder();
	
			
	
	}

}
