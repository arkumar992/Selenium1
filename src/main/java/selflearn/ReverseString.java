package selflearn;

import java.util.Scanner;

public class ReverseString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your string");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		StringBuffer b = new StringBuffer(a);
		StringBuffer c;
		c=b.reverse();
	 	
		System.out.println("Your reverse string : "+c);
		
		s.close();
		String d = c.toString();
		//String e = a.toString();
		//System.out.println(e);
		System.out.println(d);
		if(d.equals(a))
		{
		
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not palindrome");
		}
		
		
		System.out.println("Method two without inbult method ************");
		String p ="";
		
		for(int i= a.length()-1;i>=0;i--) {
			
			char y = a.charAt(i);
			p =p+y;
			
			
		}
		
		System.out.println("value of p is " +p);
		if(a.equals(p))
		{
		
			System.out.println("P is Palindrome");
		}
		
		else
		{
			System.out.println("P is Not palindrome");
		}
	}
	
	public void sum()
	{
		System.out.println("0 parameter");
	}
	
	public void sum(int x)
	{
		System.out.println("int parameter");
	}

	public void sum(String S)
	{
		System.out.println("String parameter");
	}
	
	
	
	
}
