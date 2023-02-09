package selflearn;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(200);
		ar.add(500);
		ar.add(300);
		int a;
		int b;
		//ar.remove(2);
		System.out.println("value "+ar.get(4));
		for(int i=0;i<ar.size();i++)
		{
			for(int j=i+1;j<ar.size();j++)
			{
				a=ar.get(i);
				b=ar.get(j);
				
				if(a==b)
				{
					ar.remove(j);
				}
			}
			
			//System.out.println(ar.get(i));
		}
		System.out.println(ar);
		System.out.println("*****************************");
		ArrayList<E> ar1 = new ArrayList<E>();
		ar1.add(0, null);
		ar1.add(1, null);
		System.out.println("value "+ar1.get(1));
		
		System.out.println("***********iterator concept******************");
		//employee clss object
		Employee_arrylist e1 = new Employee_arrylist("arun",25,"dev");
		Employee_arrylist e2 = new Employee_arrylist("kumar",26,"test");
		Employee_arrylist e3 = new Employee_arrylist("suresh",27,"overall");
		
		//create array list
		
		ArrayList<Employee_arrylist> li = new ArrayList<Employee_arrylist>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		//iterator to traverse
		
		Iterator<Employee_arrylist> it =li.iterator();
		while(it.hasNext())
		{
			Employee_arrylist emp= it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dt);
		}
		
		System.out.println("*****************************");
ArrayList<String> ak1 = new ArrayList<String>();
		
		ak1.add("arun");
		ak1.add("200");
		ak1.add("300");
		
ArrayList<String> ak2 = new ArrayList<String>();
		
		ak2.add("true");
		ak2.add("false");
				
		ak1.addAll(ak2);
		
		for(int i=0;i<ak1.size();i++)
		{
			System.out.println(ak1.get(i));
		}
		
		
		
		
	}

}
