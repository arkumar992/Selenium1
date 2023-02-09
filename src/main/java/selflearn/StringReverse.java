package selflearn;

public class StringReverse {
	
	public static void main(String[] args)
	{
		String C = "arunkumar";
		
		char a;
		
		
		System.out.println("Reverse string: ");
		for (int i = C.length()-1;i>=0;i--)
		{
			a= C.charAt(i);
			 System.out.print(a);
		}

	
		
	}
	
}
