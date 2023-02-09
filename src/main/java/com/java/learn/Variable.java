package com.java.learn;

public class Variable {

	static int n =100;
	
	int k = 20;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable v = new Variable();
		Variable v2 = new Variable();
		Boolean one = false;
		
		System.out.println("Instance variable k "+ v.k);
		System.out.println("static variable n "+ n);
		System.out.println("Instance variable k "+ v2.k);
		
	System.out.println("Boolean value "+ one);
		
	
	int x=10;  
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(--x);//10  
	
	System.out.println("*******************");  
	
	for(int i=1;i<=10;i++){  
        if(i==5){  
        	
        	System.out.println("Test");
            //using continue statement  
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
    }  
	
	
	
		
	}

}
