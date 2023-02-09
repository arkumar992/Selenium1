package homework;

import java.util.Scanner;

public class SumOfArryaUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] numbers= new int[4];
	
	int i=0;
	System.out.println("Enter numbers");
	
	for( int sum1 :numbers)

	{
		Scanner s = new Scanner(System.in);
		sum1=s.nextInt();
	i=i+sum1;	


	}
System.out.println("Sum:"+i);
	}

}
