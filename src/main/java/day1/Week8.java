package day1;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;



public class Week8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> mydata = new  ArrayList<Object>();
		
		//String[] r = {"kumar20M","Arun26M","Female25F"};
		
		mydata.add("Kumar20M");
		mydata.add("Arun26M");
		mydata.add("Female25F");
		
		System.out.println("input : "+ mydata);	
		
		List<Object> newlist = new  ArrayList<Object>();
		List<Object> mydata1 = new  ArrayList<Object>();
		
		for (int i =0; i<mydata.size();i++)
		{
			
			String first = mydata.get(i).toString();
			String sex = first.substring(first.length()-1,first.length());
			String name = first.replaceAll("[0-9]", "");
			name = name.substring(0, name.length()-1);
			String age = first.replaceAll("[a-zA-Z]", "");
			mydata1.add(name);
			mydata1.add(age);
			mydata1.add(sex);
			newlist.add(mydata1);
			System.out.println("output " + mydata1);
			mydata1 = new ArrayList<Object>();
		}
			
		
		for (Object str:newlist) {
			
			System.out.println("output finanl" + str.toString());
		}
			
		String a = "meow";
		String b = a +"deal";
		String c = "meowdeal";
		System.out.println(b.equals(c));
		
		}
	
	
	
		
	}



