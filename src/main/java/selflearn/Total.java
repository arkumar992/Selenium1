package selflearn;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your number");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();		
		char b;
		int f;
		 int temp =0;	
//		 b= a.charAt(3);
//		 System.out.println(b);
		// int C[] = new int[a.length()];
		for(int i = 0;i<a.length();i++) 
		{
			b= a.charAt(i);
			f=Character.getNumericValue(b);
			int c=b;
			//C[i]=b;
//			System.out.println(b);
			temp = temp+f;
			
		}
		System.out.println(temp);
		
		System.out.println("*****************");
		
		
		 
		 String o[] = new String[5];
		
		for(int i = 0;i<5;i++) 
		{
			 String d ="c"+i+i;
			 
			 o[i]=d;
			
			
		}
		
		System.out.println("test : " +o[4]);
		
		System.out.println("*****************");
		
	 countchar("arunarty",'r');
		
		
	}
	
	
	public static int countchar(String str, char ab)

	{
		int count =0;
		
		while (str.indexOf(ab)!=-1)
		{
			count++;
			str = str.substring((str.indexOf(ab)));
			System.out.println("old str is " + str);
			str = str.substring((str.indexOf(ab)+1));
			System.out.println("str is " + str);
			
			int c = (str.indexOf(ab));
			System.out.println("c is " + c);
		}
		return count;
	}
	
	
}
