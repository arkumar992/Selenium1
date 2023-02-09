package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> bagprice =new ArrayList<Integer>();
		
		bagprice.add(999);
		bagprice.add(666);
		bagprice.add(545);
		bagprice.add(545);
		bagprice.add(545);
		bagprice.add(654);
		bagprice.add(666);
		bagprice.add(666);
		bagprice.add(999);
		
		Integer c = Collections.max(bagprice);		
		System.out.println("Maximum price of Bag\t"+c);
		
		
		/*for (int i=0; i<bagprice.length();i++ )
		{
			
		}*/
		
		

	}

}
