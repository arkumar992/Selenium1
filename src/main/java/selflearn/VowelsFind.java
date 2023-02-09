package selflearn;

import java.util.ArrayList;

public class VowelsFind {
	
	ArrayList<Character> al;
	
	VowelsFind(){
		
		al = new ArrayList<Character>();
		
		al.add('A');
		al.add('E');
		al.add('I');
		al.add('O');
		al.add('U');
		
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');		
		
	}
	
	public  boolean countVowels(char c) {
		
		for(int i = 0 ; i<al.size();i++)
		{
			if(c == al.get(i))
			{
				return true;
				
			}
			
		
		}
		
		return false;
	}
	
	public int countvowel(String s)
	{
		int noofvowel =0 ;
		int size = s.length();
		System.out.println("size is "+size);
		for(int j=0;j<size;j++)
		{
			char c = s.charAt(j);
			if(countVowels(c))	
			{
				noofvowel =	noofvowel+1;
			}
				
		}
		
		return noofvowel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VowelsFind d = new VowelsFind();
		
		int s= d.countvowel("adi");
		System.out.println("no of vowels "+s);
		
		
		String u = "teSt";
		System.out.println("Check contains case sensitive "+ u.contains("est"));
		
		System.out.println("Check "+ u.toUpperCase() + u.substring(1, 3));
	
		

	}

}
