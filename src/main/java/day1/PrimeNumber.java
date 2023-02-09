package day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value of n:");
		Scanner s = new Scanner(System.in);
		int  n = s.nextInt();
		for(int i=2;i<n;i++)
		{
			int s1;
			if((i%2)==1)
			{
			s1=i/2;
				if(s1%2!=0)
				{
			System.out.println(i);
				}
			}
		}
		
	}
}


