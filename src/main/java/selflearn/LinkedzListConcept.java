package selflearn;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedzListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(200);
		System.out.println("List all "+li);
		li.addFirst(500);
		li.addLast(1900);
		System.out.println("List all "+li);
		System.out.println(li.get(3));
		li.set(3, 700);
		System.out.println(li.get(3));
		System.out.println("for loop-------------------");
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("for each-------------------");
		
		for(int n : li)
		{
			System.out.println(n);
			
		}
		
		System.out.println("iterator------------------");
		Iterator<Integer> in =li.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
		System.out.println("while loop------------------");
		
		int num =0;
		while(li.size()>num)
		{
			System.out.println(li.get(num));
			num++;
		}
		
		
		
		
		System.out.println("Removed 4 th index-------------------");
		
		li.remove(4);
		
		System.out.println("List all "+li);
	}
	

}
