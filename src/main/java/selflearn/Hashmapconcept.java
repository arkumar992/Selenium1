package selflearn;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer , String> m = new HashMap<Integer , String>();
		
		m.put(0, "First");
		m.put(2, "First");
		m.put(3, "First");
		m.put(1, "Last");
		m.put(3, "test");
		m.put(3, "");
		m.put(null, "");
		m.put(null, "");
		
		System.out.println(m);
		
		System.out.println(m.get(3));
		System.out.println(m.get(4));
		System.out.println(m.get(1));
		m.remove(2);
		System.out.println(m);
		for (Entry h : m.entrySet())
		{
			System.out.println(h.getKey()+" "+ h.getValue());
			
		}
		HashMap<Integer,Employee_arrylist> j = new HashMap<Integer,Employee_arrylist>();
		
	    Employee_arrylist e = new Employee_arrylist("arun", 1,"testing");
	    Employee_arrylist e1 = new Employee_arrylist("suresh", 2,"Dev");
	    Employee_arrylist e3 = new Employee_arrylist("rama", 3,"Public");
	    j.put(1, e);
	    j.put(5, e1);
	    j.put(3, e3);
	    
	    for (Entry<Integer,Employee_arrylist> k : j.entrySet()){
	    	
	    	System.out.println("Employee list order "+k.getKey());
	    	Employee_arrylist l = k.getValue();
	    	System.out.println(l.name +" "+ l.age + " "+ l.dt); 
	    	
	    	
	    	
	    
	    }
	    
		
		
	}

}
