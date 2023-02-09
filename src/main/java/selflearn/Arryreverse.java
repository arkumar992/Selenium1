package selflearn;

import org.apache.poi.xdgf.usermodel.section.geometry.RelMoveTo;

public class Arryreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strDays[] = {"Sunday", "Monday", "Monday","Tuesday", "12","Monday"}; 
		int i = strDays.length-1;
		/*for(i=i;i>=0;i--)
		{
			String j = strDays[i];
			System.out.println("Reverse string: ");
			for (int c = j.length()-1;c>=0;c--)
			{
				System.out.print(j.charAt(c));
			}
			System.out.println();
		}*/
		System.out.println("***************");
		int a;
		int b;
		for(a=0;a<=i;a++)
		{
			
			String fir = strDays[a];
			for(b=a+1;b<=i;b++)
			{
				String sec = strDays[b];
				
				if(fir.equalsIgnoreCase(sec))
				{
					strDays[b]="";
				}
			
			}
		}
		
		for(String s : strDays)
			
		System.out.println(s);
		

	}

}
