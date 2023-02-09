package selflearn;

import java.util.Scanner;

class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter your string");
		Scanner s = new Scanner(System.in);
		String  a = s.nextLine();
		String input = a+" " ;
		System.out.println(input);		
		int Numberofwords =0;
		
		for (int i =0;i<input.length();i++)
		{
			char c =  input.charAt(i);
			
				if (c == ' ')
				{
					Numberofwords++;
					
				}
					
		}	
		
		System.out.println(Numberofwords);
		
		int firstindex =0; //3
		int currestsentence =0;
		
		String words[] = new String[Numberofwords];
		
		for (int i =0; i<input.length();i++)
		{
			char c =  input.charAt(i);
			
			if (c == ' ')
			{
				String word = input.substring(firstindex, i);
				words[currestsentence]= word;
				currestsentence++;
				firstindex = i+1;
				
			}
				
		}
			System.out.println(words[0]);
	}

}
