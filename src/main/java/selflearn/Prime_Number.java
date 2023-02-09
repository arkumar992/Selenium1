package selflearn;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		boolean isTrue = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a=s.nextInt();
		s.close();
		
		
		if(a>0)
		{
		for (int i=2;i<=a/2;i++)
		{
			b = a%i;
			if(b==0 )
			{
				isTrue=false;
				break;
			}
			
			
		}
		if(isTrue && a!=1)
			
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
		
	}
		else
		{
			System.out.println("Enter the postive number");
			
		}
		
		
	}
}
