package com.java.learn;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++){  
	        if(i==5){  
	        	
	        	System.out.println("test conti"+i);  
	        	
	            //using continue statement  
	           //continue;//it will skip the rest statement  
	            //break;
	            
	        }  
	        
	        System.out.println("*******************");
	        System.out.println(i);  
	    }  

		new ContinueTest().test(5);
		
		
	}

}

class ContinueTest
{
	
	int s;
	void test(int n)
	
	{
		s=n;
		System.out.println("the n value "+s);
	}
	
	


}

