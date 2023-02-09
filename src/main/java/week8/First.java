package week8;

import org.apache.poi.util.SystemOutLogger;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// String name = "ramuknura";
		char[] in = "ramuknura".toCharArray();
		
		System.out.println(in);
		System.out.println(in.length-1);
		for (int i =in.length-1; i>=0;i-- )
			System.out.print(in[i]);
		
	}

}
