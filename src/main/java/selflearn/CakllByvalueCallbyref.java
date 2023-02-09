package selflearn;

import java.util.Hashtable;

public class CakllByvalueCallbyref {

	int n ;
	int j ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakllByvalueCallbyref obj = new CakllByvalueCallbyref();
		int h =5;
		int g =7;
		int i = obj.test(h, g);
		System.out.println(i);
		
		// before call by reference
		obj.n=100;
		obj.j=90;
		System.out.println("before swap n = "+ obj.n);
		System.out.println("before swap j = "+ obj.j);
		
		obj.swap(obj);
		//after call by reference
		
		System.out.println("after swap n = "+ obj.n);
		System.out.println("after swap j = "+ obj.j);
		
		System.out.println("********HashTable concept*************");
		
		Hashtable<Integer,Integer> f = new Hashtable<Integer,Integer>();
		
		f.put(100, 100);
		f.put(300, 8);
		f.put(200, 8);
		System.out.println(f.size());
		
		
			System.out.println(f.get(200));
			

			
		
		

	}
	
	public int test(int x, int y)
	{
		int c;
		/*x=20;
		y=20;*/
		c= x+y;
		return c;
		
	}

	public void swap(CakllByvalueCallbyref t)  // -- call by reference
	{
		int temp ;
		temp = t.n;
		t.n=t.j;
		t.j=temp;
		
		
	}
	
	

	
	
	
	
	
}
