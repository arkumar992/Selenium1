package day3;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	
	public static void findLargest() {
		

		System.out.println("Enter 1st number:");
		Scanner s = new Scanner(System.in);
		int input1 = s.nextInt();
		System.out.println("Enter 2nd number:");
		Scanner s1 = new Scanner(System.in);
		int input2 = s1.nextInt();
		System.out.println("Enter 3rd number:");
		Scanner s2 = new Scanner(System.in);
		int input3= s2.nextInt();
	if(input1>input2&&input1>input3)
	{
		System.out.println("Largest of three numbers :\n"+input1);
	}
	
	if(input2>input1&&input2>input3)
	{
		System.out.println("Largest of three numbers :\n"+input2);
	}
	
	

	if(input3>input1&&input3>input2)
	{
		System.out.println("Largest of three numbers :\n"+input3);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
findLargest();
		
	}

}
