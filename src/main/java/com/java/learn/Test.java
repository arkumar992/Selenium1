package com.java.learn;

public class Test {

	
	  public static void foo() { 
	        System.out.println("Test.foo() called "); 
	    } 
	    public void foo(int a) { // Compiler Error: cannot redefine foo() 
	        System.out.println("Test.foo(int) called "); 
	    } 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.foo(); 
		Student s1 = new Student();
		int n= s1.id;
	
		String s= s1.name;
		System.out.println(n + s);
	}

}


class Student{  
	 int id;  
	 String name;  
	}  