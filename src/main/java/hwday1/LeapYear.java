package hwday1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the year to check whether it is a leap year or not");
		Scanner scanObj= new Scanner(System.in);
		int n= scanObj.nextInt();
		while(n>0)
		{
			if((n%400==0)||(n%4==0&&n%100!=0))
				
			{
				
				
			System.out.println("Enter year is a leap year");
			
			}
			else
			{
				System.out.println("Entered year is not a leap year");
			}
			
			break;}
		
		
	}

}
