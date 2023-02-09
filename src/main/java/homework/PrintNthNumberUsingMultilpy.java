package homework;

import java.util.Scanner;

public class PrintNthNumberUsingMultilpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize variables
System.out.println("Enter the 1st number");
Scanner s =new Scanner(System.in);
int input1= s.nextInt();
System.out.println("Enter the nth number");
Scanner s1 =new Scanner(System.in);
int inpu2= s.nextInt();
for(int i=1;i<=inpu2;i++)
{
	int res = i*input1;
System.out.println(i+"*"+input1+"="+res);
	
	
}
}
}